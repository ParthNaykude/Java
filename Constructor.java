class Constructor{
    String B_name;
    int B_rate;
    Constructor(){//un-parameterised constructor
        B_rate=100;
        B_name="jravis";
    }

    Constructor(String name,int rate){ //parameterised constructor 
        B_name=name;
        B_rate=rate;

    }
    Constructor(int B_rate,String B_name){//parameterised constructor with diff seq of data_type
        this.B_name=B_name;
        this.B_rate=B_rate;
    }

    void Display(){
        System.out.println("The Book name is : "+ B_name);
        System.out.println("The Book price is : "+B_rate);
    }
}