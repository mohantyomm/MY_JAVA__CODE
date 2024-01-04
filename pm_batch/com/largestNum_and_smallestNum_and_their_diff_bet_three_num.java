package pm_batch.com;

public class largestNum_and_smallestNum_and_their_diff_bet_three_num {
	public static void main(String[] args) {
		int a=2,b=3,c=4;
		int max=0;
		if(a>b && a>c) {
			max=a;
		}
		if(b>a && b>c) {
			max=b;
		}
		if(c>a && c>b) {
			max=c;
		}
		int min =0;
		if(a<b && a<c) {
			min=a;
		}
		if(b<a && b<c) {
			min=b;
		}
		if(c<a && c<b) {
			min=c;
		}
		int diff;
		diff=max-min;
		System.out.println("Difference between max and min is ="+diff);
		
	}
}
