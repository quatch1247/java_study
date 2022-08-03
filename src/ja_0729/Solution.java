package ja_0729;

public class Solution {
	public static void main(String[] args) {
		
		
		int n = 0;
		int[] arr1 = null;
		int[] arr2 = null;
		String retStr[] = new String[n]	;
		
		for(int i=0; i < n; i++) {

			String result = "";
			String str1 = change10to2(arr1[i],n);
			String str2 = change10to2(arr2[i],n);
		
		System.out.println(retStr);
		
		for(int j=0; j < n; j++) {
			if(str1.charAt(j) == '1' || str2.charAt(j) == '1') {
				result += "#";
			}else {
				result += " ";
			}
		}
		retStr[i] = result;
		}
		System.out.println(retStr);
		
	}
	  public static String change10to2(int n,int length) {
		    String s = "";
		    while (n > 0)
		    {
		        s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
		        n = n / 2;
		    }
		    int tmp = length-s.length();
		    for(int i=0; i <tmp ; i++) {
		    	s = "0" + s;
		    }
		    return s;

		}

	
}
