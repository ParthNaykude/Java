//Multilevel Inheritance 
import java.util.*;

class Primary{
    int num1;

}
class Secondary extends Primary{
    int num2;
}
class Derived extends Secondary{
    int add;

    Derived(){      //Default Constructor
        System.out.println("These is Default Constructor >>>\n ");
    }



    Derived(int num1 ,int num2){      //Parameterised Constructor
        System.out.println("These is Parameterised Constructor >> ");

        this.num1 = num1;
        this.num2 = num2;
        this.add = num1+num2;

        System.out.println("The addition of Two numbers are : " +add);

    }

}
class Multilevel1{

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter the number 1 : ");
        num1 = sc.nextInt();

        System.out.print("Enter the number 2 : ");
        num2 = sc.nextInt();


        Derived D = new Derived();
        Derived D1 = new Derived(num1,num2);



    }
}


