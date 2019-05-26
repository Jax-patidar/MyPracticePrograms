package springboot.infrrd.mySpringBoot.services;

import org.springframework.stereotype.Service;
import springboot.infrrd.mySpringBoot.entities.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService
{

    private List<Employee> employeeList = new ArrayList<>(
        Arrays.asList( new Employee( 1, "Jagdish Patidar", "Product", 10000, "Bangalore" ),
            new Employee( 2, "Ram Gopal panda", "Product2", 100000, "Pune" ),
            new Employee( 5, "Dhiraj Gupta", "Product4", 1000001, "Indore" ),
            new Employee( 8, "Dhiraj Gupta", "Product10", 10, "Delhi" ) ) );


    public List<Employee> getAllEmployee()
    {
        return employeeList;
    }


    public void addEmployee( Employee employee )
    {
        employeeList.add( employee );
    }


    public Employee getEmployeeBasedOnID( int id )
    {
        return employeeList.stream().filter( e -> e.getId() == id ).findFirst().get();
    }


    public Employee getEmployeeBasedOnName( String name )
    {
        return employeeList.stream().filter( e -> e.getName().toLowerCase().equals( name.toLowerCase() ) ).findAny().get();
    }


}
