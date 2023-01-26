
package Data.UserA;
/*
* import necessary package names
 * Processes and analyzes data about music
 */
public class Spotbox {

  // TO DO: Declare instance variables for the arrays you need.
    private String[] albums;
    private String[] artists;
    private String[] genres;

    private int iterate = 50;
    private String lastGenre;

  
  // TO DO: Write a constructor to initialize the instance variables.
    public Spotbox(String[] albums, String[] artists, String[] genres){
        this.albums = albums;
        this.artists = artists;
        this.genres = genres;
    }
  

  // TO DO: Write your methods to find the information you need about your data.

    public void artistbyGenre(String genre){
        if(genre.equals(lastGenre)){
            iterate += 50;
        }else{
            iterate = 50;
        }
        
        for(int i = 0; i < iterate; i++){
            if(genre.equals(genres[i])){
                System.out.println(artists[i]);
            }
        }
        lastGenre = genre;
    }
}