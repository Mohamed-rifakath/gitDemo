package org.example;

public class Child implements In,In2 {

	@Override
	public void property3() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void property4() {
		// TODO Auto-generated method stub
		System.out.println("ria");
	}

	@Override
	public void property() {
		// TODO Auto-generated method stub
		System.out.println("aina");
	}

	@Override
	public void property2() {
		// TODO Auto-generated method stub
		System.out.println("dress");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.property();
		obj.property2();
		obj.property3();
		obj.property4();
	}
	
	
	
	
	
	
	
	
	
}
