package JavaProgram;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Palindrome {

    public static void main(String args[]) {

        int num = 106601;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer st = sb.reverse();

        if (st.equals(sb)) {
            System.out.println("Palindrome" + num);
        } else {
            System.out.println("not a palindrome");
        }

        int pa = 16461;
        int rev = 0;
        while (pa != 0) {
            rev = rev * 10 + pa % 10;
            pa = pa / 10;
        }
        System.out.println(rev);
        //boolean abc=(pa==rev);
        //System.out.println(abc);

        String str6=Integer.toString(rev);
        String str7=Integer.toString(pa);

        if (str6.equals(str7)) {
            System.out.println("Pa is palindrome" + str6);

        } else {
            System.out.println(str7 + "not a palindrome");
        }


        String a = "MADAM";

        String reverse = "";

        int leng = a.length();
        for (int o = leng - 1; o>=0;o--)
        {
            reverse=reverse+a.charAt(o);

        }
        System.out.println(reverse);

        if(a.equals(reverse))
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}