import java.io.File;

public class DelTest {

	public static void main(String[] args) {
		// CMD 명령어 del 작성하기 (파일 삭제 하기)
		// 결과확인 CMD 창에서 실습합니다
		// 주의사항 : 모든 한글을 삭제한 후 실습
		
		// >javac DelTest.java		컴파일하기
		// >java DelTest lee.java	lee.java 파일 삭제하기

		try {
			
			File file=new File(args[0]);
			
			if(file.exists()) {	//파일 존재하는지?
				if(file.delete()) {	//파일 삭제
					System.out.println("1 file deleted");	//파일 삭제 성공
				}else {
					System.out.println("deletion failure");	//파일 삭제 실패
				}//if end
			}else {
				System.out.println("File Not Found!!");
			}//if end
			
		}catch (Exception e) {
			System.out.println("deletion failure" + e);
		}//end
		
	}//main() end

}//class end
