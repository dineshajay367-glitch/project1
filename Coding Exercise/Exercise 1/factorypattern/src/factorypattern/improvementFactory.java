package factorypattern;

public class improvementFactory extends TaskFactory {

	@Override
	public interfaceTask getTask() {
	    
		return new ImprovementTask();
	}
}