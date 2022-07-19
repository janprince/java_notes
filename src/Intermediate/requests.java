//package Intermediate;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.stream.Collectors;
//import org.json.JSONObject;
//
///**
// *      This codes contains the basic way of making api requests in java.
// *
// *  External Library: org.json to handle JSON Objects.
// * */
//
//public class requests {
//
//    // http://localhost:8080/RESTfulExample/json/product/get
//    public static void main(String[] args) {
//
//        try {
//
//            // url object.
//            URL url = new URL("http://api.weatherapi.com/v1/current.json?q=london&key=17d116bb0a8542ac978204140212110");
//
//            // open a connection
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.setRequestProperty("Accept", "application/json");
//
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + conn.getResponseCode());
//            }
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(
//                    (conn.getInputStream())));
//
//
//            String output;
//            System.out.println("Output from Server .... \n");
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//                JSONObject jsonObject = new JSONObject(output.toString());  // converts a json-string to a json object.
//                System.out.println(jsonObject);
//                // System.out.println(jsonObject.get("location"));
//            }
//
//            // close connection
//            conn.disconnect();
//
//        } catch (MalformedURLException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//
//}
