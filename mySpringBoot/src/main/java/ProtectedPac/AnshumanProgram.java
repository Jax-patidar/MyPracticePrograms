package ProtectedPac;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;


class manHattan
{
    void display()
    {
        System.out.println("Jagdish");
    }
}

public class AnshumanProgram extends manHattan {

    void display()
    {
        System.out.println("patidar");
    }

    public static void main(String[] s)
    {
         ((AnshumanProgram)new manHattan()).display();

        AnshumanProgram a = new AnshumanProgram();
        AnshumanProgram b = new AnshumanProgram();

        System.out.println(a);
        System.out.println(b);

        SimpleDateFormat formatter = new SimpleDateFormat( null);

//        String a1 = "ansuman patidar";
//        String b1 = "Patidar";
//
//        System.out.println(a1.hashCode());
//        System.out.println(b1.hashCode());

    }
}
