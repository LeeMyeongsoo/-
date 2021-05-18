import java.util.Scanner;

public class stuInput {
	static void stuInput(Student2[] s){
	// 학생성적추가
		Scanner scan = new  Scanner(System.in);
        for (int i = Student2.count; i < s.length; i++) {
           // 번호는 자동으로 입력됨.
           System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
           String check = scan.next();

           if (check.equals("0")) {
              System.out.println("상위메뉴로 이동합니다.");
              break;
           }
           // s[i]객체선언
           s[i] = new Student2();
           s[i].name = check;
           System.out.println("국어점수를 입력하세요.>>");
           s[i].kor = scan.nextInt();
           System.out.println("영어점수를 입력하세요.>>");
           s[i].eng = scan.nextInt();
           System.out.println("수학점수를 입력하세요.>>");
           s[i].math = scan.nextInt();
           // 합계
           s[i].total = s[i].kor + s[i].eng + s[i].math;
           // 평균
           s[i].avg = s[i].total / 3.0;
	}
}}
