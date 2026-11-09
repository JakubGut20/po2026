package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;

        String pobranie = str.substring(0,2);

        if(pobranie.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }


    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true) {
            return true;
        }
        return false;
    }

    public int countEvens(int[] nums) {
        int licznik = 0;
        for(int i=0;i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                licznik++;
            }
        }
        return licznik;
    }

    public String helloName(String name) {
        String kom = "Hello " + name + "!";
        return kom;
    }

    public static void main(String[] args) {
        CodingBat obiekt = new CodingBat();
        //System.out.print(obiekt.startHi("hi bob"));
        //System.out.print(obiekt.mapAB(new HashMap<>(Map.of("a","aa","b","bb"))));
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            map.put(str, str.length());
        }

        return map;
    }
}





