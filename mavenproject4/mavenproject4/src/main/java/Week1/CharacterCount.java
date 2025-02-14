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
    private Scanner sc = new Scanner(System.in);

    public CharacterCount(String str) {
        this.str = str;
    }

   

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
        System.out.println(map);
    }
}
