//interface used by multiple classes
interface my_interface {
    void message();

}
class Class1 implements my_interface{
    public void message(){
        System.out.println("The message from interface ");
    }
}

class Class2 implements my_interface{
    public void message(){
        System.out.print("The is message by interface to class2 ");
    }
}
class Testinterface2{
    public static void main(String [] args ){
        Class1 C = new Class1();
        Class2 C1 = new Class2();
        
        C.message();
        C1.message();
        
    }
}