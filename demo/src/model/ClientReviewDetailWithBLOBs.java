package model;

public class ClientReviewDetailWithBLOBs extends ClientReviewDetail {
    private String reviewLog;

    private String suitabilityLog;

    public String getReviewLog() {
        return reviewLog;
    }

    public void setReviewLog(String reviewLog) {
        this.reviewLog = reviewLog;
    }

    public String getSuitabilityLog() {
        return suitabilityLog;
    }

    public void setSuitabilityLog(String suitabilityLog) {
        this.suitabilityLog = suitabilityLog;
    }
}