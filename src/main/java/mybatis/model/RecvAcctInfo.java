package mybatis.model;

import java.math.BigDecimal;

public class RecvAcctInfo {
    private String custId;

    private String merId;

    private String merUsrId;

    private String acctAlias;

    private String acctStatus;

    private String lastUpdDate;

    private BigDecimal lastDayBal;

    private BigDecimal liqBal;

    private BigDecimal acctBal;

    private BigDecimal avlBal;

    private BigDecimal sepBal;

    private BigDecimal frzBal;

    private BigDecimal tmpBal;

    private BigDecimal trfBal;

    private String autoTrfMode;

    private BigDecimal holdAmt;

    private String openDate;

    private String openTime;

    private BigDecimal depBal;

    private BigDecimal cashLimit;

    private BigDecimal lastAvlBal;

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

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getLastUpdDate() {
        return lastUpdDate;
    }

    public void setLastUpdDate(String lastUpdDate) {
        this.lastUpdDate = lastUpdDate;
    }

    public BigDecimal getLastDayBal() {
        return lastDayBal;
    }

    public void setLastDayBal(BigDecimal lastDayBal) {
        this.lastDayBal = lastDayBal;
    }

    public BigDecimal getLiqBal() {
        return liqBal;
    }

    public void setLiqBal(BigDecimal liqBal) {
        this.liqBal = liqBal;
    }

    public BigDecimal getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(BigDecimal acctBal) {
        this.acctBal = acctBal;
    }

    public BigDecimal getAvlBal() {
        return avlBal;
    }

    public void setAvlBal(BigDecimal avlBal) {
        this.avlBal = avlBal;
    }

    public BigDecimal getSepBal() {
        return sepBal;
    }

    public void setSepBal(BigDecimal sepBal) {
        this.sepBal = sepBal;
    }

    public BigDecimal getFrzBal() {
        return frzBal;
    }

    public void setFrzBal(BigDecimal frzBal) {
        this.frzBal = frzBal;
    }

    public BigDecimal getTmpBal() {
        return tmpBal;
    }

    public void setTmpBal(BigDecimal tmpBal) {
        this.tmpBal = tmpBal;
    }

    public BigDecimal getTrfBal() {
        return trfBal;
    }

    public void setTrfBal(BigDecimal trfBal) {
        this.trfBal = trfBal;
    }

    public String getAutoTrfMode() {
        return autoTrfMode;
    }

    public void setAutoTrfMode(String autoTrfMode) {
        this.autoTrfMode = autoTrfMode;
    }

    public BigDecimal getHoldAmt() {
        return holdAmt;
    }

    public void setHoldAmt(BigDecimal holdAmt) {
        this.holdAmt = holdAmt;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public BigDecimal getDepBal() {
        return depBal;
    }

    public void setDepBal(BigDecimal depBal) {
        this.depBal = depBal;
    }

    public BigDecimal getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(BigDecimal cashLimit) {
        this.cashLimit = cashLimit;
    }

    public BigDecimal getLastAvlBal() {
        return lastAvlBal;
    }

    public void setLastAvlBal(BigDecimal lastAvlBal) {
        this.lastAvlBal = lastAvlBal;
    }
}