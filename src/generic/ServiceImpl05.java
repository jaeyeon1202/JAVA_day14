package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl05 implements Service05{

	ArrayList<DTO05> member;
	public ServiceImpl05() {
		member = new ArrayList<>();
	}
	
	private int register(String n, String a) {
		DTO05 dto = new DTO05();
		dto.setName(n);
		dto.setAddr(a);
		member.add(dto);
		
		//if문을 통해서 저장이 잘 되면 1을 돌려주고
		//실패하면 0을 돌려준다.
		return 1;
	}
	
	public void display() {
		System.out.println("===회원과니===");
		Scanner input = new Scanner(System.in);
		int num, result=0;
		String name=null, addr=null;
		while(true) {
			System.out.println("1.회원저장\n2.모든회원보기\n3.main이동");
			num=input.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("이름입력:");
				name=input.next();
				System.out.println("주소입력: ");
				addr=input.next();
				result = register(name,addr);
				if(result==1) {
					System.out.println("등록되었습니다.");
				}else {
					System.out.println("문제가 발생했습니다.");
				}
				break;
			case 2: 
				memberView();
				break;
			case 3: return;
			}
		}
		
	}


	public void memberView() {
		for(int i=0; i<member.size();i++) {
			DTO05 dto = member.get(i);
			System.out.println(dto.getName()+dto.getAddr());
		}
		
		for(DTO05 ddto : member) {
			System.out.println(ddto.getName()+ddto.getAddr());
		}
		
	}
	
}
