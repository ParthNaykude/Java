//Data / Variable 

interface interdata 
{
    final  static int num1 = 4 ;
    final static int num2 = 8 ;
     
}
class useinterface implements interdata {
    int x = num1 ;
    int y = num2 ;

    void product(){
        int mul ;
        mul = num1 * num2 ;
        System.out.println("Product of interfsce data = " +mul);

    }
    void subtract(){
        int sub ;
        sub = num1 - num2 ;
        System.out.println("Substraction of data : " + sub );

    }
}
class Testinterface5{
    public static void main(String [] args ){
        useinterface U = new useinterface();
        U.product();
        U.subtract();

    }
}