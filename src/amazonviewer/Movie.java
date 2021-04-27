package amazonviewer;

public class Movie extends Film
{
    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }
    public void showData()
    {
       // System.out.println("Title : " + this.title);
        //System.out.println("Genre : " + this.genre);
        //System.out.println("Year : " + this.year);
    }
    
    public int getId()
    {
        return id;
    }
    public int getTimeViewed()
    {
        return timeViewed;
    }
    public void setTimeViewed(int timeViewed)
    {
        this.timeViewed = timeViewed;
    }
       @Override
    public String toString() {
    return " Title : " + getTitle() +
            " \n Genre : " + getGenre() +
            "\n Year : " + getYear()+
            "\n Creator : " + getDuration(); //To change body of generated methods, choose Tools | Templates.
    }
}


