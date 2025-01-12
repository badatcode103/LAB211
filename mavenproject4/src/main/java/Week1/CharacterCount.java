/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CharacterCount {
    private String str;
    Scanner sc = new Scanner(System.in);

    public void enterString() {
        System.out.println("Enter your content: ");
        String str = sc.nextLine();
        str = str.trim();  
    }

//    public void countWord1() {
//        String[] words = str.split("\\s+");
//        for (int i = 0; i < words.length; i++) {
//            int count = 0;
//            String word = words[i];
//            for (int j = i + 1; j < str.length(); j++) {
//                if (words[i].equalsIgnoreCase(word)) {
//                    count = count + 1;
//                    words[j] = "";
//                }
//            }
//            if (!words.equals("")) {
//                System.out.print(word + " = " + count + "   ");
//            }
//        }
//    }

    public void countWord() {
        String[] text = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : text) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }

    public void countCharacter() {
        HashMap<Character, Integer> map = new HashMap();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }

        }
    }
}
