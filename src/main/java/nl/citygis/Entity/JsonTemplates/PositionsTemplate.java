package nl.citygis.Entity.JsonTemplates;

public class PositionsTemplate implements java.io.Serializable {
    private static final long serialVersionUID = 1550279230016855067L;
    private int numSattellites;
    private String dateTime;
    private String rDy;
    private String rDx;
    private int unitId;
    private String course;
    private int hdop;
    private String speed;
    private String quality;

    public int getNumSattellites() {
        return this.numSattellites;
    }

    public void setNumSattellites(int numSattellites) {
        this.numSattellites = numSattellites;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRDy() {
        return this.rDy;
    }

    public void setRDy(String rDy) {
        this.rDy = rDy;
    }

    public String getRDx() {
        return this.rDx;
    }

    public void setRDx(String rDx) {
        this.rDx = rDx;
    }

    public int getUnitId() {
        return this.unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getHdop() {
        return this.hdop;
    }

    public void setHdop(int hdop) {
        this.hdop = hdop;
    }

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getQuality() {
        return this.quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
