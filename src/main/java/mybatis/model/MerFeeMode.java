package mybatis.model;

public class MerFeeMode {
    private String merId;

    private String transType;

    private String calcMode;

    private String calcCond;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getCalcMode() {
        return calcMode;
    }

    public void setCalcMode(String calcMode) {
        this.calcMode = calcMode;
    }

    public String getCalcCond() {
        return calcCond;
    }

    public void setCalcCond(String calcCond) {
        this.calcCond = calcCond;
    }
}