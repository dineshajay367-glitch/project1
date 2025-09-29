package Adapterpattern;

public class EuroAdapter implements Currency {
	private Euro e;
	public EuroAdapter(Euro e)
	{
		this .e=e;
	}
	@Override
	public double getAmount() {
		
		return e.getEuro()*90;
	}

}
