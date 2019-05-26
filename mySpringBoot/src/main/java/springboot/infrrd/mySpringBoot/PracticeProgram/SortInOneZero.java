package springboot.infrrd.mySpringBoot.PracticeProgram;

public class SortInOneZero {
    public static void main(String sds[])
    {
        int[] k = {1,0,1,0,1,1,0,0,1,1,1};

        int n =0,m=k.length-1;

        while (n<m)
        {
            if (k[n]==1)
            {
                k[m]=k[n]+k[m];
                k[n]=k[m]-k[n];
                k[m]=k[m]-k[n];
                m--;

            }else
            {
                n++;
            }
        }

        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }

    }
}
