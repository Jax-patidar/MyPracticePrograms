package springboot.infrrd.mySpringBoot.PracticeProgram;

class parent
{
    protected int get(int a)
    {
        System.out.println(a +1);
        return 1;
    }

}

public class SyntelOverrideProgram extends parent{
    public int get(int a)
    {
        System.out.println(a);
        return 1;
    }
    public static void main(String arg[])
    {
        parent p = new SyntelOverrideProgram();
        p.get(4);
    }
}


interface in1
{
    final int a = 10;
    default void display()
    {
        System.out.println("hello");
    }
}

// A class that implements interface.
class testClass implements in1
{
    public void display()
    {
        System.out.println("helloxx");
    }

    // Driver Code
    public static void main (String[] args)
    {
        testClass a=new testClass();
        a.display();
    }
}

