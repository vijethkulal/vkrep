package JavaProgram;

public class replace {

    public static void main(String args[]) {

        String st="I am Vijeth Kulal the Genius and Jack of All";

        int count=st.length();
        int stlentha = st.replaceAll("a","b").length();
        System.out.println(st);
        String ad=st.replaceAll("i","e");
        System.out.println(ad);
        String ads=st.replaceAll("e","i");
        System.out.println(ads);

    }
}
