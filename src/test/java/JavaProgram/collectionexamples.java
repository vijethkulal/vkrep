package JavaProgram;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.*;

public class collectionexamples {


    public static <sor> void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("abc");
        ls.add("efg");
        ls.add("kij");

        for (String i : ls) {
            System.out.println(i);
        }

    }
}
