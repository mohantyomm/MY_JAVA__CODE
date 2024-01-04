package pm_batch_assignment_6.com;
class area_of_geometry{
	int area(int length,int breadth) {
		return length*breadth;
	}
	int area(int length) {
		return length*length;
	}
	float area(float base,float height) {
		return (base*height)/2;
	}
}
public class method_overloading {
	public static void main(String[] args) {
		area_of_geometry obj = new area_of_geometry();
		System.out.println("Area of square is = "+obj.area(4));
		System.out.println("Area of rectangle is = "+obj.area(4, 5));
		System.out.println("area of triangle is = "+obj.area(3.4f, 4.5f));
	}
}
