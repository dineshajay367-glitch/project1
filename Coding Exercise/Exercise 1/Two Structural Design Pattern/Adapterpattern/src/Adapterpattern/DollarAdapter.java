package Adapterpattern;

public class DollarAdapter implements Currency {
	private Dollar d;
	public DollarAdapter(Dollar d)
	{
		this .d=d;
	}
	@Override
	public double getAmount() {
		
		return d.getDollar()*84;
	}

}
