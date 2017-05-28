import java.util.*;
import java.io.*;
public class WordCounter{
   public static void main(String [] args){
      BufferedReader in = null;
      Scanner keyIn = new Scanner(System.in);
      String line;
      String story=null;
      //Promt user to enter file name
      System.out.print("Please enter file: ");
      try{
         in = new BufferedReader(new FileReader("C:\\Users\\Caitriona\\Desktop\\" + keyIn.next()));
      }
      //Exit if File not found
      catch(FileNotFoundException fnfex){
         System.out.println("File Not Found");
         System.exit(0);
      }
      //Add text to String variable story
      try{
         while((line=in.readLine())!= null)
         {
            story+=line+" ";
         }
      }
      catch(IOException ex){
         System.out.println("File cant be read");
      }
      //Display word count
      System.out.println("Words in file: " +story.split(" ").length);
   }
}