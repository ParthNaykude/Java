//String fun 
//lowercase 
//Uuppercase
import java.util.*;

class Sfun{
    void use_stringfun(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String S = sc.next();

        S = S.toUpperCase();
        System.out.println("The UpperCase of GIven String : "+ S);


        S = S.toLowerCase();

        System.out.println("The LowerCase of Given String : " + S);

    }
}
class Teststringfun2{
    public static void main(String [] args ){
        Sfun T = new Sfun();

        T.use_stringfun();
        
    }
}