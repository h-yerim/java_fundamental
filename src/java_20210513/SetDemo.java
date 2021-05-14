package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet 클래스는 데이터(객체)의 중복을 허용하지 않고, 순서가 없음
		//HashSet set = new HashSet();
		//TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, natural ordering(숫자일때와 문자일때 정렬방식이 다름)을 한다.
		//TreeSet set = new TreeSet();
		//LinkedHashSet 클래스는 데이터의 중복을 허용하지 않고, 순서는 FIFO
		//Hashset, Treeset, LinkedHastset => 의 부모가 Set(interface, 최상위클래스) 따라서 ex) Set set = new LinkedHashset()도 되고 Hashset이 LinkedHashset의 상위클래스 이기때문에 ex) Hashset set = new Linked~()도 가능
		//근데 결국 자식의 함수는 쓸수없기때문에 아래와 같이 정의하는 것이 맞당.
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("91");
		set.add("23");
		set.add("12");		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("1");
	
		
		//HashSet 클래스는 자체적으로 출력할 방법이 없음.
		//HashSet은 무족권 Iterator로 변환해서 출력해야한다.
		Iterator i = set.iterator(); //set을 iterator로
		//hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		//있으면 true, 없으면 false
		while(i.hasNext()) {   
			String temp = (String)i.next(); //해당 객체를 가져온다.
			System.out.println(temp);
		}
		
		
		TreeSet lottoSet = new TreeSet();
		while(true) {
			int random = (int)(Math.random()*45)+1;
			lottoSet.add(random); //auto-boxing (Integer.valueOf) 가 일어남. 왜냐면 add(--)자리에 object들어가야해서
			if(lottoSet.size()==6) break;
		}
		
		Iterator i2 = lottoSet.iterator(); 
		while(i2.hasNext()) {   
			Integer temp = (Integer)i2.next(); //해당 객체를 가져온다.
			System.out.print(temp+"\t");
		}
		
		System.out.println();
		
		StringBuffer s1 = new StringBuffer("a");
		StringBuffer s2 = new StringBuffer("a");
		
		System.out.println(s1.compareTo(s2)); //내용이 같기때문에 0 출력
		System.out.println(s1.equals(s2)); //객체가 다르기때문에 false 출력
		
		//HastSet 클래스는 데이터의 중복을 판단할 때 equals()로 비교해서 true가 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해주지 않음
		//StringBuffer는 Object를 overriding 하지 않았기 때문에 문자열 내용이 같아도 객체가 다르면 false라 판단. 따라서 사이즈는 2가 나온다.
		HashSet set1 = new HashSet();
		set1.add(s1);
		set1.add(s2);
		
		System.out.println(set1.size());
		
		//TreeSet 클래스는 데이터의 중복을 판단할 때 compareTo()로 비교해서 0가 나오면 데이터가 중복되었다고 판단하여 데이터를 추가해주지 않음
		//-> 객체가 아니라 객체가 가지고 있는 문자열을 비교해서 같으면 0을 반한.
		TreeSet set2 = new TreeSet();
		set2.add(s1);
		set2.add(s2);
		
		System.out.println(set2.size());
		
		
		
	}
}
