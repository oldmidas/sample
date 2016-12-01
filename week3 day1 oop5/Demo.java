package kr.co.jhta;


//import kr.co.l2.sub.*;
//import kr.co.l2.*;	//	* == 하위폴더 안의 class 전체를 import할때 쓰인다.(폴더는 안됨)

import kr.co.l2.Employee;
import kr.co.l2.sub.Family;

public class Demo {
	public static void main(String[] args) {
		System.out.println("패키지 데모 애플리케이션");


		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());


		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}