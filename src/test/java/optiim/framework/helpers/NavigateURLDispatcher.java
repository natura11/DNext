package optiim.framework.helpers;

import optiim.framework.Props;
import optiim.framework.UrlBuilder;

import java.util.ArrayList;

public class NavigateURLDispatcher {
    public ArrayList<NavigateURL> urls = new ArrayList<>();

    public NavigateURLDispatcher(ArrayList<NavigateURL> urls) {
        this.urls = urls;
    }

    public NavigateURL findFreeFrontEndURL() {
        NavigateURL resUrl = null;
        if (System.getProperty("BUILD_ID") != null) {
            int res = urls.get(0).getFrontEndProgressCount();
            resUrl = urls.get(0);
            for (NavigateURL url : urls) {
                if (url.getFrontEndProgressCount() < res) {
                    res = url.getFrontEndProgressCount();
                    resUrl = url;
                }
            }
            resUrl.increaseFrontEndProgressCount();
            System.out.println("fe process count: " + resUrl.getFrontEnd() + " " + resUrl.getFrontEndProgressCount());
        } else {
            UrlBuilder.getBaseGatewayURI();
            resUrl = new NavigateURL(Props.getProp("site.url"), Props.getProp("api.url"));
        }
        return resUrl;
    }

    public NavigateURL findFreeBackEndURL() {
        NavigateURL resUrl = null;
        if (System.getProperty("BUILD_ID") != null) {
            int res = urls.get(0).getBackEndProgressCount();
            resUrl = urls.get(0);
            for (NavigateURL url : urls) {
                if (url.getBackEndProgressCount() < res) {
                    res = url.getBackEndProgressCount();
                    resUrl = url;
                }
            }
            resUrl.increaseBackEndProgressCount();
            System.out.println("process count: " + resUrl.getBackEnd() + " " + resUrl.getBackEndProgressCount());
        } else {
            UrlBuilder.getBaseGatewayURI();
            resUrl = new NavigateURL(Props.getProp("site.url"), Props.getProp("api.url"));
        }
        return resUrl;
    }


}
