package JavaProgram;

public class reverseothers {
    public static void main(String args[]) {


        String s1 = "I m learning Java";
        String[] s2 = s1.split(" ");
       /* String f1w = s2[0];
        String f2w = s2[1];
        String f3w = s2[2];
        String f4w = s2[3];*/
String reverses="";
        int length1=s2.length;
        for(int i=length1-1;i>=0;i--)

        {
            reverses+=(s2[i]+" ");


                    }

        System.out.println("Reverese sentence" +reverses);
    }
}