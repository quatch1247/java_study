package ja_0726;


public class String_5 {

	public static void main(String[] args) {
		

			
			String[] joomin = {"9847371727484","7407384235575",
							  "7458592484875","4802823828585",
							  "98383763234567","8017381234567"};
			
			for (int i = 0; i < joomin.length; i++) {
			
			if(joomin[i].charAt(6)=='1'||joomin[i].charAt(6)=='3'){
				System.out.println(" " + joomin[i] + "는 남자입니다.");
				
			}else if(joomin[i].charAt(6)=='2'||joomin[i].charAt(6)=='4') {
				System.out.println(" " + joomin[i] + "는 여자입니다.");
				
			}else {
				System.out.println(" " + joomin[i] + "는 사람이 아닙니다.");
			}
			
		}

		}
		
		


	}


