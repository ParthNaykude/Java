//Single Inheritance

import java.util.*;

class Base {

        int num1 ;
        void Input(){
            Scanner sc = new Scanner (System.in);

            System.out.print("Enter the number 1 value : ");
            num1 = sc.nextInt();

        }
}
class Derived extends Base  {
        int num2 ;
        void Input2(){
            Input();

            System.out.print("Enter the number 2 value :");
            Scanner sc = new Scanner(System.in);
            num2 = sc.nextInt();

            if(num1 == num2){
                System.out.print("The numbers are equal >>  \n");

            }
            else{
                System.out.print("These numbers are not equal >> \n ");
            }
        

        }



}
class Single{

    public static void main(String [] args ){

    Derived D = new Derived();
    D.Input2();
    
    }



}