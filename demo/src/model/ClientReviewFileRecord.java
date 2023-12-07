package model;

import java.util.Date;

public class ClientReviewFileRecord {
    private String s3FileId;

    private String otcDerivativeCounterpartyId;

    private String recordId;

    private String fileName;

    private Short fileSize;

    private String fileBelong;

    private String uploadActivity;

    private String createdUser;

    private Date createdDatetime;

    private String clientId;

    public String getS3FileId() {
        return s3FileId;
    }

    public void setS3FileId(String s3FileId) {
        this.s3FileId = s3FileId;
    }

    public String getOtcDerivativeCounterpartyId() {
        return otcDerivativeCounterpartyId;
    }

    public void setOtcDerivativeCounterpartyId(String otcDerivativeCounterpartyId) {
        this.otcDerivativeCounterpartyId = otcDerivativeCounterpartyId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Short getFileSize() {
        return fileSize;
    }

    public void setFileSize(Short fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileBelong() {
        return fileBelong;
    }

    public void setFileBelong(String fileBelong) {
        this.fileBelong = fileBelong;
    }

    public String getUploadActivity() {
        return uploadActivity;
    }

    public void setUploadActivity(String uploadActivity) {
        this.uploadActivity = uploadActivity;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
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
}