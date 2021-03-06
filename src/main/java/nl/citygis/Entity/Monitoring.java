package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nav on 03-01-16.
 */
public class Monitoring {

    /**
     * min : 27024.23
     * max : 35480.5
     * unitId : 57
     * sum : 1902215.0
     * beginTime : 2012-03-10
     * endTime : 2015-08-25
     * type : Gps/GpsGyroMean
     */
    @JsonProperty("min")
    private String min;
    @JsonProperty("max")
    private String max;
    @JsonProperty("unitId")
    private int unitId;
    @JsonProperty("sum")
    private String sum;
    @JsonProperty("beginTime")
    private String beginTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("type")
    private String type;

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
