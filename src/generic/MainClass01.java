package generic;

import java.util.ArrayList;

/*
 generic
  - 유동적으로 자료형을 부여해 사용할 수 있다.
  - wrapper 자료형으로 부여해야 한다.
  wrapper
  - int: Integer, double:DOUBLE ...
  -boolean, byte, chat, short, int, long, float, double //첫 문자를 대문자로
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num=100;
		Integer num2 = 100;
		System.out.println(num+num2);
		//ArrayList<E> arr; //e: element
	}
}
