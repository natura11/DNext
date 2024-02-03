package optiim.framework.helpers;

public class NavigateURL {
    private String frontEnd;
    private String backEnd;
    private volatile int frontEndProgressCount;
    private volatile int backEndProgressCount;

    public NavigateURL(String frontEnd, String backEnd) {
        this.frontEnd = frontEnd;
        this.backEnd = backEnd;
        this.frontEndProgressCount = 0;
        this.backEndProgressCount = 0;
    }

    public String getFrontEnd() {
        return frontEnd;
    }

    public String getBackEnd() {
        return backEnd;
    }

    public int getFrontEndProgressCount() {
        return frontEndProgressCount;
    }

    public int getBackEndProgressCount() {
        return backEndProgressCount;
    }


    public void setFrontEnd(String frontEnd) {
        this.frontEnd = frontEnd;
    }

    public void setBackEnd(String backEnd) {
        this.backEnd = backEnd;
    }

    public synchronized void increaseFrontEndProgressCount() {
        System.out.println(this.backEnd + " = " + this.frontEndProgressCount + " will increase");
        this.frontEndProgressCount++;
    }

    public synchronized void increaseBackEndProgressCount() {
        System.out.println(this.backEnd + " = " + this.backEndProgressCount + " will decrease");
        this.backEndProgressCount++;
    }
}
