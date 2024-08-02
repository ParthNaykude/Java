//Function_overloading
import java.util.*;
class Area{

  void area()
    {

        Scanner sc =new  Scanner(System.in);
        int side ; 
        System.out.print("Enter the Side of Square : ");
        side = sc.nextInt();

        int area1 = side*side ;
        System.out.print("Area of square : " + area1);
    }

   void area(int length,int breadth)
    {
        int l = length ;
        int b = breadth ;
        int area2 = l*b ;
        System.out.print("The area of rectangle is : " + area2 );

    }

    void area(int radius)
    {
        int r = radius ;
        float pi = 3.14f;
        float area3 = 2*pi*r;
        System.out.print("The area of circle is : " +area3 );

    }
    
    public static void main(String [] args ){

        Area A = new Area();
        
        Scanner sc = new Scanner(System.in);
        int choice ;
        int Length ;
        int Breadth ;
        int Radius ;


        System.out.println("Enter your choice to find area ");
        System.out.println("1.Square \n 2.Rectangle \n 3.Circle \n ->");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1 :
            A.area();
            break ;

            case 2 :
            System.out.println("Enter the Length and breadth of rectangle : ");
            Length = sc.nextInt();
            Breadth = sc.nextInt();
            A.area(Length,Breadth);
            break;

            case 3 :
            System.out.println("Enter the Radius of Circle : ");
            Radius = sc.nextInt();
            A.area(Radius);
            break;

            default :{
                System.out.print("Enter only the numbers 1 / 2 / 3 ");
            }

            
        }



    }


}