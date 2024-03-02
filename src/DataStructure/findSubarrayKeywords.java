package DataStructure;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class findSubarrayKeywords {

    public static String minWindow(String s, String t) {


        int windowStart = 0;
        int windowEnd = 0;
        int characterCounter = t.length();
        String output = "";
        Map<Character, Integer> characterCountMap = new HashMap<>();

        //for each character in t, update the hashmap with count
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);
            System.out.println("get the count "+characterCountMap.getOrDefault(c, 0));
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }


        while (windowEnd < s.length()) {


            if (characterCountMap.containsKey(s.charAt(windowEnd))) {
                if (characterCountMap.get(s.charAt(windowEnd)) > 0) {
                    characterCounter = characterCounter - 1;
                }
                characterCountMap.put(s.charAt(windowEnd), characterCountMap.get(s.charAt(windowEnd)) - 1);
            }

            if (characterCounter == 0) {

                while(windowStart <= windowEnd) {

                    if (characterCountMap.containsKey(s.charAt(windowStart))) {

                        boolean isSubArrayStillValid = characterCountMap.get(s.charAt(windowStart)) + 1 <=0 ? true : false;
                        if(isSubArrayStillValid) {
                            characterCountMap.put(s.charAt(windowStart),characterCountMap.get(s.charAt(windowStart)) + 1);
                            windowStart++;
                        } else {
                            break;
                        }
                    } else {

                        windowStart++;
                    }

                }
                String temp = s.substring(windowStart, windowEnd+1);
                if(output.isEmpty() || output.length() > temp.length()) {
                    output = temp;
                }
            }

            windowEnd++;
        }

        return output;

    }

    public static void main(String[] args) throws IOException {

        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
