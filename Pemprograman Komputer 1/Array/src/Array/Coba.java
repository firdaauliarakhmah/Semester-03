//package Array;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import org.json.JSONArray;
//import org.json.JSONException;
//
//
//public class Coba {
//      public static String getJSONFromFile(String filename) {
//        String jsonText = "";
//        try {		
//            BufferedReader bufferedReader = 
//            new BufferedReader(new FileReader(filename));
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                jsonText += line + "\n";
//            }
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return jsonText;
//    }
//    
//    public static String getJSONFromURL(String strUrl) {
//        String jsonText = "";
//        try {
//            URL url = new URL(strUrl);
//            InputStream is = url.openStream();
//            BufferedReader bufferedReader = 
//            new BufferedReader(new InputStreamReader(is));
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                jsonText += line + "\n";
//            }
//            is.close();
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return jsonText;
//    }
//     public static void main(String[] args) throws JSONException {
//        String strJson = getJSONFromURL("https://files.poltektegal.org/example.json");
//        JSONArray jsonArray = new JSONArray(strJson);
////        System.out.println(jsonArray);
//
////        List<Object> lis = new ArrayList<Object>();
//        
//        Object[] a = new Object[jsonArray.length()];
//        for(int z=0;z<jsonArray.length();z++){
//            List<Object> lis = new ArrayList<>();
////            JSONObject object = jsonArray.getJSONObject(z);
////            a[z][z] = object.getString("name");
////            a[z][z+1] = object.getString("city");
////            a[z][z+2] = object.getString("cars");
////            a[z][z+3] = object.getString("job");
////            a[z][z+4] = object.getInt("salary");
////             
//            lis.add(jsonArray.getJSONObject(z).getString("name"));
//            lis.add(jsonArray.getJSONObject(z).getString("city"));
//            lis.add(jsonArray.getJSONObject(z).get("cars"));
//            lis.add(jsonArray.getJSONObject(z).getString("job"));
//            lis.add(jsonArray.getJSONObject(z).getInt("salary"));
//            
//            a[z] = lis;
//
//
////            String name = object.getString("name");
////            String city = object.getString("city");
////            String cars = object.getString("cars");
////            String job = object.getString("job");
////            int salary = object.getInt("salary");
//             
//
////             a[z+1] = city;
////             a[z+2] = cars;
////             a[z+3] = job;
////             a[z+4] = salary;
//         }
//        
//        
//        for(Object f: a){
//            System.out.println(f);
//        }
//        
////         System.out.println(Arrays.deepToString(a));
//           
//         
//     }
//    
//}
