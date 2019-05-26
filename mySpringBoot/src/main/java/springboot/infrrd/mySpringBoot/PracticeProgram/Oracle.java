package springboot.infrrd.mySpringBoot.PracticeProgram;

import com.sun.javafx.collections.MappingChange;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Oracle {
    static String getEncodedString(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int temp = c[i];
            if (temp >= "A".charAt(0) && temp <= "Z".charAt(0)) {
                c[i] = (char) (temp + 2);
                if (temp == "Y".charAt(0) || temp == "Z".charAt(0)) {
                    c[i] = (char) (temp - 24);
                }
            }
        }
        str = String.valueOf(c);
        return str;
    }

    public static void main(String[] args) {
        String str = "Z Y X Z #! A THIS IS @ J''AGDISH Z@ZA";
        System.out.println(getEncodedString(str));

        Map<String, Integer> m = new HashMap<>();
        System.out.println(m);




    }
}
