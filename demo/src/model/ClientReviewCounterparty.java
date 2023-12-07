package model;

import java.util.Date;

public class ClientReviewCounterparty {
    private String id;

    private String recordId;

    private String productName;

    private Date createdDatetime;

    private String clientId;

    private String ignore;

    private String benefitOverFlag;

    private String agreeInfo;

    private String allowBusiType;

    private String clientQualifyReview;

    private Short seq;

    private Date reviewBufferStart;

    private String supplementaryMaterialsNote;

    private String showNote;

    private String allowBusiTypeHis;

    private String manualDelAllowBusiType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public String getBenefitOverFlag() {
        return benefitOverFlag;
    }

    public void setBenefitOverFlag(String benefitOverFlag) {
        this.benefitOverFlag = benefitOverFlag;
    }

    public String getAgreeInfo() {
        return agreeInfo;
    }

    public void setAgreeInfo(String agreeInfo) {
        this.agreeInfo = agreeInfo;
    }

    public String getAllowBusiType() {
        return allowBusiType;
    }

    public void setAllowBusiType(String allowBusiType) {
        this.allowBusiType = allowBusiType;
    }

    public String getClientQualifyReview() {
        return clientQualifyReview;
    }

    public void setClientQualifyReview(String clientQualifyReview) {
        this.clientQualifyReview = clientQualifyReview;
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public Date getReviewBufferStart() {
        return reviewBufferStart;
    }

    public void setReviewBufferStart(Date reviewBufferStart) {
        this.reviewBufferStart = reviewBufferStart;
    }

    public String getSupplementaryMaterialsNote() {
        return supplementaryMaterialsNote;
    }

    public void setSupplementaryMaterialsNote(String supplementaryMaterialsNote) {
        this.supplementaryMaterialsNote = supplementaryMaterialsNote;
    }

    public String getShowNote() {
        return showNote;
    }

    public void setShowNote(String showNote) {
        this.showNote = showNote;
    }

    public String getAllowBusiTypeHis() {
        return allowBusiTypeHis;
    }

    public void setAllowBusiTypeHis(String allowBusiTypeHis) {
        this.allowBusiTypeHis = allowBusiTypeHis;
    }

    public String getManualDelAllowBusiType() {
        return manualDelAllowBusiType;
    }

    public void setManualDelAllowBusiType(String manualDelAllowBusiType) {
        this.manualDelAllowBusiType = manualDelAllowBusiType;
    }
}