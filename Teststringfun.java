//String fun
//CharAt()
 
import java.util.*;

class Strigfun{

    void use_stringfun(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String S = sc.next();

        char ch = S.charAt(0);
        System.out.print(ch);
    }

}

class Teststringfun{
    public static void main(String [] args){
    Strigfun sf = new Strigfun();
    sf.use_stringfun();
    }
}