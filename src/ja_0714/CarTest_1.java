package ja_0714;


class Car
{
	String color = "yellow"; // 멤버변수(필드, 전역변수)
	String gearType = "반자동";
	int door = 7;
	String direction = "what??";
	
	
	public Car() {   //default 생성자, 클래스에 생성자가 없다면 자동으로 만들어진다
		
	}
	
	public Car(String c, String g, int d, String dd ) { // 매개변수가 있는 생성자
		
		color = c;
		gearType = g;
		door = d;
		direction = dd;
	}
	
	public String toString() {	//이거 주석처리하면 주소값만 나옴, 해쉬코드값 비교 객체가 같으면 주소가 같다.
		return "color : "+ color + ", gearType : " + gearType + " door : "+ door + 
		"direction : " + direction;
	}
	
}

public class CarTest_1 {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();  //객체만드는 방법 1
		car1.color = "green";
		car1.gearType = "수동";
		car1.door = 5;
		car1.direction = "left";
		
		
		System.out.println(car1.toString());
		if(car1.direction.equals("left")) {
			System.out.println("이차는 왼쪽으로 돌고 있습니다.\n");
		}else if(car1.direction.equals("right")) {
			System.out.println("이차는 오른쪽으로 돌고 있습니다.\n");
		}else { 
			System.out.println("이차는 직진하고 있습니다.\n");
		}
		
		

		
		
		Car car2 = new Car("red","fullauto",6, "right"); //객체만드는 방법  2
		
		System.out.println(car2.toString());
		if(car2.direction.equals("left")) {
			System.out.println("이차는 왼쪽으로 돌고 있습니다.\n");
		}else if(car2.direction.equals("right")) {
			System.out.println("이차는 오른쪽으로 돌고 있습니다.\n");
		}else { 
			System.out.println("이차는 직진하고 있습니다.\n");
		}
		
		
		Car car3 = new Car();
		
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
		System.out.println();
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		
		
		
		
	}

}
