//String Fun 
import java.util.*;

class Sfun{
    void use_stringfun(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String Word : ");
        String S = sc.next();

        int len = S.length();      //Length string function 
        System.out.println("THe length of String is : " + len );

        String colour = "Red ";
        String colour2 = " Blue ";
        System.out.println(colour+colour2);  //concat()

    }
}
class Teststringfun1{
    public static void main(String [] args ){
        Sfun S = new Sfun();
        S.use_stringfun();
        
    }
}