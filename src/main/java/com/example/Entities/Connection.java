package com.example.Entities;

/**
 * Created by nav on 02-01-16.
 */
public class Connection
{
    private String port;

    private String dateTime;

    private String[] permissions;

    private String value;

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

    public String[] getPermissions ()
    {
        return permissions;
    }

    public void setPermissions (String[] permissions)
    {
        this.permissions = permissions;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [port = "+port+", dateTime = "+dateTime+", permissions = "+permissions+", value = "+value+"]";
    }
}


