package ja_0726;

public class String_7 {

	public static void main(String[] args) {
		
		
		String[] juju = {"9847371727484","9907384235575",
						  "7458592484875","9802823828585",
						  "9838376323456","9717381234567"};
		
		for (int i = 0; i < juju.length; i++) {
		
		if(juju[i].indexOf("2",6) == 6||juju[i].indexOf("4",6) == 6){
			System.out.println(" " + juju[i] + "는 여자입니다.");
	
		}else {
			System.out.println(" " + juju[i] + "는 남자입니다.");
		}
		
	}

	}
	}
	
