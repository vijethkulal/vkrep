package JavaProgram;

public class programforreverse {

        public static void main(String[] args) {
            String name="DXC technologies limited"  ;
            String[] word=name.split(" ");
            String reversename="";
            int i,j;
            for(i=0;i<word.length;i++){
                String str=word[i];
                String revstr=" "   ;
                for(j=str.length()-1;j>=0;j--){
                    char chr=str.charAt(j) ;
                    System.out.println(chr);
                    revstr=revstr+chr;
                }
                reversename =reversename + revstr ;
            }
            System.out.println(reversename);
        }
    }