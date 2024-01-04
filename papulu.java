
public class papulu {
	public static void main(String[] args) {
		String str = "papulu";
		int size = str.length();
		int flag =0;
		for(int i = 0;i<size;i++)
		{
			if(str.charAt(i)=='p') {
				flag++;
			}
			else {
				continue;
			}
		}
		System.out.println(flag);
	}
}
