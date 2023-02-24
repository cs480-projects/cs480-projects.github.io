import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;

import java.io.IOException;

public class WebController {
    public static void main(String[] args) {
        Document doc;
        try {
            // need http protocol
            doc = Jsoup.connect("https://www.google.com/search?client=firefox-b-1-d&q=cal+poly+pomona+roomates").get();

            // get page title
            String title = doc.title();
            System.out.println("title : " + title);

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                // get the value from href attribute
                if(link.text().contains("room")) { // if the text contained in a link has 'room', then print
                    System.out.println("\nlink : " + link.attr("href"));
                    System.out.println("text : " + link.text());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String jsonString = "{\"name\":\"Abhi\", \"age\":21}";
        // example json string
        
        GsonBuilder builder = new GsonBuilder(); 
        builder.setPrettyPrinting(); 
        
        Gson gson = builder.create();
        Student student = gson.fromJson(jsonString, Student.class);
        //convert string to Student object
        System.out.println(student);
        
        jsonString = gson.toJson(student);
        //convert object back to json string
        System.out.println(jsonString);

        //Google Guava Example
        User user1 = new User("Raymar", "Lagos", "rumor", "filipinoDancer<3");	
        User user2 = new User("Abhi", null, "abhinav", "neelam123");	

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());	
        System.out.println(MoreObjects.toStringHelper(user1).add("Name", user1.getFirstName() + " " + user1.getLastName())
        .add("Username", user1.getUsername())
        .add("Password", user1.getPassword()).toString());

        System.out.println(MoreObjects.toStringHelper(user2).add("Name", user2.getFirstName() + " " + user2.getLastName())
        .add("Username", user2.getUsername())
        .add("Password", user2.getPassword()).toString());
    }
    
    // created for json example
    class Student { 
    	   private String name; 
    	   private int age; 
    	   public Student(){} 
    	   
    	   public String getName() { 
    	      return name; 
    	   }
    	   
    	   public void setName(String name) { 
    	      this.name = name; 
    	   } 
    	   
    	   public int getAge() { 
    	      return age; 
    	   }
    	   
    	   public void setAge(int age) { 
    	      this.age = age; 
    	   }
    	   
    	   public String toString() { 
    	      return "Student [ name: "+name+", age: "+ age+ " ]"; 
    	   }  
    	}
}