package Data.UserA;
//BRUCE
import Data.FileReader;
import java.util.*;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {

    // TO DO: Read the files you need into 1D arrays and create a Spotbox object with the arrays.
      FileReader albumReader = new FileReader("Data/UserA/albums.txt");
      FileReader artistReader = new FileReader("Data/UserA/artists.txt");
      FileReader genreReader = new FileReader("Data/UserA/genres.txt");

      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to Spotbox! Type a genre and we'll list the best artists!: ");
      String genreInput = scanner.nextLine();
      
      String[] album = albumReader.getStringData(498);
      String[] artist = artistReader.getStringData(498);
      String[] genre = genreReader.getStringData(498);

      Spotbox mySpotbox = new Spotbox(album, artist, genre);

      while(!genreInput.equals("n")){
          mySpotbox.artistbyGenre(genreInput);
          System.out.println("Is there any other genre? Type n to cancel");
          genreInput = scanner.nextLine();
      }

    // TO DO: Call the methods you write to provide the information to the user.

    
    
  }
}