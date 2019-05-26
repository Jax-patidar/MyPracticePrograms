package springboot.infrrd.mySpringBoot.PracticeProgram;

import springboot.infrrd.mySpringBoot.entities.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface interface1
{
    default void displye()
    {
        System.out.printf("jagdish           ");
    }

}

interface interface2
{

    default void displye()
    {
        System.out.printf("jagdish        ");
    }
}

 class X implements interface1,interface2{
    protected String naveen = "Naveen";

     public void displye()
     {
         System.out.printf("patidar      ");
     }





}

public class Mindtree extends X
{
    public static void main( String sdd[] )
    {

        interface1 ii = new X();
        ii.displye();

        int k = 'A';
        System.out.println( k );

        System.out.println( 115 & 15 );

        List<Emp> list = new ArrayList<>();
        list.add( new Emp( 400, "Jagdish" ) );
        list.add( new Emp( 200, "Patidar" ) );

        Collections.sort(list ,(Emp o1,Emp o2)->o1.Id-o2.Id);


        System.out.println(list);

        try {

        } catch (RuntimeException e)
        {

        } catch (Exception e)
        {

        }

        finally {
            System.out.println("jadisdgsdigsi");
        }

    }
}



class StringReverse
{
    /* Function to print reverse of the passed string */
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "Geeks for Geeks";
        StringReverse obj = new StringReverse();
        obj.reverse(str);
    }
}
