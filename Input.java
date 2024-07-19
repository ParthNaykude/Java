//Inputs
import java.util.*;

class Input{

    public static void main(String [] args){
        String Student_Name;
        int PRN;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Name of Student : ");
        Student_Name = sc.next();

        System.out.println("Enter The PRN of Student : ");
        PRN = sc.nextInt();

        System.out.println("The name of Student is : " + Student_Name +"\n PRN of Student :" + PRN);

    }
}