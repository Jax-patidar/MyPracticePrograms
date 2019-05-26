package ProtectedPac;

import java.util.*;

public class LociousLastProgram {

    String[] numberArray = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

    static List<String> getList(int number) {

        List<String> numList =  new ArrayList<>();
        while (number > 0)
        {
            break;
        }
        return numList;
    }

    public static void main(String[] args) {
        int number = 123454;
        List<String> numberList = getList(number);
        System.out.println(numberList);


        Map<String, String> m = new HashMap<>();
        m.put("jagdish","jagdish");
        m.put("jagdish","jagdish");


        System.out.println();


        if ("2019/12-43".matches("\\d{4}[\\/:, \\-].{0,10}"))
        {
            System.out.println("true true");
        }else
        {
            System.out.println("false false");
        }

        Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.YEAR, -5 );
        Date oldDate = calendar.getTime();
        System.out.println(oldDate);

    }
}
