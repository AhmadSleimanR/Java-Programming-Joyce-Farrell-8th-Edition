/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "text";
        HashMap<Integer, String> dictionary = new HashMap<Integer, String>();

    for (int i = 0; i < text.length(); i++) {
        dictionary.put(i, String.valueOf(text.charAt(i)));
}
        
//    String input = "Testing";
//        Map<String, Long> result = Arrays.stream(input.split(""))
//            .map(String::toLowerCase)
//            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(result);
        
        for(int i = 0;i< dictionary.size();++i){
            System.out.print(dictionary.get(i));
        }
    }
    
}
