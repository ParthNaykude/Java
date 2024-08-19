//Abstract 
abstract class Base2{
    Base2(){
        System.out.print("Thise is the Constructor of Base2 \n ");
    }
    void fun(){

        System.out.print("Fun1\n");
    }
    abstract public void greet();

}
class Base3 extends Base2{
    public void greet(){
        System.out.print("Have a Nice Day \n");
    }
}
class Abstract {
    public static void main(String [] args ){

        Base3 B  = new Base3();
        B.greet();
        B.fun();

    }


}