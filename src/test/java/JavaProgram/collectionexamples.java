package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class collectionexamples {


    public static <sor> void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("abc");
        ls.add("efg");
        ls.add("kij");

        for (String i : ls) {
            System.out.println(i);

            // System.out.println(i);
        }

    }
}
