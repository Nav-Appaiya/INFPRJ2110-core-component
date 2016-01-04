package Citygis.OldEntities;

/**
 * Created by nav on 02-01-16.
 */
public class Monitoring
{
    private String min;

    private String max;

    private String sum;

    private String beginTime;

    private String type;

    private String endTime;

    private String unitId;

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMax ()
    {
        return max;
    }

    public void setMax (String max)
    {
        this.max = max;
    }

    public String getSum ()
    {
        return sum;
    }

    public void setSum (String sum)
    {
        this.sum = sum;
    }

    public String getBeginTime ()
    {
        return beginTime;
    }

    public void setBeginTime (String beginTime)
    {
        this.beginTime = beginTime;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getEndTime ()
    {
        return endTime;
    }

    public void setEndTime (String endTime)
    {
        this.endTime = endTime;
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
        return "ClassPojo [min = "+min+", max = "+max+", sum = "+sum+", beginTime = "+beginTime+", type = "+type+", endTime = "+endTime+", unitId = "+unitId+"]";
    }
}


