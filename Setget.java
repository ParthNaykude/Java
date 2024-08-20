class Student{
    private String name;
    private int PRN ;
    
    void setname(String name ){
        this.name =name;

    }
    String getname(){
        return name;

    }
    void setPRN(int PRN){
        this.PRN = PRN;

    }
    int getPRN(){
        return PRN;

    }
    

}
class Setget{
    public static void main(String [] args){
        Student S = new Student();
        S.setname("Parth");
        S.setPRN(85);

        System.out.println("This is Name of Student : " +S.getname());
        System.out.print("This is PRN of Student : "+ S.getPRN());
        
    }

}