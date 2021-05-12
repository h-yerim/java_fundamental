package java_20210511;

//singleton 공식
public class ShapeManager {
	private static ShapeManager single;
		private ShapeManager() {}
		//하나의 객체를 return 하는 것. 얘는 ShapeManager를 return.
		public static ShapeManager getInstance() {
			if(single == null) {
				single = new ShapeManager();
			}
			return single;
		}
		
	public void run(Shape s) {
		s.draw();
	}
}

