package ja_0715;


class AA_2{
	
	public void displayAA_2(final int TT) { //파이너리 상수만 올 수 있다/
		class BB_2{
			int bb = TT + 33;
			
			public void showBB_2() { 
				System.out.println("TT = " + TT + ", BB = " + bb);	
				}
		}
		
		BB_2 bb_2 = new BB_2();
		bb_2.showBB_2();
		
	}


}

public class LocalClass_1 {

	public static void main(String[] args) {


		AA_2 obj_1 = new AA_2();
		obj_1.displayAA_2(55);

	}

}
