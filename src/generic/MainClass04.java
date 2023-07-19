package generic;

import java.util.ArrayList;

class Test04{
	private String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
public class MainClass04 {
	public static void main(String[] args) {
		
		ArrayList<Test04> arr = new ArrayList<>();
		//test04라는 타입만 저장이 가능하다.
		
		Test04 t01 = new Test04();
		t01.setName("홍길동");
		t01.setAddr("골짜기");
		
		Test04 t02 = new Test04();
		t02.setName("개똥쓰");
		t02.setAddr("똥별쓰");
	
		
		arr.add(t01); arr.add(t02);
		//test04로 만들어진 객체 t01이나 t02만 저장할 수 있다
		
		System.out.println("t01: "+t01);
		System.out.println("arr.get(0): "+arr.get(0));
		
		System.out.println(t01.getName());
		System.out.println(arr.get(0).getName());
		
		System.out.println("==============");
		Test04 t = arr.get(1);
		System.out.println("t02:" + t02);
		System.out.println("t: "+t);
		System.out.println(t02.getName());
		System.out.println(arr.get(1).getName());
		
		
	}
}

































































