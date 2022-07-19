package ja_0719;

abstract class Style_88{

	
	abstract void draw();
	
	abstract void print();
	
	abstract void message();

}

class Square extends Style_88{

	@Override
	void draw() {
		System.out.println("사각형을 그린다!!");
		
	}

	@Override
	void print() {
		System.out.println("Square");
		
	}

	@Override
	void message() {
		System.out.println("메세지입니다1.\n");
		
	}	
}

class Circle extends Style_88{

	@Override
	void draw() {
		System.out.println("원을 그립니다");
		
	}

	@Override
	void print() {
		System.out.println("Circle");	
	}
	
	@Override
	void message() {
		System.out.println("메세지입니다2.\n");
		
	}	
	
}

class Triangel extends Style_88{

	@Override
	void draw() {
		System.out.println("삼각형을 그립니다.");
		
	}

	@Override
	void print() {
		System.out.println("Triangel");	
	}
	
	@Override
	void message() {
		System.out.println("메세지입니다3.\n");
		
	}	
	
}




public class Style_2 {


	public static void main(String[] args) {
		
		Square obj_1 = new Square();
		Circle obj_2 = new Circle();
		Triangel obj_3 = new Triangel();
		
		obj_1.draw();
		obj_1.print();
		obj_1.message();
		
	
		obj_2.draw();
		obj_2.print();
		obj_2.message();
		
		obj_3.draw();
		obj_3.print();
		obj_3.message();
		
		System.out.println("=================================");
		
	
		Style_88 ooo_1 = new Square();
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
		
		ooo_1 = new Circle();
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
		
		ooo_1 = new Triangel();
		ooo_1.draw();
		ooo_1.print();
		ooo_1.message();
		
		
}
}


