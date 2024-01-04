class multi extends Thread{
    public void run(){
        System.out.println("Hello world");
    }
}
class multi2 extends Thread{
    public void run(){
        for(int i =1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class multithread {
    public static void main(String[] args) {
        multi obj = new multi();
        multi2 obj1 = new multi2();
        obj.start();
        obj1.start();
    }
}
