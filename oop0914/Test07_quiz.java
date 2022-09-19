package oop0914;

public class Test07_quiz {

	public static void main(String[] args) {
		//연습문제
		
		//문1)주민번호의 각 숫자의 합을 구하시오 (Character클래스와 charAt()함수 이용)
        //   8+9+1+2+3+0+1+2+3+4+5+6+7
        String jumin="8912301234567";
        
//        Character[] cha=new Character[13];
//        int hap=0;
//        int size=cha.length;
//        
//        for(int i=0; i<size; i++) {
//        	cha[i] = jumin.charAt(i);
//        	hap+=Character.getNumericValue(cha[i]);
//        }
//        System.out.println(hap);
        
        //풀이
        int sum=0;
        for(int i=0; i<jumin.length(); i++) {
        	char ch=jumin.charAt(i);	//'8'
        	// '8' → 8
        	sum=sum+Character.getNumericValue(ch);
        }//for end
        System.out.println(sum);
        
        
        //문2)대소문자를 서로 바꿔서 출력하시오 (Character클래스와 charAt()함수 이용)
        //   gONE wITH tHE wIND
        String str="Gone With The Wind";

//        Character[] cha2=new Character[18];
//        
//        for(int i=0; i<str.length(); i++) {
//        	cha2[i]=str.charAt(i);
//        	if(cha2[i]>='A' && cha2[i]<='Z') {
//        		System.out.printf("%c",cha2[i]+32);
//        	}
//        	if(cha2[i]>='a' && cha2[i]<='z') {
//        		System.out.printf("%c",cha2[i]-32);
//        	}
//        }
        
        //풀이
        for(int i=0; i<str.length(); i++) {
        	char ch=str.charAt(i);
        	if(Character.isUpperCase(ch)) {
        		System.out.print(Character.toLowerCase(ch));
        	}else if(Character.isLowerCase(ch)) {
        		System.out.print(Character.toUpperCase(ch));
        	}else {
        		System.out.print(ch);
        	}//if end
        }//for end
        
	}//main() end

}//class end
