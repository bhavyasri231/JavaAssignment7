import java.util.Scanner;
interface interface1
{
    public abstract void method1();

    public abstract void method2();

}
interface interface2
{
    public abstract void method3();

    public abstract void method4();
}
interface interface3
{
    public abstract void method5();

    public abstract void method6();
}

interface newInterface extends interface1,interface2,interface3
{
    public abstract void newMethod();
}
class MultipleInheritance implements newInterface
{

    @Override
    public void method1() {
        System.out.println("Overridden method1 by multipleInheritance class");

    }

    @Override
    public void method2() {
        System.out.println("Overridden method2 by multipleInheritance class");

    }

    @Override
    public void newMethod() {
        System.out.println("Overridden newMethod by multipleInheritance class");

    }
    @Override
    public void method3() {
        System.out.println("Overridden method3 by multipleInheritance class");
    }

    @Override
    public void method4() {
        System.out.println("Overridden method4 by multipleInheritance class");
    }

    @Override
    public void method5() {
        System.out.println("Overridden method5 by multipleInheritance class");
    }

    @Override
    public void method6() {
        System.out.println("Overridden method6 by multipleInheritance class");
    }
}
public class JavaAssignment7_3 {

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.method1();
        multipleInheritance.method2();
        multipleInheritance.method3();
        multipleInheritance.method4();
        multipleInheritance.method5();
        multipleInheritance.method6();
        multipleInheritance.newMethod();
    }
}
