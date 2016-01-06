package nl.citygis.Entity.JsonTemplates;

/**
 * Created by IntelliJ IDEA
 * User: Nav Appaiya
 * Date: 05-01-16
 * Time: 18:54
 */
public class EventTemplate implements java.io.Serializable {
    private static final long serialVersionUID = -282537480708811823L;
    private String min;
    private String max;
    private int unitId;
    private String sum;
    private String beginTime;
    private String endTime;
    private String type;

    public String getMin() {
        return this.min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return this.max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public int getUnitId() {
        return this.unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getSum() {
        return this.sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}