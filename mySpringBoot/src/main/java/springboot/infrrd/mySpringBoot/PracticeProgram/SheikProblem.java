package springboot.infrrd.mySpringBoot.PracticeProgram;

import java.util.Scanner;


public class SheikProblem
{
    public static Result getResult( int divident, int divisor )
    {
        int temp = 0;
        int quotient = 0;
        int reminder = 0;
        for ( int i = 0; i < divident; i++ ) {
            temp += divisor;
            if ( divident < temp ) {
                temp = temp - divisor;
                reminder = divident - temp;
                break;
            } else {
                quotient++;
            }
        }


        return new Result( quotient, reminder );
    }


    public static void main( String args[] )
    {
        Scanner s = new Scanner( System.in );
        int dividend = s.nextInt();
        int divisor = s.nextInt();
        Result result = getResult( dividend, divisor );
        System.out.println( "Quotient is =" + result.quotient + "\nReminder is =" + result.reminder );
    }
}


class Result
{
    int quotient;
    int reminder;


    public Result( int quotient, int reminder )
    {
        this.quotient = quotient;
        this.reminder = reminder;
    }
}