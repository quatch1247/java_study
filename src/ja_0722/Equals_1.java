package ja_0722;


class Queen{
	int number;
	
	public Queen(int num) {
		
		number = num;
	}
}

// ==는 주소 비교다.
// equals 내용 비교다.


public class Equals_1 {
	public static void main(String[] args) {
		
		Queen obj_1 = new Queen(27);
		Queen obj_2 = new Queen(27);
		
		if(obj_1.equals(obj_2)) {
			System.out.println("obj_1 과 obj_2는 같다");
		}else {
			System.out.println("obj_1과 obj_2는 다다다르르다다다");
			
			System.out.println("obj_1 : " + obj_1.getClass().hashCode());
			System.out.println("obj_2 : " + obj_2.getClass().hashCode() + "\n");
		}
		
		if(obj_1 == obj_2) {
			System.out.println("obj_1 과 obj_2는 같다");
		}else {
			
			System.out.println("obj_1과 obj_2는 다다다르르다다다");
			System.out.println("obj_1 : " + obj_1.hashCode());
			System.out.println("obj_2 : " + obj_2.hashCode()+ "\n");
		}
		
		obj_2 = obj_1;
		
		if(obj_1.equals(obj_2)) {
			System.out.println("obj_1 과 obj_2는 같다");
		}else {
			System.out.println("obj_1과 obj_2는 다다다르르다다다");
			
			System.out.println("obj_1 : " + obj_1.hashCode());
			System.out.println("obj_2 : " + obj_2.hashCode()+ "\n");
		}
		
		if(obj_1 == obj_2) {
			System.out.println("obj_1 과 obj_2는 같다");
		}else {
			
			System.out.println("obj_1과 obj_2는 다다다르르다다다");
			System.out.println("obj_1 : " + obj_1.hashCode());
			System.out.println("obj_2 : " + obj_2.hashCode());
		}

	}

}