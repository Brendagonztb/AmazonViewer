package amazonviewer;

import java.util.*;

import amazonviewer.Movie;

public class AmazonViewer
{
    public static void main(String[] args) 
    {// TODO code application logic here 
      
        showMenu();
        showMovies();
        showBooks();
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
        Scanner sc = new Scanner(System.in);
        int respuesta = Integer.valueOf(sc.nextLine());
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
        int exit = 1;
        ArrayList<Movie> movies = Movie.makeMoviesList();
            do {       
                System.out.println("");
                System.out.println(" Movies ");
                System.out.println(""); 
                
                for(int i = 0; i < movies.size(); i++) {    //1. Movie 1
                   
                    System.out.println(i+1 + "." + movies.get(i).getTitle()+ "Visto : " + movies.get(i).isViewed() );
                }
                System.out.println("0. Regresar al menu");
                System.out.println("");
                //Leer respuesta de usuario
                Scanner sc =new Scanner(System.in);
                int respuesta = Integer.valueOf(sc.nextLine());
                
                
                if (respuesta == 0)
                {
                    showMenu();
                }
                
                Movie movieSelected = movies.get(respuesta -1);
                movieSelected.setViewed(true);
                Date dateI = movieSelected.startToSee(new Date());
                
                 for (int i = 0; i < 100000; i++) {
                 System.out.println(".............................");
                 }
                 
                //Terminar de ver la pelicula
                movieSelected.stopToSee(dateI, new Date());
                System.out.println("Viste : " + movieSelected);
                System.out.println("\n Por : " + movieSelected.getTimeViewed() + "milisegundos");
                        
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
              ArrayList<Book> books = Book.makeBookArrayList();
              
              int exit = 0;
            do {       
                System.out.println("");
                System.out.println(" Books ");
                System.out.println(""); 
                
                for(int i = 0; i < books.size(); i++) {    //1. book 1
                   
                    System.out.println(i+1 + "." + books.get(i).getTitle()+ "Visto : " + books.get(i).isReaded());
                }
                System.out.println("0. Regresar al menu");
                System.out.println("");
                //Leer respuesta de usuario
                Scanner sc =new Scanner(System.in);
                int respuesta = Integer.valueOf(sc.nextLine());
                
                if( respuesta == 0)
                {
                    showMenu();
                }
                
                Book bookSelected = books.get(respuesta -1);
                bookSelected.setReaded(true);
                Date dateI = bookSelected.startToSee(new Date());
                for (int i = 0; i < 1000; i++) {
                 System.out.println(".............................");
                 }
                 
                //Terminar de ver la pelicula
                bookSelected.stopToSee(dateI, new Date());
                System.out.println("Viste : " + bookSelected);
                System.out.println("\n Por : " + bookSelected.getTimeReaded()+ "milesegundos");
                
                
                
                
                
                
            } while (exit != 0);
            
            Scanner sc = new Scanner (System.in);
            
            
            
            
            
            
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
