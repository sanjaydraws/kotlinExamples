import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public static void main(String[] args) {
        // HashMap is an implementation of the Map interface that provides a Data Structure to store data in Key-Value pairs.
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        // if key already exist put method overide value
        myMap.put("k1", 23);
        myMap.put("k2", 3);
        myMap.put("k3", 3);
       
        // geting values 
        // System.out.println(myMap.get("k1"));

        /// check keys 
        // System.out.print(myMap.containsKey("key"));//false
        // System.out.print(myMap.containsKey("k1"));//true
        
        // check values in the map 
        System.out.print(myMap.containsValue(23));//true
        System.out.print(myMap.containsValue(2));//false
        System.out.print(myMap.containsValue("2"));//false




    }
}
