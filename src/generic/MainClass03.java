package generic;

import java.util.ArrayList;

class Test03<T>{
	public void sumFunc(T n1, T n2) {
		System.out.println(n1+","+n2);
	}
	
	public void sumFunc(String s1, String s2) {
		System.out.println(s1+","+s2);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.sumFunc(100, 200);
		t.sumFunc("집", "가고싶어");
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		///arr.add("aaa");
		System.out.println(arr.get(0));
		//System.out.println(arr.get(1));
		int n = arr.get(0);
		
		Test03<String> t01 = new Test03();
		//t01.sumFunc("aaa", "aall");
	}
}
