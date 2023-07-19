package generic;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		boolean check = true;
		
		Service05 mem = new ServiceImpl05();
		
		while(check) {
			System.out.println("1.회원관리\n2.종료");
			choice= input.nextInt();
			
			switch(choice) {
			case 1: 
				mem.display();
				break;
			case 2: break;
			}
		}
		
	}
}
