package JavaProgram;

import java.util.Set;
import java.util.TreeSet;

public class sortusingarray {

    public static void main(String[] args) {

        int[] arr = {98, 80, 67, 56};
//        Set<int> sl = new TreeSet<>(arr);


        Set<Integer> sor = new TreeSet<>();
        for (int a : arr) {
            sor.add(a);
        }

//        sor.first();
//        System.out.println(sor.first());
//        System.out.println(sor.headSet(80));
        System.out.println(sor);
    }
}
