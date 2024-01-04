package pm_batch_18_aug.com;

public class Assignment_buying {
	public static void main(String[] args) {
		int cpu = 2;
		int keyboard = 4;
		int monitor = 4;
		int mouse = 5;
		int c_per_unit = 15000;
		int k_per_unit = 500;
		int mr_per_unit = 5000;
		int me_per_unit = 200;
		
		int total_price;
		total_price = (cpu * c_per_unit)+(keyboard * k_per_unit)+(monitor * mr_per_unit)+(mouse * me_per_unit);
		double discount = 0.0;
		if(total_price > 25000) {
			discount = total_price * 10/100;
		}
		if(total_price <= 25000 && total_price > 20000) {
			discount = total_price * 7/100;
		}
		if(total_price <= 20000 && total_price > 10000) {
			discount = total_price * 5/100;
		}
		System.out.println(discount); 
		double buying_price =0.0;
		buying_price = total_price - discount;
		System.out.println("Total buying price is  = "+buying_price);
	}
}
