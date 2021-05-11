package java_20210511;

public class ShapeDemo {
	public static void main(String[] args) {
		//Rectangle s= new Rectangle() ; 도 된다.
		//Shape s = new Shape() ; 는 안된다. 추상클래스기 때문.
		ShapeManager manager =  ShapeManager.getInstance();
		Triangle t = new Triangle();
		
		manager.run(t);
	}
}
