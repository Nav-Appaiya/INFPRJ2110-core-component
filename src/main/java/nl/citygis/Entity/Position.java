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

    public int getNumSattellites() {
        return numSattellites;
    }

    public void setNumSattellites(int numSattellites) {
        this.numSattellites = numSattellites;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRDy() {
        return rDy;
    }

    public void setRDy(String rDy) {
        this.rDy = rDy;
    }

    public String getRDx() {
        return rDx;
    }

    public void setRDx(String rDx) {
        this.rDx = rDx;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getHdop() {
        return hdop;
    }

    public void setHdop(int hdop) {
        this.hdop = hdop;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
