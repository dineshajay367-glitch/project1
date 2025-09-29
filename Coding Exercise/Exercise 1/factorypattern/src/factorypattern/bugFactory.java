package factorypattern;

public class bugFactory extends TaskFactory {

	@Override
	public interfaceTask getTask() {
	    
		return new BugTask();
	}

}
