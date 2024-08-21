//Interface 

interface myinterface{
    void message();

}
class Testinterface implements myinterface{
    public void message(){
        System.out.println("Hello Everyone");
    }

    void message1(){
        System.out.print("These is the function ");

    }
}
class Testinterface1{
    public static void main(String [] args ){
        Testinterface T = new Testinterface();
        T.message();
        T.message1();
    }
}