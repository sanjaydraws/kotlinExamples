import java.util.HashMap;
import java.util.Map;

// Using Default Methods of Map from Java 8
public class Program2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First Element");
        System.out.println(map.get(1));//First Element
        System.out.println(map.get(2));//null 
        System.out.println(map.getOrDefault(2, "defaultValue"));//defaultValue

        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // for each 
        map.forEach((key,value)->{
            System.out.println("Key " + key + ":: Value" + value);
        });

        // using replace all 
        Map<String, Integer> map3 = new HashMap<String, Integer>();
        map3.put("john", 20);
        map3.put("paul", 30);
        map3.put("peter", 40);
        map3.putIfAbsent("shawn", 34);
        map3.putIfAbsent("paul", 34);
        map3.replaceAll((key,value) -> value + 10 );
        System.out.println(map3);//{peter=50, shawn=44, john=30, paul=40}

        // using putIfAbset
        // Key-Value pair is added to the map, if the key is not present or mapped to null 


        // remove
        //Removes the key only if its associated with the given value
        map.remove("peter",50);
        map3.remove("paul", 70);
        System.out.println(map3);

    }
}
