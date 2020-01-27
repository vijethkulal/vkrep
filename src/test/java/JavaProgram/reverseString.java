package JavaProgram;

public class reverseString {

    public static void main(String args[]) {

        String str = "ABCD";
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        String str1 = "DXC Technolgies";
        char a[] = str1.toCharArray();
        int len1 = a.length;
        String revs = "";
        for (int j = len1 - 1; j >= 0; j--) {

            revs = revs + a[j];

        }
        System.out.println(revs);

        String s3="DXC Techniologies";
        String[] s4=s3.split(" ");





    }
}
