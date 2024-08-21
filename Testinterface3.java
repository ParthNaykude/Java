//Multiple interfaces implemented by class

interface my_interface1{
    void message();

}
interface my_interface2{
    void greet();
}
class Testinterface implements my_interface1,my_interface2{
    public void message(){
        System.out.print("Hello Everyone ");
    }

    public void greet(){
        System.out.print("Good evenning ");
    }

}
class Testinterface3{
    public static void main(String [] args ){
        Testinterface T = new Testinterface();
        T.message();
        T.greet();
        
    }
}