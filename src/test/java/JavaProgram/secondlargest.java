package JavaProgram;

import java.util.*;

public class secondlargest {

    public static void main(String args[]) {

        int[] arr={23,34,45,54,11,10};
        List<Integer> ls = new ArrayList<Integer>(arr.length);
        for (int i:arr)
        {
            ls.add(i);
        }



        ls.add(8);
        ls.add(78);
        ls.add(987);
        ls.add(980);
        ls.add(989);
        Integer a[]=new Integer [ls.size()];
       



        System.out.println(ls);
        System.out.println(ls.size());
Collections.sort(ls);
        System.out.println(ls);
int secondlargest=ls.get(ls.size()-2);
        System.out.println("Second largest: "+secondlargest);


        System.out.println(Collections.max(ls));
       // Comparable i =Collections.max(ls);

Collections.binarySearch(ls,5);

    }
}