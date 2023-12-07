package model;

import java.util.Date;

public class CrtExpiredRecord {
    private String id;

    private String docId;

    private String title;

    private String clientId;

    private Date checkDate;

    private String currentStatus;

    private String currentOperator;

    private String currentActivityName;

    private String recordId;

    private String remindType;

    private String accessUser;

    private String editableUser;

    private Date createdDatetime;

    private String workPhone;

    private String phone;

    private String securityLevel;

    private String securityLevelDetail;

    private String urgencyLevel;

    private String urgencyLevelReason;

    private String hasStockTrading;

    private String unifiedsocialCode;

    private Short version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(String currentOperator) {
        this.currentOperator = currentOperator;
    }

    public String getCurrentActivityName() {
        return currentActivityName;
    }

    public void setCurrentActivityName(String currentActivityName) {
        this.currentActivityName = currentActivityName;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getRemindType() {
        return remindType;
    }

    public void setRemindType(String remindType) {
        this.remindType = remindType;
    }

    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public String getEditableUser() {
        return editableUser;
    }

    public void setEditableUser(String editableUser) {
        this.editableUser = editableUser;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getSecurityLevelDetail() {
        return securityLevelDetail;
    }

    public void setSecurityLevelDetail(String securityLevelDetail) {
        this.securityLevelDetail = securityLevelDetail;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getUrgencyLevelReason() {
        return urgencyLevelReason;
    }

    public void setUrgencyLevelReason(String urgencyLevelReason) {
        this.urgencyLevelReason = urgencyLevelReason;
    }

    public String getHasStockTrading() {
        return hasStockTrading;
    }

    public void setHasStockTrading(String hasStockTrading) {
        this.hasStockTrading = hasStockTrading;
    }

    public String getUnifiedsocialCode() {
        return unifiedsocialCode;
    }

    public void setUnifiedsocialCode(String unifiedsocialCode) {
        this.unifiedsocialCode = unifiedsocialCode;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }
}