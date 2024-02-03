package optiim.framework;

import optiim.framework.helpers.WebDriverHelper;
import java.net.URI;
import java.net.URL;

public class UrlBuilder {
    //private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);
    private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";
    private static URL apiUrl;
    private WebDriverHelper webDriverHelper;

    static {
        Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);
    }

    public static URI getBasePathURIDCaseAPI() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("dcase.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURIDNext() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("dev.dcase.site.url"));
//                apiUrl = new URL(Props.getProp("dev.gks.site.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURISellCoaxAPI() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("sellcoax.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURIBPMN() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("bpmn.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURIDocsis() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("docsis.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURICoaxToken() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("coaxtoken.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURIDiamToken() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("diamtoken.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURIDJIRAAPI() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("jira.api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBasePathURI() {
        try{
            if (System.getProperty("BUILD_ID") != null) {
                apiUrl = new URL(Props.navigator.findFreeBackEndURL().getBackEnd());
            } else {
                apiUrl = new URL(Props.getProp("api.url"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return URI.create(apiUrl.toString());
    }

    public static URI getBaseGatewayURI() {
        return URI.create(Props.getProp("api.gateway"));
    }
}
