package JavaProgram;

import java.sql.SQLOutput;
import java.util.*;

public class Sortedclass {

    public static void main(String args[]) {

        Set<String> sl = new TreeSet<>();

        sl.add("VIjeth");
        sl.add("kloi");

        SortedSet<String> sor = new TreeSet<String>();
        sor.addAll(sl);
        sor.first();
        System.out.println(sor.first());
        System.out.println(sor.headSet("kloi"));
        System.out.println(sor);

        List<Integer> S2 = new ArrayList<Integer>();
        S2.add(98);
        S2.add(90);
        S2.add(98);
        S2.add(95);

        System.out.println("ArrayList:"+S2);
        ArrayList<Integer> S22 = new ArrayList<Integer>();
        S22.add(98);
        S22.add(90);
        S22.add(98);
        S22.add(95);
        S22.ensureCapacity(5);
        S22.add(95);
        S22.add(95);
        S22.add(98);
        S22.add(90);
        S22.add(98);
        S22.add(95);
        S22.add(98);
        S22.add(90);
        S22.add(98);
        S22.add(95);
        System.out.println(S22.size());
        Integer a[]=new Integer [S22.size()];
        a=S22.toArray(a);
        System.out.println(a[0]);
        int sum=0;
        for(int i=0;i>=a.length-1;i++) {
            System.out.println(a[i]);
            sum+=i;

        }
        System.out.println("sumis "+sum);

        System.out.println("ArrayListEnsureCapacity:"+S22);

        List<Integer> S3 = new LinkedList<Integer>();
        S3.add(98);
        S3.add(90);
        S3.add(98);
        S3.add(95);

        System.out.println("LinkedList"+S3);


        Set<Integer> S1 = new TreeSet<Integer>();
        S1.add(98);
        S1.add(90);
        S1.add(98);
        S1.add(95);
        //S1.addAll((Collection<? extends Integer>) ls);
        System.out.println("sort order TreeSet :"+S1);


        Set<Integer> S4 = new HashSet<Integer>();
        S4.add(98);
        S4.add(90);
        S4.add(989);
        S4.add(198);
        S4.add(9);
        S4.add(5);
        //S1.addAll((Collection<? extends Integer>) ls);
        System.out.println("sort order HashSet :"+S4);
        Set<Integer> S5 = new LinkedHashSet<Integer>();
        S5.addAll(S4);
        S5.add(980);
        S5.add(90);
        S5.add(989);
        S5.add(198);
        S5.add(9876);
        S5.add(5);
        //

        System.out.println("Linked Hash Set :"+S5);
      //  Queue<Integer> S5 = new <Integer>();


        HashMap<String,Double> hm=new HashMap<String, Double>();
        hm.putIfAbsent("America",10.0);
        hm.putIfAbsent("China",9.0);
        hm.putIfAbsent("India",5.0);
        hm.putIfAbsent("Brazil",9.0);


    }

}

