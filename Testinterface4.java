//interface based on another interface 
interface my_interface{
    void message();
}
interface my_interface2 extends my_interface{
    void greet();
}
class Testinterface implements my_interface2{
    public void message(){
        System.out.print("Hello Everyone");
    }

    public void greet(){
        System.out.print(" Good Evening ");
    }
}
class Testinterface4{
    public static void main(String [] args ){
        Testinterface T = new Testinterface();
        T.message();
        T.greet();
        

    }
}