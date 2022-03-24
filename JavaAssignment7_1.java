abstract class Rodent
{
    Rodent()
    {
        System.out.println("This is Rodent class constructor");
    }
    abstract public void food();

}
class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("This is a Mouse Class constructor");
    }

    public void food()
    {
        System.out.println("Mouse eats corn and sprouts");
    }

}
class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("This is a Gerbil Class constructor");
    }

    public void food()
    {
        System.out.println("Gerbil eats fruits and vegetables");
    }
}



public class JavaAssignment7_1 {

    public static void main(String[] args) {

        Rodent rodent[] = new Rodent[2];
        rodent[0] = new Mouse();
        rodent[0].food();

        rodent[1] = new Gerbil();
        rodent[1].food();


    }
}
