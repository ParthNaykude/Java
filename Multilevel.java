//Multiline inheritance
import java.util.*;

class Primary {
    int num1;

}

class Secondary extends Primary {
    int num2;
}

class Derived extends Secondary {
    void function(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();

        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();

        System.out.println();


    }
    void function1(){
        if(num1<num2){
            System.out.println("The num1 is minimum \n The num2 is maximum ");
        }
        else if(num1>num2) {
            System.out.println("The num1 is maximum \n The num2 is minimum ");
        }
        else{
            System.out.println("The number you Enter are equal ");
        }
    }
    
}
class Multilevel{

    public static void main(String [] args ){

        Derived D  = new Derived();
        D.function();
        D.function1();
        
    }


}