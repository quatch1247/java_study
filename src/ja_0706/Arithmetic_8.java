package ja_0706;

import java.io.IOException;

public class Arithmetic_8 {

	public static void main(String[] args) throws IOException {
	
	int ch, upper, lower;
	
	System.out.print("알파뱃을 입력하세요!");
	ch = System.in.read();
	
	if(ch>='A' && ch<= 'Z')
	{
		lower = ch | 0x20;
		System.out.println((char)ch + "의 소문자 : " + (char)lower);
		
	}else
	{
		upper = ch & 0xDF;
		
		System.out.println((char)ch + "의 대문자 : " + (char)upper);
		
		//0xdf     = 11011111'A'(41)  16진수 대문자로 바꾸는거 걍 암기 ㅋㅋ
		
	}
	
	}
}
