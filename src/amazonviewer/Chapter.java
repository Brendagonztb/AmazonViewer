package amazonviewer;

import java.util.ArrayList;

public class Chapter extends Movie
{
    private int id;
    private int sessionNumber;

    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;   
    }

    @Override
    public int getId() {
        return this.id ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString() {
        return " CHAPTER " +
                "\n Title : " + getTitle() +
                "\n Duration : " + getDuration() +
                "\n Year : " + getYear() +
                "\n Creator : " + getCreator() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ArrayList<Chapter> makeChaptersList()
    {
        ArrayList<Chapter> chapters = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            chapters.add(new Chapter("chapter " + i, "genre" + i, "creator"+ i, 58,(short) (2005+i), i));
            
        }
        return chapters;

    }
}
    
