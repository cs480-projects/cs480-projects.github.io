import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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

    }

}