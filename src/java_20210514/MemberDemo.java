package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("hye000", "정혜림1", 20);
		m.insert("hye101", "정혜림2", 30);
		m.insert("hye202", "정혜림3", 40);
		m.insert("hye303", "정혜림4", 10);

		ArrayList list = m.select();
		for(int i =0; i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(),m2.getName(),m2.getAge());
		}
		System.out.println("==============================");
		
		m.delete("hye000");
		for(int i =0; i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(),m2.getName(),m2.getAge());
		}
		System.out.println("==============================");
		
		m.update("hye202","정혜림3",100);
		for(int i =0; i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(),m2.getName(),m2.getAge());
		}
		System.out.println("==============================");
		
		//하나만 골라서 출력하는거
		Member m3 = m.select("hye303");
		System.out.printf("%s,%s,%d %n",m3.getId(),m3.getName(),m3.getAge());
	
		
		
	}
}
