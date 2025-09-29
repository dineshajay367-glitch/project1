package Adapterpattern;

public class adapterMain {

	public static void main(String[] args) {
		PaymentService serv=new PaymentService();
		Currency c1=new Rupee(100);
		serv.paymentProcess(c1);
		Currency c2=new DollarAdapter(new Dollar(100));
		serv.paymentProcess(c2);
		Currency c3=new EuroAdapter(new Euro(100));
		serv.paymentProcess(c3);
		
		

	}

}
