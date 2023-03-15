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
//public class TugasJSON {
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
////        ArrayList<Object> list = new ArrayList<Object>();
//        
//        Object[] a = new Object[jsonArray.length()];
//        Object[][] aa = new Object[jsonArray.length()][5];
//        for(int z=0;z<jsonArray.length();z++){
//            List<Object> lis = new ArrayList<>();
////            Object[] m = new Object[5];
////            JSONObject object = jsonArray.getJSONObject(z);
//            aa[z][0] = jsonArray.getJSONObject(z).getString("name");
//            aa[z][1] = jsonArray.getJSONObject(z).getString("city");
//            aa[z][2] = jsonArray.getJSONObject(z).get("cars");
//            aa[z][3] = jsonArray.getJSONObject(z).getString("job");
//            aa[z][4] = jsonArray.getJSONObject(z).getInt("salary");
////             
//
////            m[0] = jsonArray.getJSONObject(z).getString("name");
////            m[1] = jsonArray.getJSONObject(z).getString("city");
////            m[2] = jsonArray.getJSONObject(z).get("cars");
////            m[3] = jsonArray.getJSONObject(z).getString("job");
////            m[4] = jsonArray.getJSONObject(z).getInt("salary");
//            
////            a[z] = m;
//            
////            lis.add(jsonArray.getJSONObject(z).getString("name"));
////            lis.add(jsonArray.getJSONObject(z).getString("city"));
////            lis.add(jsonArray.getJSONObject(z).get("cars"));
////            lis.add(jsonArray.getJSONObject(z).getString("job"));
////            lis.add(jsonArray.getJSONObject(z).getInt("salary"));
////            list.add(lis);
//            
////            a[z] = lis;
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
//        for(int i=0;i<aa.length;i++){
//            System.out.println("name : " + aa[i][0]);
//            System.out.println("city : " + aa[i][1]);
//            System.out.println("cars : " + aa[i][2]);
//            System.out.println("job : " + aa[i][3]);
//            System.out.println("salary : " + aa[i][4]);
//            System.out.println("");
//            
//        }
//        
////         System.out.println(Arrays.deepToString(a));
//           
//         
//     }
//    
//}
