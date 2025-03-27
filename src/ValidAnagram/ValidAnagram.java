package ValidAnagram;

//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//Example 1:
//
//Input: s = "racecar", t = "carrace"
//
//Output: true
//Example 2:
//
//Input: s = "jar", t = "jam"
//
//Output: false
//Constraints:
//
//s and t consist of lowercase English letters.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public static boolean isAnagram(String s, String t) {

//        char[] sChar = s.toCharArray();
//        char[] tChar = t.toCharArray();
//
//        Arrays.sort(sChar);
//        Arrays.sort(tChar);
//
//        return Arrays.equals(sChar, tChar);

//
        HashMap<Character, Integer> sAnagram = new HashMap<>();
        HashMap<Character, Integer> tAnagram = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            int sCount = sAnagram.getOrDefault(sChar, 0);
            int tCount = tAnagram.getOrDefault(tChar, 0);
            sAnagram.put(sChar,sCount+1);
            tAnagram.put(tChar,tCount+1);
        }

        return sAnagram.equals(tAnagram);
       //------------------------

//       for(Map.Entry<Character, Integer> element : sAnagram.entrySet()) {
//           if (!Objects.equals(element.getValue(), tAnagram.get(element.getKey()))) {
//               return false;
//           }
//       }

        //return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t));
        String s2 = "jar";
        String t2 = "jam";
        System.out.println(isAnagram(s2, t2));
        String s3 = "xx";
        String t3 = "x";
        System.out.println(isAnagram(s3, t3));
    }
}
