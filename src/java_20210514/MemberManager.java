package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList list;
	public MemberManager() {
		list = new ArrayList();
	}
	public void insert(String id, String name, int age) {
		list.add(new Member(id,name,age));
	}
	
	public void update(String id, String name, int age) {
		for(int i=0; i<list.size();i++) {
			Member m =(Member)list.get(i);
			if(id.equals(m.getId())) {
				//list.remove(i);
				//list.add(i,new Member(id,name,age));	
				m.SetAge(age); //call by reference를 통해 위의 2줄처럼 안지우고 이렇게도 수정가능 이름 바꾸고프다 하면 m.SetName(name);
				break;
			}
		}
	}
	
	public void delete(String id) {
		for(int i=0; i<list.size();i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		}
	}
	
	public ArrayList select() {
		return list;
	}
	
	public Member select(String id) {
		Member member = null;
		for(int i=0; i<list.size();i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				member = m;
				break;
			}
		}
		return member;
	}
	
	
	
}
