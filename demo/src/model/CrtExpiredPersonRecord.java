package model;

import java.util.Date;

public class CrtExpiredPersonRecord {
    private String id;

    private String crtExpiredRecordId;

    private String amlBeneficiaryId;

    private String fileRecordId;

    private String handleType;

    private String otcDerivCtptyId;

    private Date validDateStartOld;

    private Date validDateEndOld;

    private Date validDateStartNew;

    private Date validDateEndNew;

    private Date createdDatetime;

    private String entityType;

    private String name;

    private String idKind;

    private String idNo;

    private String entityId;

    private String category;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrtExpiredRecordId() {
        return crtExpiredRecordId;
    }

    public void setCrtExpiredRecordId(String crtExpiredRecordId) {
        this.crtExpiredRecordId = crtExpiredRecordId;
    }

    public String getAmlBeneficiaryId() {
        return amlBeneficiaryId;
    }

    public void setAmlBeneficiaryId(String amlBeneficiaryId) {
        this.amlBeneficiaryId = amlBeneficiaryId;
    }

    public String getFileRecordId() {
        return fileRecordId;
    }

    public void setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }

    public String getOtcDerivCtptyId() {
        return otcDerivCtptyId;
    }

    public void setOtcDerivCtptyId(String otcDerivCtptyId) {
        this.otcDerivCtptyId = otcDerivCtptyId;
    }

    public Date getValidDateStartOld() {
        return validDateStartOld;
    }

    public void setValidDateStartOld(Date validDateStartOld) {
        this.validDateStartOld = validDateStartOld;
    }

    public Date getValidDateEndOld() {
        return validDateEndOld;
    }

    public void setValidDateEndOld(Date validDateEndOld) {
        this.validDateEndOld = validDateEndOld;
    }

    public Date getValidDateStartNew() {
        return validDateStartNew;
    }

    public void setValidDateEndNew(Date validDateEndNew) {
        this.validDateEndNew = validDateEndNew;
    }

    public  String getEntityType(){return entityType;}

    public void setEntityType(){this.entityType = entityType;}

    public String getName() {
        return name;
    }

    public void setIdKind(String idKind) {
        this.idKind = idKind;
    }

    public String getIdKind() {
        return idKind;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}