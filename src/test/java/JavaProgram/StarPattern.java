package JavaProgram;

public class StarPattern {

    public static void main(String args[]) {


        int i, j;
        int n = 5;
        for ( i=0; i<n; i++) //outer loop for number of rows(n)
             { for (j=n-i; j>1; j--) //inner loop for spaces
        {
            System.out.print(" "); //print space
        }
        for ( j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }
}

}
