package amazonviewer;

import java.util.Date;

public class Book extends Publication
{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String authors) {
        super(title, editionDate, editorial, authors);
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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    

}

   