package springboot.infrrd.mySpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import springboot.infrrd.mySpringBoot.entities.Employee;
import springboot.infrrd.mySpringBoot.services.EmployeeService;

import java.util.*;


@RestController
public class Controller
{


    @Autowired
    JdbcTemplate jdbc;
    EmployeeService employeeService;


    public static void main( String sdsd[] )
    {

        List<String> strings = new ArrayList<String>();
        strings.add( "jagdish" );
        strings.add( "k" );

        strings.add( "dhiraj" );
        strings.add( "Patidar" );
        strings.add( "pati" );
        strings.add( "jax" );
        strings.add( "jagdish" );
        strings.add( "patidarr" );


        // strings.removeIf( t -> t.equals( "jagdish" ) );
        System.out.println( strings );


        strings.removeIf( s -> {
            int k = strings.indexOf(s);
            if ( s.equals( "jax" ) || s.equals( "pati" )||s.equals( "jagdish" )) {
                String kkk = strings.set(k,"ram");
                return true;
            }

            else {

                return false;
            }
        } );


        System.out.println( strings );




        List<Integer> listDevs = new ArrayList<Integer>();


        listDevs.add(65);
        listDevs.add(21);
        //lambda here!
        listDevs.sort((Integer o1, Integer o2)->o1.compareTo(o2));

        //java 8 only, lambda also, to print the List
        listDevs.forEach(developer->System.out.println(developer));


        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));

        uniqueNames.forEach(k-> System.out.println(k));
        Iterator<String> kk  = uniqueNames.iterator();



    }


    @RequestMapping ( method = RequestMethod.GET, value = "/employees")
    public List<Employee> getAllEmployee()
    {

        jdbc.execute( "insert into user(name,email)values('javatpoint','java@javatpoint.com')" );

        return employeeService.getAllEmployee();

    }


    @RequestMapping ( method = RequestMethod.POST, value = "/employees")
    public String addEmplyee( @RequestBody Employee employee )
    {
        employeeService.addEmployee( employee );

        return "Added successfully";

    }


    @RequestMapping ( "/employees/{id}")
    public Employee getEmployeeBasedOnID( @PathVariable int id )
    {

        Employee employee;

        try {
            employee = employeeService.getEmployeeBasedOnID( id );
        } catch ( Exception e ) {
            employee = new Employee();
        }

        return employee;
    }


    @RequestMapping ( "/employeesName/{name}")
    public Employee getEmployeeBasedOnName( @PathVariable String name )
    {
        Employee employee;

        try {
            employee = employeeService.getEmployeeBasedOnName( name );
        } catch ( Exception e ) {
            employee = new Employee();
        }

        return employee;
    }


}
