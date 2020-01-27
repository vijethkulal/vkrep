package JavaProgram;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.trim;

public class ReverseSentence {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        String input = "DXC technologies limited";

        String revr = "";
        for (int z = input.length() - 1; z >= 0; z--) {
            revr = revr + input.charAt(z);
        }
        System.out.println(revr);


        String splitwords[] = input.split(" ");
        String reverseword = "";

        for (int i = 0; i < splitwords.length; i++) {
            String word = splitwords[i];
            String reversewords = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversewords = reversewords + word.charAt(j);
            }
            reverseword = reverseword + reversewords + " ";

        }
        System.out.println("traditional method is " +trim(reverseword));

        //return reverseword;

    }}