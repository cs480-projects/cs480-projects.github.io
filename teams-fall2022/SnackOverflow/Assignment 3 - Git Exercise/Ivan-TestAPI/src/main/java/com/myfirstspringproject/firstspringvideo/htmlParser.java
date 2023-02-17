package com.myfirstspringproject.firstspringvideo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class htmlParser {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Jsoup.parseBodyFragment(String html) method
        String html = "<div><p>Lorem ipsum.</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        Element body = doc.body();
        // end

        System.out.println(body + "\n");

        // Use the static Jsoup.parse(String html) method, or Jsoup.parse(String html,
        // String baseUri) if the page came from the web, and you want to get at
        // absolute URLs
        String html2 = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc2 = Jsoup.parse(html2);

        System.out.println(doc2 + "\n");

        // The connect(String url) method creates a new Connection, and get() fetches
        // and parses a HTML file. If an error occurs whilst fetching the URL, it will
        // throw an IOException, which you should handle appropriately.
        Document doc3 = Jsoup.connect("http://example.com")
                .data("query", "Java")
                .userAgent("Mozilla")
                .cookie("auth", "token")
                .timeout(3000)
                .post();

        System.out.println(doc3 + "\n");
    }
}
