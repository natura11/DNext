package optiim;

import optiim.com.gurock.testrail.APIException;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import lombok.SneakyThrows;
import org.junit.runner.RunWith;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.io.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@teklif",
        features = "target/test-classes/com/examples",
        glue = {"classpath:com.examples"}

)
public class RunCucumberTest2 extends AbstractTestNGCucumberTests {
    private WorldHelper worldHelper;

//    @SneakyThrows
//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        log.info("dataprovider" + super.scenarios().length);
//        List emptycases = new ArrayList();
//        List cases = new ArrayList();
//
//        List isemricases = new ArrayList();
//        List teklifyonetimicases = new ArrayList();
//        List tahsilatcases = new ArrayList();
//        List crmcases = new ArrayList();
//
//        for (int i = 0; i < super.scenarios().length; i++) {
//            log.info("serdar:" + super.scenarios()[i][0].toString());
//            PickleWrapper pw = (PickleWrapper) super.scenarios()[i][0];
//            log.info(pw.getPickle().getName());
//            log.info(pw.getPickle().getTags().get(1));
//            log.info(pw.getPickle().getTags().get(3).split("C")[1]);
//            if (pw.getPickle().getTags().get(1).contains("crm")) {
//                crmcases.add(pw.getPickle().getTags().get(3).split("C")[1]);
//            }
//            if (pw.getPickle().getTags().get(1).contains("isemriyonetim")) {
//                isemricases.add(pw.getPickle().getTags().get(3).split("C")[1]);
//            }
//            if (pw.getPickle().getTags().get(1).contains("tahsilat")) {
//                tahsilatcases.add(pw.getPickle().getTags().get(3).split("C")[1]);
//            }
//            if (pw.getPickle().getTags().get(1).contains("teklifyonetimi")) {
//                teklifyonetimicases.add(pw.getPickle().getTags().get(3).split("C")[1]);
//            }
//            emptycases.add(pw.getPickle().getTags().get(3).split("C")[1]);
//
//        }
//        log.info(("test sizes:" + emptycases.size()));
//        APIClient client = new APIClient("https://testrail.optiim.com.tr/"); //burası değişecek
//        client.setUser("serdar.kayis@optiim.com");
//        client.setPassword("Kablotv123");
//
//        if (isemricases.size() > 0) {
////            Map data = new HashMap();
////            data.put("suite_id", 8);
////            data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "İsEmriYonetimi");
////            data.put("case_ids", isemricases);
////            data.put("include_all", new Boolean(false));
////            data.put("description", "This run is created by Automation Job");
////            data.put("assignedto_id", 5);
////
////            JSONObject d = null;
////            d = (JSONObject) client.sendPost("add_run/" + 2, data);
////            int runid = Integer.parseInt(d.get("id").toString());
////            log.info("run id:" + runid);
////            GetData.ISEMRI_RUNID = runid;
//            if (!fileExists("isemrirunid"+System.getProperty("BUILD_NUMBER")) ) {
//                Map data = new HashMap();
//                data.put("suite_id", 8);
//                data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "İsEmriYonetimi");
//                data.put("case_ids", isemricases);
//                data.put("include_all", new Boolean(false));
//                data.put("description", "This run is created by Automation Job");
//                data.put("assignedto_id", 5);
//
//                JSONObject d = null;
//                d = (JSONObject) client.sendPost("add_run/" + 2, data);
//                int runid = Integer.parseInt(d.get("id").toString());
//                log.info("run id:" + runid);
//                writeRunID("isemrirunid"+System.getProperty("BUILD_NUMBER"),runid);
//                GetData.ISEMRI_RUNID = runid;
//            } else {
//                GetData.ISEMRI_RUNID = readRunID("isemrirunid"+ System.getProperty("BUILD_NUMBER"));
//            }
//        }
//
//        log.info("crm sizes:" + crmcases.size());
//        if (crmcases.size() > 0) {
////            Map data = new HashMap();
////            data.put("suite_id", 6);
////            data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "CRM");
////            data.put("case_ids", crmcases);
////            data.put("include_all", new Boolean(false));
////            data.put("description", "This run is created by Automation Job");
////            data.put("assignedto_id", 5);
////
////            JSONObject d = null;
////
////            d = (JSONObject) client.sendPost("add_run/" + 2, data);
////            int runid = Integer.parseInt(d.get("id").toString());
////            log.info("run id:" + runid);
////            GetData.CRM_RUNID = runid;
//
//            if (!fileExists("crmrunid"+System.getProperty("BUILD_NUMBER")) ) {
//                Map data = new HashMap();
//                data.put("suite_id", 6);
//                data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "CRM");
//                data.put("case_ids", crmcases);
//                data.put("include_all", new Boolean(false));
//                data.put("description", "This run is created by Automation Job");
//                data.put("assignedto_id", 5);
//
//                JSONObject d = null;
//
//                d = (JSONObject) client.sendPost("add_run/" + 2, data);
//                int runid = Integer.parseInt(d.get("id").toString());
//                log.info("run id:" + runid);
////                Props.setCrmrunid(runid);
//                writeRunID("crmrunid"+System.getProperty("BUILD_NUMBER"),runid);
//                GetData.CRM_RUNID = runid;
//            } else {
//                GetData.CRM_RUNID = readRunID("crmrunid"+ System.getProperty("BUILD_NUMBER"));
//            }
//        }
//
//
//
//        log.info("tahsilat sizes:" + tahsilatcases.size());
//        if (tahsilatcases.size() > 0) {
////            Map data = new HashMap();
////            data.put("suite_id", 10);
////            data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "Tahsilat");
////            data.put("case_ids", tahsilatcases);
////            data.put("include_all", new Boolean(false));
////            data.put("description", "This run is created by Automation Job");
////            data.put("assignedto_id", 5);
////
////            JSONObject d = null;
////
////            d = (JSONObject) client.sendPost("add_run/" + 2, data);
////            int runid = Integer.parseInt(d.get("id").toString());
////            log.info("run id:" + runid);
////            GetData.TAHSILAT_RUNID = runid;
//            if (!fileExists("tahsilatrunid"+System.getProperty("BUILD_NUMBER")) ) {
//                Map data = new HashMap();
//                data.put("suite_id", 10);
//                data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "Tahsilat");
//                data.put("case_ids", tahsilatcases);
//                data.put("include_all", new Boolean(false));
//                data.put("description", "This run is created by Automation Job");
//                data.put("assignedto_id", 5);
//
//                JSONObject d = null;
//
//                d = (JSONObject) client.sendPost("add_run/" + 2, data);
//                int runid = Integer.parseInt(d.get("id").toString());
//                log.info("run id:" + runid);
//                writeRunID("tahsilatrunid"+System.getProperty("BUILD_NUMBER"),runid);
//                GetData.TAHSILAT_RUNID = runid;
//            } else {
//                GetData.TAHSILAT_RUNID = readRunID("tahsilatrunid"+ System.getProperty("BUILD_NUMBER"));
//            }
//        }
//
//        log.info("teklifyonetimi sizes:" + teklifyonetimicases.size());
//        if (teklifyonetimicases.size() > 0) {
////            Map data = new HashMap();
////            data.put("suite_id", 7);
////            data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "TeklifYonetimi");
////            data.put("case_ids", teklifyonetimicases);
////            data.put("include_all", new Boolean(false));
////            data.put("description", "This run is created by Automation Job");
////            data.put("assignedto_id", 5);
////
////            JSONObject d = null;
////
////            d = (JSONObject) client.sendPost("add_run/" + 2, data);
////            int runid = Integer.parseInt(d.get("id").toString());
////            log.info("run id:" + runid);
////            GetData.TEKLIFYONETIMI_RUNID = runid;
//
//            if (!fileExists("teklifyonetimirunid"+System.getProperty("BUILD_NUMBER")) ) {
//                Map data = new HashMap();
//                data.put("suite_id", 7);
//                data.put("name", "BuildNo:" + System.getProperty("BUILD_NUMBER") + ":" + "TeklifYonetimi");
//                data.put("case_ids", teklifyonetimicases);
//                data.put("include_all", new Boolean(false));
//                data.put("description", "This run is created by Automation Job");
//                data.put("assignedto_id", 5);
//
//                JSONObject d = null;
//
//                d = (JSONObject) client.sendPost("add_run/" + 2, data);
//                int runid = Integer.parseInt(d.get("id").toString());
//                log.info("run id:" + runid);
//                GetData.TEKLIFYONETIMI_RUNID = runid;
//                writeRunID("teklifyonetimirunid"+System.getProperty("BUILD_NUMBER"),runid);
//            } else {
//                GetData.TEKLIFYONETIMI_RUNID = readRunID("teklifyonetimirunid"+ System.getProperty("BUILD_NUMBER"));
//            }
//        }
//        return super.scenarios();
//    }

    @SneakyThrows
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void b4Suite(ITestContext tc) throws IOException, APIException {
        log.info("b4suite");
    }

    @BeforeClass
    public void b4Class(ITestContext tc) {
        log.info("b4class");
        log.info(tc.getSuite().getName());

    }

    public void writeRunID(String fileName, int runid) throws IOException {
        System.out.println("writerunid" + fileName + " " + runid);
        FileWriter writer = new FileWriter(fileName, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(String.valueOf(runid));
        bufferedWriter.close();
    }
    public int readRunID(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        String runid = "";


        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            runid = line;
        }
        System.out.println("runid is:" + runid);
        reader.close();
       return Integer.parseInt(runid);
    }

    public boolean fileExists(String fileName){
        File file = new File(fileName);
        return file.exists();
    }
}
