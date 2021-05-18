import java.util.Scanner;

public class Ex0518_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 객체배열선언
		Student[] s = new Student[3];
	
		
		// 3명의 학생
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println("이름이뭐냐");
			s[i].name = scan.next();

			for (int j = 0; j < s[0].score.length; j++) {
				System.out.println("점수를 입력하세여");
				s[0].score[j] = scan.nextInt();
				
				s[i].total = s[i].score[0] + s[i].score[1] + s[i].score[2];
				s[i].avg = s[i].total / 3.0;
				
				
			}
			//출력
		}	for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].name+"\t");
			System.out.print(s[i].name+"\t");

			for (int j = 0; j < s[0].score.length; j++) {
				System.out.print(s[i].score[j]+"\t");
				
								
				
			}System.out.println(s[i].total+"\t");
			System.out.println(s[i].avg+"\n");
		}

//		System.out.println("이름을 입력하세요");
//		s[0].name = scan.next();
//		System.out.println("국어점수를 입력하셈");
//		s[1].kor = scan.nextInt();
//		System.out.println("영어점수");
//		s[2].eng = scan.nextInt();
//		System.out.println("수학");
//		s[3].math = scan.nextInt();
		
	}

}
