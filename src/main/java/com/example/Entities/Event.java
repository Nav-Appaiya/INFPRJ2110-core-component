package com.example.Entities;

/**
 * Created by nav on 02-01-16.
 */
public class Event
{
    private String port;

    private String dateTime;

    private String value;

    private String unitId;

    public String getPort ()
    {
        return port;
    }

    public void setPort (String port)
    {
        this.port = port;
    }

    public String getDateTime ()
    {
        return dateTime;
    }

    public void setDateTime (String dateTime)
    {
        this.dateTime = dateTime;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getUnitId ()
    {
        return unitId;
    }

    public void setUnitId (String unitId)
    {
        this.unitId = unitId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [port = "+port+", dateTime = "+dateTime+", value = "+value+", unitId = "+unitId+"]";
    }
}
