package com.example.Entities;

/**
 * Created by nav on 02-01-16.
 */
public class Position
{
    private String course;

    private String dateTime;

    private String speed;

    private String quality;

    private String hdop;

    private String numSattellites;

    private String rDy;

    private String unitId;

    private String rDx;

    public String getCourse ()
    {
        return course;
    }

    public void setCourse (String course)
    {
        this.course = course;
    }

    public String getDateTime ()
    {
        return dateTime;
    }

    public void setDateTime (String dateTime)
    {
        this.dateTime = dateTime;
    }

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    public String getQuality ()
    {
        return quality;
    }

    public void setQuality (String quality)
    {
        this.quality = quality;
    }

    public String getHdop ()
    {
        return hdop;
    }

    public void setHdop (String hdop)
    {
        this.hdop = hdop;
    }

    public String getNumSattellites ()
    {
        return numSattellites;
    }

    public void setNumSattellites (String numSattellites)
    {
        this.numSattellites = numSattellites;
    }

    public String getRDy ()
    {
        return rDy;
    }

    public void setRDy (String rDy)
    {
        this.rDy = rDy;
    }

    public String getUnitId ()
    {
        return unitId;
    }

    public void setUnitId (String unitId)
    {
        this.unitId = unitId;
    }

    public String getRDx ()
    {
        return rDx;
    }

    public void setRDx (String rDx)
    {
        this.rDx = rDx;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [course = "+course+", dateTime = "+dateTime+", speed = "+speed+", quality = "+quality+", hdop = "+hdop+", numSattellites = "+numSattellites+", rDy = "+rDy+", unitId = "+unitId+", rDx = "+rDx+"]";
    }
}