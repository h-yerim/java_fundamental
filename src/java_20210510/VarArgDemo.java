package java_20210510;
//method 만들때 overloading 하고 싶은데 매개변수의 갯수를 정확히 모를때 variable arguments 씀.

public class VarArgDemo {
	public long sum(int... temp) {
		long sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}

	//실제로는 오버로딩 한것이 아니라 인자를 flexible 하게 쓸 수 있게 한것.
	public static void main(String[] args) {
		VarArgDemo v = new VarArgDemo();
		long s1 = v.sum(10,20);
		System.out.println(s1);
		s1 = v.sum(80,90,75,95);
		System.out.println(s1);
	}
}
