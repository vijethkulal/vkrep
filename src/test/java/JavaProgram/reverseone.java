package JavaProgram;

public class reverseone {

    public static void main(String args[]) {

        String str="DXC techniologies";
        String [] str2=str.split(" ");

        String resullt="";

        for(int i=0;i<str2.length;i++) {
            StringBuilder str1 = new StringBuilder(str2[i]);
            //System.out.println(str1.reverse());
            resullt=resullt+" "+str1.reverse();
        }
        System.out.println(resullt);
    }
}
