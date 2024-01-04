package pm_batch_18_aug.com;

public class digits_of_num_is_same_or_not_in_two_digit_num {
	public static void main(String[] args) {
		int num = 21;
		int last_digit = num % 10;
		int first_digit = num/10;
		if(first_digit == last_digit) {
			System.out.println("The digits are equal");
		}
		else
		{
			System.out.println("The digits are not equal");
		}
	}
}
