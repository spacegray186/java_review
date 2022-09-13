package oop0913;


//Test06_getset.java참조
public class MemberDTO {
	//멤버변수 field
	private int mno;		//일련번호
	private String id;		//아이디
	private String passwd;	//비밀번호
	private String email;	//이메일
	
	//생성자함수 constructor 자동 코딩 추가
	//메뉴 Source->Generate Constructors from Superclass...
	public MemberDTO() {}
	
	//메뉴 Source->Generate Constructor using Fields...
	public MemberDTO(String id, String passwd, String email) {
		this.id = id;
		this.passwd = passwd;
		this.email = email;
	}

	//멤버함수 method
    //getter와 setter함수 자동 코딩 추가
    //메뉴 Source -> Generate Getters and Setters...
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
			
}//class end
