class Cycle
{
    public void balance()
    {
        System.out.println("balance method in Cycle class");
    }

}
class Unicycle extends Cycle
{
    public void balance()
    {
        System.out.println("balance method in Unicycle class");
    }
}
class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("balance method in Bicycle class");
    }
}
class Tricycle extends Cycle
{

}

public class JavaAssignment7_2 {

    public static void main(String[] args) {

        //upcasting
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        unicycle.balance();
        bicycle.balance();
        tricycle.balance();

        //downcasing
        Unicycle unicycle2 = (Unicycle)unicycle;
        Bicycle bicycle2 = (Bicycle)bicycle;
        Tricycle tricycle2 = (Tricycle)tricycle;

        unicycle2.balance();
        bicycle2.balance();
        tricycle2.balance();
    }
}
