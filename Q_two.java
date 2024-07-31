//Q2
import java.util.*;

class Q_two{

    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in); 
        int num1;
        int num2;

        System.out.println("Enter the Two number : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 < num2){

            System.out.println("Number " + num2 +" is greater number ");
        }
        else if(num2 < num1 ){

            System.out.println("Number " + num1 +" is greater number ");

        }
        else {
            System.out.println("Both numbers are equal ");
        }


    }



}