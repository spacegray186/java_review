package oop0913;

class BbsDTO {	//Data Transfer Object
	//멤버변수
	private int bbsno;		//글번호
	private String writer;	//글작성자
	private String subject;	//글제목
	
	//생성자 함수
	public BbsDTO() {}
	
	public int getBbsno() {
		return this.bbsno;
	}
	
	public void setBbsno(int bbsno) {
		this.bbsno=bbsno;
	}
	
	public String getWriter() {
		return this.writer;
	}
	
	public void setWriter(String writer) {
		this.writer=writer;
	}
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
}//class end

public class Test06_getset {

	public static void main(String[] args) {
		//getter와 setter함수
		/*
			● 함수명 작성 규칙
				- is함수명()	대부분 boolean으로 반환
				- to함수명()	to 뒤의 값으로 반환
				- get함수명()	대부분 리턴값이 존재
				- set함수명() 원하는 값으로 세팅할 때
		*/
		
		//getter함수명을 작성하는 규칙
		// → get멤버변수의첫글자대문자바꾼후함수명()
		
		//setter함수명을 작성하는 규칙
		// → set멤버변수의첫글자대문자바꾼후함수명()
		
		
		BbsDTO dto=new BbsDTO();
		
		dto.setBbsno(1);
		dto.setWriter("오필승");
		dto.setSubject("무궁화 꽃이 피었습니다");
		
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWriter());
		System.out.println(dto.getSubject());

	}//main() end

}//class end
