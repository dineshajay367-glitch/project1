package factorypattern;

public class featureFactory extends TaskFactory {

	@Override
	public interfaceTask getTask() {
	    
		return new FeatureTask();
	}
}