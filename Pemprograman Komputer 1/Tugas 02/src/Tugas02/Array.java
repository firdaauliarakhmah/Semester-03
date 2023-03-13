package Tugas02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author firda
 */
public class Array {
    public static String getJSONFromFile(String filename){
        String jsonText = "";
        try {
            BufferedReader bufferedreader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedreader.readLine()) != null){
                jsonText += line + "\n";
            }
            bufferedreader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonText;
    }
    
    public static String getJSONFromURL(String strUrl){
        String jsonText = "";
        try{
            URL url = new URL(strUrl);
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                jsonText += line + "\n";
            }
            is.close();
            bufferedReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return jsonText;
    }
    
    public static void main(String[] args) throws JSONException {
        String strJson = getJSONFromURL("https://files.poltektegal.org/example.json");
        JSONArray jsonArray = new JSONArray(strJson);
        
        Object[] a = new Object[jsonArray.length()];
        Object[][] ab = new Object[jsonArray.length()][5];
        for(int z=0;z<jsonArray.length();z++){
            List<Object> list = new ArrayList<>();
            
            ab[z][0] = jsonArray.getJSONObject(z).getString("name");
            ab[z][1] = jsonArray.getJSONObject(z).getString("city");
            ab[z][2] = jsonArray.getJSONObject(z).get("cars");
            ab[z][3] = jsonArray.getJSONObject(z).getString("job");
            ab[z][4] = jsonArray.getJSONObject(z).getInt("salary");
        }
        
        for(int i=0;i<ab.length;i++){
            System.out.println("name : " + ab[i][0]);
            System.out.println("city : " + ab[i][1]);
            System.out.println("cars : " + ab[i][2]);
            System.out.println("job : " + ab[i][3]);
            System.out.println("salary : " + ab[i][4]);
            System.out.println("");
        }
    }
}
