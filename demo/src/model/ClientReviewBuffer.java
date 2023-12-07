package model;

import java.util.Date;

public class ClientReviewBuffer {
    private String id;

    private String clientId;

    private Date reviewStartDate;

    private Date reviewBufferStart;

    private Date reviewBufferEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getReviewStartDate() {
        return reviewStartDate;
    }

    public void setReviewStartDate(Date reviewStartDate) {
        this.reviewStartDate = reviewStartDate;
    }

    public Date getReviewBufferStart() {
        return reviewBufferStart;
    }

    public void setReviewBufferStart(Date reviewBufferStart) {
        this.reviewBufferStart = reviewBufferStart;
    }

    public Date getReviewBufferEnd() {
        return reviewBufferEnd;
    }

    public void setReviewBufferEnd(Date reviewBufferEnd) {
        this.reviewBufferEnd = reviewBufferEnd;
    }
}