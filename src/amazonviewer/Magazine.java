package amazonviewer;

import java.util.Date;

public class Magazine extends Publication
{
    private int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }
//polimorfismo sobre escribiendo el metodo toString 
    @Override
    public String toString() {
        return " MAGAZINE " +
               " \n Title : " + getTitle() +
               " \n Editorial : " + getEditorial() +
               " \n Edition Date : " + getEditionDate(); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
