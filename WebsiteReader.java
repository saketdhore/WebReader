import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WebsiteReader {
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	
    	
        try {
            // Define the URL of the website you want to read
            String websiteUrl = scnr.nextLine();

            // Create a URL object
            URL url = new URL(websiteUrl);

            // Open a connection to the URL and create a BufferedReader to read the contents
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream(), StandardCharsets.UTF_8));

            // Read the contents of the website line by line and print them to the console
            String line;
            
            //File file = new File("Wiki");
            FileWriter filewriter = new FileWriter(scnr.nextLine()+".html");
            
            while ((line = reader.readLine()) != null) {
            	
            	filewriter.write(line);
                //System.out.println(line);
            }

            // Close the BufferedReader when you are finished
            filewriter.close();
            System.out.println("HTML FILE CREATED");
            
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
