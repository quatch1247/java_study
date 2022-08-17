package ja_0817;

import java.io.BufferedInputStream; 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException;

public class FileOutputStream_1 { 

	String strBuff=""; 
	String strCurrentMsg = null; 
	String strFilename;
	
	byte[] byteBuff = new byte[9999];// 사원파일을 읽어들일 바이트 버퍼 
	int nRLen; //파일이 저장될 디렉토리 이름 
	
	public void sfrFunc(String strDir,String strFileName) throws Exception {
		// 디렉토리가 있는지 확인하고 없으면 만듬
			File dir = new File(strDir);
			if (dir.exists() == false) {
				boolean t = dir.mkdirs(); 
				
    if (t == true) strCurrentMsg = "디렉토리가 정상적으로 만들어 졌습니다."; 
    System.out.println(strCurrentMsg);
    } // 파일이 있는지 확인하고 없으면 만듬 
    File file = new File(strFileName); 
    boolean trueNewFile = file.createNewFile(); 
    
    if (trueNewFile) { strCurrentMsg = "파일이 없어 파일을 만들었 습니다."; 
    System.out.println(strCurrentMsg); } 
    // 파일이 존재하면 실행하는 부분 
    
    else if (file.exists() == true) {
    try { FileInputStream fis = new FileInputStream(file);
    BufferedInputStream bis = new BufferedInputStream(fis); 
    nRLen = bis.read(byteBuff);
    if (nRLen < 0) {
    strCurrentMsg = "---파일이 비었습니다--";
    System.out.println(strCurrentMsg); //System.out.println("here");
    } else {
    strBuff = new String(byteBuff, 0, nRLen); 
    strCurrentMsg = "기존 파일이 존재합니다."; 
    System.out.println(strCurrentMsg); 
    System.out.printf("읽은 바이트수[%d] : 읽은 내용\n[%s]\n", nRLen, strBuff); 
    } 
    bis.close(); 
    fis.close(); // try 끝
    } catch (FileNotFoundException e) {
    System.out.println("SfrFileRead 예외 발생 66: " + e.getLocalizedMessage());
    e.printStackTrace(); 
    } 
    } 
    } 
    }
