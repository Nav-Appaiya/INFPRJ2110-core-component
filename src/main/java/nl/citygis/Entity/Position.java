package nl.citygis.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nav on 03-01-16.
 */
public class Position {

    /**
     * numSattellites : 10
     * dateTime : 2014-03-10
     * rDy : 386623.268053997
     * rDx : 161766.58056834
     * unitId : 999
     * course : 353.0
     * hdop : 11
     * speed : 3.0
     * quality : Gps
     */
    @JsonProperty("numSattellites")
    private int numSattellites;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("rDy")
    private String rDy;
    @JsonProperty("rDx")
    private String rDx;
    @JsonProperty("unitId")
    private int unitId;
    @JsonProperty("course")
    private String course;
    @JsonProperty("hdop")
    private int hdop;
    @JsonProperty("speed")
    private String speed;
    @JsonProperty("quality")
    private String quality;

    public void setNumSattellites(int numSattellites) {
        this.numSattellites = numSattellites;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setRDy(String rDy) {
        this.rDy = rDy;
    }

    public void setRDx(String rDx) {
        this.rDx = rDx;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setHdop(int hdop) {
        this.hdop = hdop;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getNumSattellites() {
        return numSattellites;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getRDy() {
        return rDy;
    }

    public String getRDx() {
        return rDx;
    }

    public int getUnitId() {
        return unitId;
    }

    public String getCourse() {
        return course;
    }

    public int getHdop() {
        return hdop;
    }

    public String getSpeed() {
        return speed;
    }

    public String getQuality() {
        return quality;
    }
}
