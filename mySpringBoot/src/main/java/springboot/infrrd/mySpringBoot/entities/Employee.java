package springboot.infrrd.mySpringBoot.entities;

public class Employee
{

    private int id;
    private String name;
    private String team;
    private int salary;
    private String adrress;


    public Employee()
    {}


    public Employee( int id, String name, String team, int salary, String adrress )
    {
        this.id = id;
        this.name = name;
        this.team = team;
        this.salary = salary;
        this.adrress = adrress;
    }


    public int getId()
    {
        return id;
    }


    public void setId( int id )
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName( String name )
    {
        this.name = name;
    }


    public String getTeam()
    {
        return team;
    }


    public void setTeam( String team )
    {
        this.team = team;
    }


    public int getSalary()
    {
        return salary;
    }


    public void setSalary( int salary )
    {
        this.salary = salary;
    }


    public String getAdrress()
    {
        return adrress;
    }


    public void setAdrress( String adrress )
    {
        this.adrress = adrress;
    }
}
