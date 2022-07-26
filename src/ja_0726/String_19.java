package ja_0726;

public class String_19 {

	public static void main(String[] args) {
		
		
		String[] joomin = {"9003231523645", "9821012252364",
			    "9003233523645", "9821011252364",
				"9003232523645", "9821019"
						+ "252364"};

		for (int i = 0; i < joomin.length; i++) {
			
			if (joomin[i].substring(6, 7).equals("1")) {
				System.out.println(" " + joomin[i] + "는 남자입니다.");
				
				}else if(joomin[i].substring(6, 7).equals("2")){
					System.out.println(" " + joomin[i] + "는 여자입니다.");
				}else {
					
					System.out.println(" " + joomin[i] + "는 사람이 아닙니다");
				}
			
		}

	}

}
