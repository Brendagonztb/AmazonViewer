package amazonviewer;

import java.util.Date;

import amazonviewer.Movie;

public class AmazonViewer
{
    
    public static void main(String[] args) 
    {
       Movie movie = new Movie ("Coco", "Animation",(short)2017);  
       movie.showData();
       Serie serie = new Serie("La Casa de Papel", "Drama" , 120);
  
    // TODO code application logic here 
        //showMenu();
       
        
    }
    public static void showMenu()
    {
        int exit =0;
        do {
        System.out.println("BIENVENIDOS A AMAZON VIEWER");
        System.err.println("");
        System.out.println("Seleccionala la opcion deseada");
        System.out.println("1.Movies");
        System.out.println("2.Series");
        System.out.println("3.Books");
        System.out.println("4.Magazines"); 
        System.out.println("5.Report");
        System.out.println("6.Report today");
        System.out.println("0.Exit"); 
       
        //Leer las respuestas de usuario
        int respuesta = 8;
        switch (respuesta) 
        {
            case 0:
               //Exit
            break;
            case 1:
                showMovies();
                
            break;
            case 2:
                showSeries();
            break;
            case 3:
                showBooks();
            break;
            case 4:
                showMagazines();
            break;
            case 5:
                makeReport();
            break;
            case 6:
                makeReport(new Date());
            break;
            default:
                System.out.println("Esa opcion no existe");
        }
				
        } while (exit != 0);
        
    }
        public static void showMovies()
        {
        int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Movies ");
                System.out.println(""); 
            } while (exit != 0);
            
        }
        public static void showSeries()
        {
            int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Series ");
                System.out.println(""); 
            } while (exit != 0);
        }
         public static void showChapters()
         {
         int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Chapters ");
                System.out.println(""); 
            } while (exit != 0);
         }
          public static void showBooks()
          {
              int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Books ");
                System.out.println(""); 
            } while (exit != 0);
          }
           public static void showMagazines()
           {
               int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Magazines ");
                System.out.println(""); 
            } while (exit != 0);
            
           }
          public static void makeReport()
          {
              
          }
          public static void makeReport(Date date)
          {
              
          }
        
    }
