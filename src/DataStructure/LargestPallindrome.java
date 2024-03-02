package DataStructure;

import org.junit.Test;

public class LargestPallindrome {
    @Test
    public void test1(){
        String s="abcccbbcddcbbca";
      pallindrome(s);

    }
    public String pallindrome(String s){
        String pallin="";

            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length(); j > i; j--) {
                    String check = s.substring(i, j);
                    boolean status = checkpallindrome(check);
                    if (status) {
                        if (check.length() > pallin.length()) {
                            pallin = check;
                            break;
                        }
                    }
                }
            }
        if(pallin=="" && s.length()>=1){
            pallin= String.valueOf(s.charAt(0));
        }

            return pallin;
    }

    private boolean checkpallindrome(String s) {
        int Left=0,Right=s.length()-1;
        boolean status=false;

        while(Left<Right ){
           if( s.charAt(Left)==s.charAt(Right)){
               status= true;
           }else {
               status=false;
               break;
           }
           Left+=1;
           Right-=1;
        }
        return status;
    }

}
