package Data.UserE;

import Data.FileReader;
import java.util.*;

public class Client {
  public static void main(String[] args) {

    // TO DO: Read the files you need into 1D arrays and create a Spotbox object with the arrays.
      FileReader arenasReader = new FileReader("/Data/UserE/arenas.txt");
      FileReader capacitiesReader = new FileReader("capacities.txt");
      FileReader winsReader = new FileReader("championshipwins.txt");
      FileReader locationsReader = new FileReader("locations.txt");
      FileReader teamsReader = new FileReader("teams.txt");

      String[] arenas = arenasReader.getStringData(30);
      int[] capacities = capacitiesReader.getIntData(30);
      int[] wins = winsReader.getIntData(30);
      String[] locations = locationsReader.getStringData(30);
      String[] teams = teamsReader.getStringData(30);
    

    // TO DO: Call the methods you write to provide the information to the user.


    
    
  }
}