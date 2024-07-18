class Testconstructor{
    public static void main (String [] args){
        Constructor c1=new Constructor();
        c1.Display();

        Constructor c2 = new Constructor("jarvis",100);
        c2.Display();

        Constructor c3=new Constructor(100,"jarvis");
        c3.Display();
        


    }
}