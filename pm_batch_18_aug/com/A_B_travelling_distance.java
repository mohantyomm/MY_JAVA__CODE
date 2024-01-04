package pm_batch_18_aug.com;

public class A_B_travelling_distance {
	public static void main(String[] args) {
		double A = 2500;
		double B = 1600;
		
		double In_a_day = A+B;
		double In_a_week = 7*(A+B);
		double In_a_month = 30*(A+B);
		double In_a_year = 365*(A+B);
		
		int km_day = (int)(In_a_day / 1000);
		int km_week = (int)(In_a_week / 1000);
		int km_month = (int)(In_a_month / 1000);
		int km_year = (int)(In_a_year / 1000);
		
		int meter_day = (int)(In_a_day % 1000);
		int meter_week = (int)(In_a_week % 1000);
		int meter_month = (int)(In_a_month % 1000);
		int meter_year = (int)(In_a_year % 1000);
		
		System.out.println("Total travell in a day is = "+km_day+"km"+meter_day+"meter");
		System.out.println("Total travell in a week is = "+km_week+"km"+meter_week+"meter");
		System.out.println("Total travell in a month is = "+km_month+"km"+meter_month+"meter");
		System.out.println("Total travell in a year is = "+km_year+"km"+meter_year+"meter");
	}
}
