package ja_0714;


//static과 final의 개념을 확실하게 하기
class Car_2
{
	String color;
	String gearType;
	int door;
	
	
	public Car_2(){ // default 생성자
		this("White", "auto", 4);
	}
	
	public Car_2(Car_2 car) { //인스턴스 복사를 위한 생성자
		color = car.color;
		gearType = car.gearType;
		door = car.door;
		
	}
	
	public Car_2(String c, String g, int d ) {
		
		color = c;
		gearType = g;
		door = d;
		
	}
}
	
public class CarTest_2 {
	public static void main(String[] args) {
		
		Car_2 obj_1 = new Car_2();
		//Car_2 obj_2 = obj_1;
		Car_2 obj_2 = new Car_2(obj_1); // obj_1의 복사본 obj_2
		
		System.out.println("obj_1 color : " + obj_1.color + ",obj_1 gearType : " +  obj_1.gearType + 
				",obj_1 door : " +  obj_1.door );
		
		System.out.println("obj_2 color : " + obj_2.color + ",obj_2 gearType : " +  obj_2.gearType + 
				",obj_2 door : " +  obj_2.door );
		
		System.out.println();
		System.out.println(obj_1);
		System.out.println(obj_2);
		System.out.println();
			
		
		obj_1.door = 99;
		obj_1.color = "분홍색";
		
		System.out.println("obj_1 color : " + obj_1.color + ",obj_1 gearType : " +  obj_1.gearType + 
				",obj_1 door : " +  obj_1.door );
		
		System.out.println("obj_2 color : " + obj_2.color + ",obj_2 gearType : " +  obj_2.gearType + 
				",obj_2 door : " +  obj_2.door );
	}

}
