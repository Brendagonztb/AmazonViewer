package amazonviewer;

import java.util.Date;

public class Book 
{
    private String id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;
    
    public Book(String title, Date editionDate, String editorial, String isbn)
    {
        this.title = title;
        this.editionDate = this.editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
    
}
