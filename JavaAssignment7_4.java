package JavaAssignment7;

interface Cycle{
    void code();
    void factories();

}
class Unicycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Unicycle is U_cyc.");
    }

}
class Bicycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of Bicycle is B_cyc.");
    }
}
class Tricycle implements Cycle{
    public void code(){
        factories();
    }
    public void factories(){
        System.out.println("Code of tricycle is T_cyc.");
    }
}
class JavaAssignment7_4 {
    public static void main(String[] args){
        Unicycle unicycle = new Unicycle();
        unicycle.code();
        Bicycle bicycle = new Bicycle();
        bicycle.code();
        Tricycle tricycle = new Tricycle();
        tricycle.code();
    }
}
