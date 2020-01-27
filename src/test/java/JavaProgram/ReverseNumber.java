package JavaProgram;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]) {


        Scanner in=new Scanner(System.in);
        int num =in.nextInt();

int rev=0;
        while(num!=0)
        {
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);



        int abc=3456;
        StringBuffer rstf;
        StringBuffer stf=new StringBuffer();
        stf.append(abc);
        rstf=stf.reverse();

        System.out.println(rstf);

int fds=345687;
StringBuilder stb=new StringBuilder();
stb.append(fds);
StringBuilder revstb=stb.reverse();
        System.out.println(revstb);


    }
}
