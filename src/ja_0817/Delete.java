package ja_0817;

import java.io.File;

public class Delete{

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("사용 : java Delete <file or director>");
			System.exit(1);
		}
		
		try {
			delete(args[0]);
		}catch(IllegalArgumentException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
	//삭제 정적 메소드
	//지정된 화일이나 디렉토리를 삭제하기 전에 삭제가 가능한지 확인
	//문제가 발생하면 IllegalArgumentException을 발생
	private static void delete(String filename) {
		File ff = new File(filename);
		
		//화일이나 디렉토리가 존재하는지와 쓰기 방지 되었는지 확인
		
		if(!ff.exists()) {
			fail("Delete : no such file or director" + filename);
			//system.exit(1);
			
		}
		//디렉토리 비어있는지 확인
		
		if(!ff.canWrite()) {
			String[] files = ff.list();
			
			if(files.length > 0) {
				fail("Delete : directory not empty : " + filename);
			}
		}
		//모든 검사를 통과하면 파일 삭제
		
		boolean success = ff.delete();
		if(!success) {
			fail("Delete : deletion failed");
		}
		else
			System.out.println("삭제 되었습니다.");
	}
	
	private static void fail(String msg) throws IllegalArgumentException {
		
		throw new IllegalArgumentException(msg);
	}
}

