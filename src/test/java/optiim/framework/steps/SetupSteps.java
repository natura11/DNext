package optiim.framework.steps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import optiim.api.testauto.TestAutoApi;
import optiim.framework.Props;
import optiim.framework.UrlBuilder;
import optiim.framework.helpers.*;
import optiim.models.api.jira.Evidence;
import optiim.models.api.jira.Info;
import optiim.models.api.jira.Test;
import optiim.models.api.jira.XRAYExecutionResults;
import optiim.models.api.login.JIRALoginRequest;
import optiim.models.data.GetData;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.utils.log;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.PickleStepTestStep;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.TestCase;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import static io.restassured.RestAssured.given;
import static java.util.stream.Collectors.toList;

public class SetupSteps {
    WebDriverHelper webDriverHelper;
    private final WorldHelper worldHelper;
    boolean ontheFly = false;
    int runid = 0;
    ArrayList<String> suiteList = new ArrayList<String>();
    boolean located = false;

    public SetupSteps(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        this.webDriverHelper = webDriverHelper;
        this.worldHelper = worldHelper;
    }

    private static NavigateURLDispatcher navigator = new NavigateURLDispatcher(urlSplitToArrayList());

    private static ArrayList<NavigateURL> urlSplitToArrayList() {

        ArrayList<NavigateURL> nu = new ArrayList<>();

        if (System.getProperty("BUILD_ID") != null) {
            String fe[] = System.getProperty("cloneFrontEnd").split("[\\n\\s]");
            String be[] = System.getProperty("cloneBackEnd").split("[\\n\\s]");

            if (fe.length != 0) {
                for (int i = 0; i < fe.length; i++) {
                    nu.add(new NavigateURL(fe[i], be[i]));
                }
            }
        } else {
            UrlBuilder.getBaseGatewayURI();
            nu.add(new NavigateURL(Props.getProp("site.url"), Props.getProp("api.url")));
        }
        return nu;
    }


//    @Before
//    public void setup(Scenario s) throws IOException, APIException {
//
//
//        ontheFly = System.getProperty("BUILD_ID") == null ? false : true;
//        System.out.println("on the fly value:" + ontheFly);
//        System.out.println("Build id: " + System.getProperty("BUILD_ID"));
//        System.out.println("Build Number: " + System.getProperty("BUILD_NUMBER"));
//
//        worldHelper.setFrontEndURL(navigator.findFreeFrontEndURL().getFrontEnd());
//        //Backend için setleniyor
//        Props.setNavigator(navigator);
//        System.out.println("This scenario is running on frontend: " + worldHelper.getFrontEndURL());
//
//        log.info("URI" + s.getUri());
//        Collection<String> scenarioTagcollection = s.getSourceTagNames();
//        List<String> scenarioList = scenarioTagcollection.stream().collect(toList());
//     //   log.info("scenario ID:" + scenarioList.get(3));
////            Iterator<String> iterator = scenarioTagcollection.iterator();
////            while (iterator.hasNext()) {
////                String test1 = iterator.next();
////                System.out.println("value= " + test1);
////                if(test1.contains("@C")){
////                    log.info("test1 bulduk test idsini" + test1);
////                }
////            }
//
//
//        log.info("TagNames" + s.getSourceTagNames());
//        log.info("Line" + s.getLine());
//        log.info("Status" + s.getStatus());
////            log.info("ID" + s.getId());
//        log.info("Name" + s.getName());
//
//     //   APIClient client = new APIClient("https://testrail.optiim.com.tr/"); //burası değişecek
//     //   client.setUser("serdar.kayis@optiim.com");
//     //   client.setPassword("optiim123");
//
////        for(String str: suiteList) {
////            log.info("suiteList iterated:" + str + " testid:" + scenarioList.get(1));
////            if(str.contains(System.getProperty("BUILD_NUMBER") + ":" + scenarioList.get(1))){
////                located = true;
////            }
////        }
////        Map data = new HashMap();
////        data.put("include_all", new Boolean(false));
////        data.put("case_ids", addcases);
////        JSONObject d = null;
////        d = (JSONObject) client.sendGet("get_run/" + runid, data);
////        GET index.php?/api/v2/get_runs/:project_id
////        GET index.php?/api/v2/get_run/:run_id
//
////        if (located) {
////            log.info("in suite located");
//
//
////            List addcases = new ArrayList();
////            addcases.add(new Integer((scenarioList.get(3).split("C"))[1]));
////            Map data = new HashMap();
////            data.put("include_all", new Boolean(false));
////            data.put("case_ids", addcases);
////            JSONObject d = null;
////            log.info("updaterun:" + GetData.RUNID + "caseid:" +addcases.get(0));
////            d = (JSONObject) client.sendPost("update_run/" + GetData.RUNID, data);
////            log.info("updaterun result" + d.toString());
//
//
////        }
////        else {
////            log.info("in suite not located");
////            List crmcases = new ArrayList();
////            crmcases.add(new Integer((scenarioList.get(3).split("C"))[1]));
////            Map data4 = new HashMap();
////            data4.put("suite_id", 6);
////            data4.put("name", System.getProperty("BUILD_NUMBER") + ":" + scenarioList.get(1));
////            data4.put("case_ids", crmcases);
////            data4.put("include_all", new Boolean(false));
////            data4.put("description", "This run is created by Automation Job");
////            data4.put("assignedto_id", 5);
////
////            JSONObject d = null;
////
////            d = (JSONObject) client.sendPost("add_run/" + 2, data4);
////            log.info(d.toString());
////            log.info("crmrunid:" + d.get("id"));
////            runid = Integer.parseInt(d.get("id").toString());
////        }
//
//        if(!scenarioList.get(2).contains("api")){
//            webDriverHelper.setupController();
//        }
//
//    }

    @Before
    public void setup(Scenario s) {

        Props props = new Props();

        if (props.getProp("execution.env").contains("remote")) {

            JIRALoginRequest jlr = new JIRALoginRequest();
            jlr.setClientId("BCDCF10D1A3A43979A003018953E4FE7");
            jlr.setClientSecret("cfab4afe123bdfb36576e16ea5c358d9425af51c0ebafdcd3bc362deea9b0cd1");
            if (GetData.token.equals("")) {
                GetData.token = TestAutoApi.getToken(jlr);
                log.info("generated token:" + GetData.token);
            } else {
                log.info("token already there not need to create");
            }

        }


        Collection<String> scenarioTagcollection = s.getSourceTagNames();
        List<String> scenarioList = scenarioTagcollection.stream().collect(toList());
        log.info("scenario ID:" + scenarioList.get(3));
        //GetData.ENVIRONMENT = scenarioList.get(2);

        if (!scenarioList.get(2).contains("api")) {
            webDriverHelper.setupController();
        }

    }

    @After
    public void teardown(Scenario s) throws Exception {
        log.info("@after");

        log.info("URI " + s.getUri());
        log.info("TagNames " + s.getSourceTagNames());
        log.info("Line " + s.getLine());
        log.info("Status " + s.getStatus());
        log.info("ID " + s.getId());
        log.info("Name " + s.getName());

        Collection<String> scenarioTagcollection = s.getSourceTagNames();
        List<String> scenarioList = scenarioTagcollection.stream().collect(toList());
        log.info("scenario ID:" + scenarioList.get(3));
        String status1 = s.getStatus().name();
        log.info("status ? " + status1);

//        if(s.getStatus().toString().contains("FAILED")){
//            try {
//                File srcFile = ((TakesScreenshot) webDriverHelper.getDriver()).getScreenshotAs(OutputType.FILE);
//                System.out.println("File:" + srcFile);
//                org.apache.commons.io.FileUtils.copyFile(srcFile, new File("target/screenshot-" + new java.util.Date().getTime() + ".png"));
//            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
//                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//            } catch (java.io.IOException ioe){
//                System.err.println("ioexception: " + ioe.getMessage());
//            }
//        }



        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss" + "+01:00");
        Timestamp timestampFirst = new Timestamp(System.currentTimeMillis());
        System.out.println(sdf.format(timestampFirst));

        Props props = new Props();



        if (props.getProp("execution.env").contains("remote") && status1.equals("PASSED")) {

            Info info = new Info();
            info.setSummary("Execution of automated tests Smoke Set");
            info.setDescription("This execution is automatically created");
            info.setUser("Ufuk Akay");
            info.setRevision("1.0.42134");
            info.setStartDate(sdf.format(timestampFirst));
            info.setFinishDate(sdf.format(timestampFirst));
            info.setTestPlanKey("VFALFT-15492");

            XRAYExecutionResults xrayer = new XRAYExecutionResults();
            xrayer.settestExecutionKey(props.getProp("jira.testexecution.id"));
            xrayer.setInfo(info);
            List<Test> tests = new ArrayList<Test>();
            Test test = new Test();
            StringBuilder sb = new StringBuilder(scenarioList.get(3));
            test.setTestKey(sb.deleteCharAt(0).toString());
            test.setComment("Successful execution by Automation");
            test.setStart(sdf.format(timestampFirst));
            test.setFinish(sdf.format(timestampFirst));
            test.setStatus("" + s.getStatus());
            tests.add(test);
            xrayer.setTests(tests);
            xrayer.setInfo(info);

            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
            String jsonBody = gsonBuilder.toJson(xrayer);
            log.info("Build Edilen JSON" + jsonBody);

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost("https://xray.cloud.xpand-it.com/api/v2/import/execution");
            StringEntity params = new StringEntity(jsonBody);

            post.setHeader("Content-Type", "application/json;charset=utf-8");
            String serdar1 = "Bearer " + GetData.token.replaceAll("\"", "");
            post.setHeader("Authorization", serdar1);
            post.setEntity(params);

//            HttpResponse response = client.execute(post);
//            int statusCode = response.getStatusLine().getStatusCode();
//            System.out.println("Status Code : " + statusCode);

            Response responseRest;
            responseRest = given().header("Content-Type", "application/json").header("Accept", "application/json").header("Authorization", serdar1).
                        body(jsonBody).
                        when().
                        post("https://xray.cloud.xpand-it.com/api/v2/import/execution");
            System.out.println("Status Code : " + responseRest.getStatusCode());

//            log.info("X-RateLimit-Limit:" + responseRest.getHeaders("X-RateLimit-Limit")[0]);
//            log.info("X-RateLimit-Remaining:" + response.getHeaders("X-RateLimit-Remaining")[0]);
//            log.info("X-RateLimit-Reset:" + response.getHeaders("X-RateLimit-Reset")[0]);

        }
        if (props.getProp("execution.env").contains("remote") && status1.equals("FAILED")) {
            StringBuilder sb = getError(s);
            XRAYExecutionResults xrayer = new XRAYExecutionResults();

            log.info("scenario ID FAILED:" + scenarioList.get(3));
            if (scenarioList.get(2).contains("api")) {
                Info info = new Info();
                info.setSummary("Execution of automated tests Smoke Set");
                info.setDescription("This execution is automatically created");
                info.setUser("Ufuk Akay");
                info.setRevision("1.0.42134");
                info.setStartDate(sdf.format(timestampFirst));
                info.setFinishDate(sdf.format(timestampFirst));
                info.setTestPlanKey("VFALFT-15492");

                xrayer.settestExecutionKey(props.getProp("jira.testexecution.id"));
                xrayer.setInfo(info);
                List<Test> tests = new ArrayList<Test>();
                Test test = new Test();
                StringBuilder sbo = new StringBuilder(scenarioList.get(3));
                test.setTestKey(sbo.deleteCharAt(0).toString());
                test.setComment("Failed execution by Automation" + "\n" + sbo.toString());
                test.setStart(sdf.format(timestampFirst));
                test.setFinish(sdf.format(timestampFirst));
                test.setStatus("" + s.getStatus());
                tests.add(test);
                xrayer.setTests(tests);
                xrayer.setInfo(info);
            }else {
                takeSnapShot((RemoteWebDriver) webDriverHelper.getDriver(), "target/" + new StringBuilder(scenarioList.get(3)).deleteCharAt(0).toString() + ".jpg");
                byte[] fileContent = FileUtils.readFileToByteArray(new File("target/" + new StringBuilder(scenarioList.get(3)).deleteCharAt(0).toString() + ".jpg"));
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                Info info = new Info();
                info.setSummary("Execution of automated tests Smoke Set");
                info.setDescription("This execution is automatically created");
                info.setUser("Ufuk Akay");
                info.setRevision("1.0.42134");
                info.setStartDate(sdf.format(timestampFirst));
                info.setFinishDate(sdf.format(timestampFirst));
                info.setTestPlanKey("VFALFT-15492");

//                XRAYExecutionResults xrayer = new XRAYExecutionResults();
                xrayer.settestExecutionKey(props.getProp("jira.testexecution.id"));
                xrayer.setInfo(info);
                List<Test> tests = new ArrayList<Test>();
                Test test = new Test();
                StringBuilder sba = new StringBuilder(scenarioList.get(3));
                test.setTestKey(sba.deleteCharAt(0).toString());
                test.setComment("Failed execution by Automation" + "\n" + sb.toString());
                test.setStart(sdf.format(timestampFirst));
                test.setFinish(sdf.format(timestampFirst));
                test.setStatus("" + s.getStatus());
                tests.add(test);
                List<Evidence> evidences = new ArrayList();
                Evidence evidence = new Evidence();
                evidence.setContentType("image/jpeg");
                evidence.setData(encodedString);
                evidence.setFilename(new StringBuilder(scenarioList.get(3)).deleteCharAt(0).toString() + ".jpg");
                evidences.add(evidence);
                test.setEvidences(evidences);
                xrayer.setTests(tests);
                xrayer.setInfo(info);
            }
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
            String jsonBody = gsonBuilder.toJson(xrayer);
            log.info("Build Edilen JSON" + jsonBody);

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost("https://xray.cloud.xpand-it.com/api/v2/import/execution");
            StringEntity params = new StringEntity(jsonBody);


            post.addHeader("Content-Type", "application/json");
            String serdar1 = "Bearer " + GetData.token.replaceAll("\"", "");
            post.addHeader("Authorization", serdar1);

            post.setEntity(params);
//            HttpResponse response = client.execute(post);
//            int statusCode = response.getStatusLine().getStatusCode();
//            System.out.println("Status Code : " + statusCode);

            Response responseRest;
            responseRest = given().header("Content-Type", "application/json").header("Accept", "application/json").header("Authorization", serdar1).
                    body(jsonBody).
                    when().
                    post("https://xray.cloud.xpand-it.com/api/v2/import/execution");
            System.out.println("Status Code : " + responseRest.getStatusCode());

//            log.info("X-RateLimit-Limit:" + response.getHeaders("X-RateLimit-Limit")[0]);
//            log.info("X-RateLimit-Remaining:" + response.getHeaders("X-RateLimit-Remaining")[0]);
//            log.info("X-RateLimit-Reset:" + response.getHeaders("X-RateLimit-Reset")[0]);

        }

        if (!scenarioList.get(2).contains("api")) {
            webDriverHelper.teardownController();
        }


    }




    @AfterSuite
    public void afterSuite() {
        log.info("After suite");
    }

    public StringBuilder getError(Scenario scenario) throws IllegalAccessException, NoSuchFieldException {
//        PickleWrapper pw = (PickleWrapper) scenario.
        final Field field = FieldUtils.getField(Scenario.class, "delegate", true);
        TestCaseState tcs = ((TestCaseState) FieldUtils.getField(Scenario.class, "delegate", true).get(scenario));
        Field f2 = tcs.getClass().getDeclaredField("stepResults");
        f2.setAccessible(true);
        Field f3 = tcs.getClass().getDeclaredField("testCase");
        f3.setAccessible(true);
//        List<Result> pickles = (List<Result>) f3.get(tcs);
        List<Result> results = (List<Result>) f2.get(tcs);
        System.out.println("size" + results.size());

        TestCase tc1 = (TestCase) f3.get(tcs);
        Field f4 = tc1.getClass().getDeclaredField("testSteps");
        f4.setAccessible(true);
        List<PickleStepTestStep> picklesteps = (ArrayList<PickleStepTestStep>) f4.get(tc1);
        System.out.println("pickle step size:" + picklesteps.size());
        StringBuilder sb1 = new StringBuilder("Step Report for scenario: " + scenario.getId() + "\n");
        for (int i = 0; i < results.size(); i++) {
            log.info("i basalim" + i);
            if (i == 0) {
                sb1.append("" + i + results.get(i).getStatus() + results.get(i).getError() + "\n");
            }
            if (i < results.size() && i != 0) {
                sb1.append("" + i + results.get(i).getStatus() + results.get(i).getError() + " " + picklesteps.get(i - 1).getStep().getKeyWord() + " " + picklesteps.get(i - 1).getStep().getText() + "\n");
            }

        }

        return sb1;
    }


    public static void takeSnapShot(RemoteWebDriver webdriver, String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(SrcFile, new File("c:\\tmp\\screenshot.png"));

        //Move image file to new destination

        File DestFile = new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

    }

/*        @Before
        public void setup() {
            webDriverHelper.setupController();
        }

        @After
        public void teardown() {
            webDriverHelper.teardownController();
        }*/
}
