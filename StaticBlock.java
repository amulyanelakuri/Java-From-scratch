public class StaticBlock {
    static int a; //static variable

    static { //primary use of the static block is intilize the objects
        a= 10;

    }
    public static void method() { // static method
        System.out.println(a);

    }
    // non static variable
    int b ;

    {//non-static block
        b = 23;

    }
    public void display(){ // non-static method
        System.out.println(b);


    }
    public static void main(String[] args) {
        StaticBlock.method();
        StaticBlock sb = new StaticBlock();
        sb.display();
    }
}
