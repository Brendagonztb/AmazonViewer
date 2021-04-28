package amazonviewer;

import java.util.Date;

public class Book extends Publication implements IVisualizable
{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return " BOOK " +
               "\n Title : " + getTitle() +
               "\n Editorial : " + getEditorial() +
               "\n Edition Date : " + getEditionDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
         if(dateF.getSeconds() > dateI.getSeconds()){
               setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
         }else{
                setTimeReaded(0);
                }
    }

    

}

   