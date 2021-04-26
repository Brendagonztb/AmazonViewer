package amazonviewer;

public class Chapter 
{
    private int id;
    private String title;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;
    
    public Chapter(String title, int duration, short year )
    {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public int getDuration() 
    {
        return duration;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    public short getYear() 
    {
        return year;
    }

    public void setYear(short year) 
    {
        this.year = year;
    }

    public boolean isViewed() 
    {
        return viewed;
    }

    public void setViewed(boolean viewed) 
    {
        this.viewed = viewed;
    }

    public int getTimeViewed() 
    {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) 
    {
        this.timeViewed = timeViewed;
    }

    public int getSessionNumber() 
    {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) 
    {
        this.sessionNumber = sessionNumber;
    }
    
    
}
