package Data.UserB;

import Data.FileReader;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import Data.FileReader;

public class Client {
  public static void main(String[] args) {

    // TO DO: Read the files you need into 1D arrays and create a Spotbox object with the arrays.
      FileReader colorReader = new FileReader("Data/UserB/colors.txt");
      FileReader conversationsReader = new FileReader("Data/UserB/conversations.txt");
      FileReader dietsReader = new FileReader("Data/UserB/diets.txt");
      FileReader namesReader = new FileReader("Data/UserB/names.txt");
      FileReader userReader = new FileReader("Data/UserB/UserStory.txt");

      String [] color = colorReader.getStringData(98);
      String [] conversation = conversationReader.getStringData(98);
      String [] diets = dietsReader.getStringData(98);
      String [] namesReader = namesReader.getStringData(98);

    

    

    

    // TO DO: Call the methods you write to provide the information to the user.


    
    
  }
}