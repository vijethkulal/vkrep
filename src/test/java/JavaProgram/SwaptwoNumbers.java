package JavaProgram;

public class SwaptwoNumbers {


    public static void meth1(int k, int l)

    {
        l=k+l-(k=l);
        System.out.println("k value is: "+k +" "+"l value is: "+l);
    }
    public static void main(String args[]) {

        SwaptwoNumbers.meth1(50,60);



        int a=10,b=20;
        int temp;

//logic 1
        temp=a;
        a=b;
        b=temp;
        System.out.println("a value is: "+a +"b value is: "+b);


        // logic 2 using + and -

        int x=10, y=20;

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping");
        System.out.println("x value is: "+x +"y value is: "+y);


        // logic 3* and /
        int p=10,q=20;
        p=p*q;
        q=p/q;
        p=p/q;
        System.out.println("After swapping");
        System.out.println("p value is: "+p +"q value is: "+q);


        // Logic 4 using XOR

        int e=10,f=20;

        e=e ^f;
        f=e ^f;
        e=e ^f;

        System.out.println("After swapping");
        System.out.println("e value is: "+e +" "+"f value is: "+f);



        //logic 5 -Single Statement

        int m=10;
        int n=20;

        n=m+n-(m=n);
        System.out.println("After swapping");
        System.out.println("m value is: "+m +" "+"n value is: "+n);




    }


}
