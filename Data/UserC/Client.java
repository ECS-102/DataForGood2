package UserC;
import Data.FileReader;
import java.util.*;

public class Client {
  public static void main(String[] args) {

    // TO DO: Read the files you need into 1D arrays and create a Spotbox object with the arrays.
    FileReader countriesReader = new FileReader("Data/UserC/countries.txt");
      String[] countries = countriesReader.getStringData(215);

    FileReader incomeReader = new FileReader("Data/UserC/income.txt");
      String[] income = incomeReader.getStringData(215);

    FileReader populationReader = new FileReader("Data/UserC/population.txt");
      int[] population = populationReader.getStringData(215);

    FileReader unemploymentReader = new FileReader("Data/UserC/unemployment.txt");
      double[] unemployment = unemploymentReader.getStringData(215);

    FileReader usageReader = new FileReader("Data/UserC/usage.txt");
      double[] usage = usageReader.getStringData(215);

    System.out.println(usage);

    Internet lowInternet = new Internet();

    

    // TO DO: Call the methods you write to provide the information to the user.


    
    
  }
}