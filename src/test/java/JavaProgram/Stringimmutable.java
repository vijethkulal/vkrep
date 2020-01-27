package JavaProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Stringimmutable {

    public static void main(String args[]) {

        String s = "Sachin";
        s = s.concat(" Tendulkar");//concat() method appends the string at the end

        //s+="tendulkar";

        System.out.println(s);//will print Sachin because strings are immutable objects


        Integer i = 10;

        System.out.println(i);


        ArrayList arr = new ArrayList();
        arr.add(32);
        arr.add(32);
        arr.add(32);
        arr.add(32);

        int m=0;
        for(int a=0;a<arr.size();a++)
        {
            System.out.println(arr.get(a).toString() ) ;
        }

    }


}
