package Compositepattern;
import java.util.*;
public class Manager implements Employee{
	private String name;
	private List<Employee>employee=new ArrayList<>();
	public Manager(String name)
	{
		this.name=name;
	}
	public void addEmployee(Employee emp)
	{
		employee.add(emp);
	}
	public void removeEmployee(Employee emp)
	{
		employee.remove(emp);
	}
	
	@Override
	public void showDetails(String intend) {
		System.out.println(intend+"Manager: "+name);
		for(Employee e: employee)
		{
			e.showDetails(intend+"  ");
		}
		
	}
	
}