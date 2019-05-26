package springboot.infrrd.mySpringBoot.PracticeProgram;
 class Emp
{

    int Id;
    String name;


    Emp(int id, String name )
    {
        this.Id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "[Name = "+name+ ", ID = "+Id+"]";
    }

}
