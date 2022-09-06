package oop0906;

public class Test07_quiz {

	public static void main(String[] args) {
		// 배열 연습문제
		
		char[] ch= {'I','t','W','i','l','l'};
		int size=ch.length;	//6
		
		//문1)대, 소문자의 개수를 각각 구하시오
		//->대문자 : 2개
		//->소문자 : 4개
		
//		int so=0, dae=0;
//		for(int i=0; i<size; i++) {
//			if(ch[i]>='A' && ch[i]<='Z') {
//				dae++;
//			}
//			if(ch[i]>='a' && ch[i]<='z') {
//				so++;
//			}
//		}
//		System.out.printf("대문자 : %d개\n", dae);
//		System.out.printf("소문자 : %d개\n", so);
		
		// 풀이
		int upper=0;	//대문자의 개수
		int lower=0;	//소문자의 개수
		
		for(int i=0; i<size; i++) {
			if(ch[i]>='A' && ch[i]<='Z') { upper++; }
			
			if(ch[i]>='a' && ch[i]<='z') { lower++; }
		}//for end
		
		System.out.printf("대문자 개수: %d\n", upper);
		System.out.printf("소문자 개수: %d\n", lower);
		
		
		//문2)대소문자를 서로 바꿔서 출력하시오
		//-> iTwILL
		
//		int i=0;
//		for(i=0; i<6; i++) {
//			if(ch[i]>='A' && ch[i]<='Z') {
//				ch[i]+=32;
//			}
//			if(ch[i]>='a' && ch[i]<='z') {
//				ch[i]-=32;
//			}
//		}
//		System.out.println(ch);
		
		//풀이
		for(int i=0; i<size; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				System.out.printf("%c", ch[i]+32);
			}//if end
			
			if(ch[i]>='a' && ch[i]<='z') {
				System.out.printf("%c", ch[i]-32);				
			}//if end
		}//for end
		
		
		//문3)모음의 개수를 구하시오 (A E I O U a e i o u)
		//->모음의 개수 : 2개
		
//		int mo=0;
//		for(i=0; i<6; i++) {
//			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
//				mo++;
//			}
//		}
//		System.out.printf("모음의 개수 : %d개\n", mo);
		
		//풀이
		int mo=0;	//모음의 개수
		for(int i=0; i<size; i++) {
			char c=ch[i];
			if(c>='A' && c<='Z') {	//대문자인지?
				c=(char)(c+32);		//소문자로 변경
			}//if end
			
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': mo++;
			}//switch end
		}//for end
		
		System.out.printf("\n모음의 개수: %d\n", mo);
		////////////////////////////////////////////////////////
		
		
		//문4)각 행의 모음의 개수를 구하시오
		//str[0]행 : 2개
		//str[1]행 : 1개
		//str[2]행 : 2개
		char[][] str= {
						 {'Y','e','a','r'}
						,{'M','o','n','t','h'}
						,{'D','a','t','e'}
					};
		
//		mo=0;
//		int row=str.length;
//		
//		for(int r=0; r<row; r++) {
//			int col=str[r].length;
//			for(int c=0; c<col; c++) {
//				if(str[r][c]=='A'||str[r][c]=='E'||str[r][c]=='I'||str[r][c]=='O'||str[r][c]=='U'||str[r][c]=='a'||str[r][c]=='e'||str[r][c]=='i'||str[r][c]=='o'||str[r][c]=='u') {
//					mo++;
//				}
//			}
//			System.out.printf("str[%d]행 : %d개\n", r, mo);
//			mo=0;
//		}
		
		//풀이
		int row=str.length;	//3
		int count=0;
		
		for(int r=0; r<row; r++) {
			int col=str[r].length;
			for(int c=0; c<col; c++) {
				char w=str[r][c];
				if(w>='A' && w<='Z') {	//대문자인지?
					w=(char)(w+32);		//소문자로 변경
				}//if end
				
				switch(w) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u': count++;
				}//switch end
			}//for end
			System.out.printf("\n str[%d]행 모음의 개수 : %d개", r, count);
			count=0;	//각 행마다 모음의 개수를 구하기 때문에 초기화해야 함
		}//for end
		////////////////////////////////////////////////////////
		
		
		//문5)대각선 방향의 각 요소의 합을 구하시오
		//대각선 ↘ 방향의 합 (4+9+7)			num[0][0]+num[1][1]+num[2][2]
		//대각선 ↙ 방향의 합 (2+9+6)			num[0][2]+num[1][1]+num[2][0]
		int[][] num= {
						 {4, 3, 2} 
						,{5, 9, 1} 
						,{6, 8, 7} 
					};
		
//		row=num.length;
//		int hap=0;
//		for(int r=0; r<row; r++) {
//			int col=num[r].length;
//			for(int c=0; c<col; c++) {
//				if(r==c) {
//					hap+=num[r][c];
//				}
//			}
//		}
//		System.out.printf("대각선 ↘ 방향의 합 : %d\n", hap);
//		
//		
//		hap=0;
//		for(int r=0; r<row; r++) {
//			int col=num[r].length;
//			for(int c=0; c<col; c++) {
//				if((r+c)==2) {
//					hap+=num[r][c];
//				}
//			}
//		}
//		System.out.printf("대각선 ↙ 방향의 합 : %d", hap);
		
		//풀이
		int hap1=0;	// 대각선 ↘
		int hap2=0;	// 대각선 ↙
		
		for(int i=0; i<num.length; i++) {
			hap1=hap1+num[i][i];
			//hap2=hap2+num[i][2-i];
			hap2=hap2+num[i][num.length-1-i];
		}//for end
		
		System.out.printf("\n대각선 ↘ 방향의 합 : %d", hap1);
		System.out.printf("\n대각선 ↙ 방향의 합 : %d", hap2);
		
	}//main() end
	
}//class end
