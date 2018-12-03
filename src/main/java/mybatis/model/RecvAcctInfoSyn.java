package mybatis.model;

public class RecvAcctInfoSyn {
    private String custId;

    private String merId;

    private String merUsrId;

    private String acctStatus;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getMerUsrId() {
        return merUsrId;
    }

    public void setMerUsrId(String merUsrId) {
        this.merUsrId = merUsrId;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }
}