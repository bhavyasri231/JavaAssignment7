package JavaAssignment7;

class OuterClass{
    OuterClass(){
        System.out.println("This is OuterClass constructor");
    }
    class InnerClass{
        InnerClass( int a){
            System.out.println("The value of a is " +a);
            System.out.println("This is InnerClass constructor");
        }
    }
};

class OuterClass2 extends OuterClass{
    OuterClass2(){
        System.out.println("This is OuterClass2 constructor");
    }
    class InnerClass2 extends InnerClass{
        InnerClass2(int a){
            super(a);
            System.out.println("The value of a is " +a);
            System.out.println("This is InnerClass2 constructor");
        }
    }
};

public class JavaAssignment7_5{
    public static void main(String[] args){
        OuterClass2.InnerClass2 in = new OuterClass2().new InnerClass2(4);

    }

}

