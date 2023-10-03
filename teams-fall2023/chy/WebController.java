import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebController {

    @GetMapping("/parseHyperlinks")
    public String parseHyperlinks(@RequestParam("url") String url) {
        try {
            // Fetch the web page using JSoup
            Document document = Jsoup.connect(url).get();
            
            // Select all hyperlinks on the page
            Elements links = document.select("a[href]");
            
            // Print out the hyperlinks
            StringBuilder result = new StringBuilder();
            result.append("Hyperlinks on ").append(url).append(":\n");
            for (Element link : links) {
                result.append(link.attr("href")).append("\n");
            }
            
            return result.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred while fetching or parsing the web page.";
        }
    }
}

