import java.util.*; 
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class Overseer {
    public static void main(String args[]) {
   
        Hashtable<String,String> data = new Hashtable<String,String>();
 
        //Adding objects in Hashtable
        data.put("why", "why why?");
        data.put("when", "Now");
        data.put("where", "Right here");
        data.put("what", "wot wot");
        data.put("how", "how how");

        //Default greeting
        System.out.println("OS: Hello, what would you like to know?");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner objsect
  
      
        System.out.print("User: ");
        String question = myObj.nextLine();  // Read user input
        // Creating  Enumeration interface
        // and get keys() from Hashtable
        Enumeration<String> e = data.keys();
 
        // Checking for next element in Hashtable object
        // with the help of hasMoreElements() method
        while (e.hasMoreElements()) {
 
            // Getting the key of a particular entry
            String key = e.nextElement();
 
            if(question.contains(key)){
                 System.out.println("OS : "+ data.get(key));
                            }
        }
        

    
    }
}