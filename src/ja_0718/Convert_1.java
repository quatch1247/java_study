package ja_0718;

class Con_11{
	int a = 33;
	
	void display() {
		System.out.println("Con_11 메소드 display()~~~~");
	}
}

class Con_22 extends Con_11{
	int b = 77;
}

class Con_33 extends Con_11{
	int a = 45;
	int c = 99;
	
	void display() {
		System.out.println("Con_33 메소드 display ####");
	}
	
	void show() {
		System.out.println("Con_33 메소드 show ^^^^");
	}
}


public class Convert_1 {

	public static void main(String[] args) {
		
		Con_33 obj_1 = new Con_33();
		Con_22 obj_2 = new Con_22();
		
		
		
		Con_33 objj33 = (Con_33)obj_1;
		Con_22 objj22 = (Con_22)obj_2;
		
		
		obj_2.display();
		System.out.println("Con_22 a, b : " + obj_2.a +","+ obj_2.b);
		
		obj_2.display();
		System.out.println("Con_33 a, b : " + obj_1.a +","+ obj_1.c);
		
	}

}
