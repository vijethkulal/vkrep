package JavaProgram;

import java.util.*;

public class reverseusingcollection {

    public static void main(String args[]) {


                String input = "Dxc Technologies Limited";
                String[] trial1 = input.split(" ");

                List trial2 = Arrays.asList(trial1);

                Collections.reverse(trial2);

                trial2.stream().forEach(i -> {
                    System.out.print(i +" ");
                });

//        ListIterator it=trial1.listIterator() ;
//        if (it.hasNext()==true) {
//            System.out.println(it.next());
//
//        }

            }
}
