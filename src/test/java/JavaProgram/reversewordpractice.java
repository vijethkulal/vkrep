package JavaProgram;

import javax.xml.bind.SchemaOutputResolver;

public class reversewordpractice {

    public static void main(String args[]) {

        String str = "You Love me";

        /* 1. Reverse the existing string using Char Array .
        2.Reverse the existing string using String.charAt()
        3. Reverse the sentence  not words- " me love you"
        4.Reverse each word
        5.Reverse each word of reverse sentence
         */

        //1.Reverse the existing string
        char c[] = str.toCharArray();
        String reverse1 = "";
        for (int i = c.length - 1; i >= 0; i--) {

            reverse1 = reverse1 + c[i];
        }
        System.out.println(reverse1);
        //1. logic 2
        String avan = "Avanakkan";
        String avrev = "";
        for (int i = avan.length() - 1; i >= 0; i--) {
            avrev += avan.charAt(i);
        }
        System.out.println("Reverse Now ::" + avrev);


        //2.2nd Logic to reverse using String.charAt()
        String reve = "";
        for (int i = avan.length() - 1; i <= 0; i--) {
            reve += avan.charAt(i);
        }
        System.out.println(reve);

//3. Reverse sentence not letters.
        String[] split = str.split(" ");

        int len = split.length - 1;

        String revere = "";

        for (int a = split.length - 1; a >= 0; a--) {
            revere = revere + split[a] + " ";
        }
        System.out.println(revere);

///4. Reverse Each word in a sentence
        System.out.println("String is :" + str);
        String[] splitword = str.split(" ");

        int lent = splitword.length - 1;


        String re = "";

        for (String w : splitword) {
            String reverseword = "";
            for (int f = w.length() - 1; f >= 0; f--) {
                reverseword += w.charAt(f);
            }
            re = re + reverseword + " ";


        }
        System.out.println("Reverse each word result  " + re);


        //or
        /*(int i = 0; i < splitword.length; i++) {
            String w = splitword[i];
            String reverseword = "";
            for (int f = w.length() - 1; f >= 0; f--) {
                reverseword += w.charAt(f);
            }
            re = re + reverseword + " ";


        }
        System.out.println("Reverse each word result  "+re.trim());*/

        String[] splitreverse = re.split(" ");

        String reh = "";

        for (String g : splitreverse) {
            String rer = "";

            for (int y = g.length() - 1; y >= 0; y--) {
                rer += g.charAt(y);
            }

            reh = reh + rer + " ";

        }
        System.out.println(reh);


    }


}