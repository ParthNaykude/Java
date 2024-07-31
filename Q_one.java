//Q1

import java.util.Scanner;

class Q_one{
    void average (){

        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Enter the three numbers to get average : ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();



        float averagee;
        averagee = (num1 + num2 + num3)/3;

        System.out.println("Average of three numbers : " + averagee);


    }
    public static void main(String [] args ){
        Q_one ob = new Q_one();

        ob.average();
        


    }

}