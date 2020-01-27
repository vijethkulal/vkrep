package JavaProgram;

public class sumofdigits {

    public static void main(String args[]) {


        int ab=1234;
        int sum=0;
        while(ab>0)
        {
            sum=sum + ab%10;
            ab=ab/10;

        }
        System.out.println(sum);
    }


}
