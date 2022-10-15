package com.test.ivan.yelptest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.apache.tomcat.util.json.JSONParser;

public class apiTest {
    public static void main(String[] args) {
        try {
            //Public API:



            URL url = new URL("https://www.yelp.com/search?find_desc=&find_loc=Chino+Hills%2C+CA+91709");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.connect();

            //Check is connect is made
            int responseCode = conn.getResponseCode();

            //200 = OK
            if (responseCode != 200){
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            }
            else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }

                scanner.close();

                System.out.println(informationString);

                //JSON simple library setup w/ maven is used to convert strings to JSON
                JSONParser parse = new JSONParser();
                JSONArray dataObject = (JSONArray) parse(String.valueOf(informationString));
            }
        }
    }
}
