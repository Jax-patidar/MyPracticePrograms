package springboot.infrrd.mySpringBoot.PracticeProgram;

import java.util.*;


class AA
{
    public void get() throws Exception
    {

    }
}


public class SyntelAtosThrows extends AA
{
    public static void main( String s[] )
    {


        System.out.println( "h".compareTo( "sh" ) );
    }

    public void get() throws RuntimeException
    {

        Stack<String> s = new Stack<>();
    }
}


class PrarityQueue
{
    public static void main( String args[] )
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add( "Amit" );
        queue.add( "Vijay" );
        queue.add( "Karan" );
        queue.add( "Jai" );
        queue.add( "Rahul" );
        queue.add( "Jagdish" );
        queue.add( "Patidar" );
        queue.add( "Amitsir" );
        queue.add( "Ram" );
        queue.add( "Jay" );
        queue.add( "Zoom" );
        System.out.println( "head:" + queue.element() );
        System.out.println( "head:" + queue.peek() );
        System.out.println( "iterating the queue elements:" );
        Iterator itr = queue.iterator();
        while ( itr.hasNext() ) {
            System.out.println( itr.next() );
        }
        queue.remove();
        System.out.println( "after removing two elements:" );
        Iterator<String> itr2 = queue.iterator();
        while ( itr2.hasNext() ) {
            System.out.println( itr2.next() );
        }

        Deque<String> deque = new ArrayDeque<String>();



    }
}