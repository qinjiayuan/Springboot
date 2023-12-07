package model;

import java.util.Date;

public class CrtExpiredRecordUnion {
    private String id;

    private String clientId;

    private String crtExpiredRecordId;

    private Date createTime;

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

    public String getCrtExpiredRecordId() {
        return crtExpiredRecordId;
    }

    public void setCrtExpiredRecordId(String crtExpiredRecordId) {
        this.crtExpiredRecordId = crtExpiredRecordId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}