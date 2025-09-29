package Compositepattern;

public class CompositeMain {

	public static void main(String[] args) {
		Employee e1=new Developer("Dinesh");
		Employee e2=new Tester("Kumar");
		Employee e3=new Developer("ajay");
		Manager manager1=new Manager("vijay");
		Manager manager2=new Manager("Ajith");
		manager1.addEmployee(e1);
		manager1.addEmployee(e2);
		manager2.addEmployee(e3);
		Manager generalmanager=new Manager("Rajini");
		generalmanager.addEmployee(manager1);
		generalmanager.addEmployee(manager2);
		generalmanager.showDetails("");
		
		

	}

}
