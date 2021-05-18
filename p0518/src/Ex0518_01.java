
public class Ex0518_01 {

	public static void main(String[] args) {
		  //메소드는 선언해야 쓸수있어
								//{}<<<이건 메소드 정의 ()<<<이건 호출
			Time[] t = new Time[3];//<<<<대괄호는 ㅜㅜ 아님
			
			for(int i=0;i<t.length;i++) {
				t[i] =new Time();//객체선언
				t[i].hour=i+1;
				t[i].minute=i+1;
				t[i].second=i+1;
			}
				for(int i=0;i<t.length;i++) {
					System.out.printf("%d시%d분%d초",t[i].hour,
							t[i].minute,t[i].second);
				}
			
	
				
				
				
				
				
			
//			t[0] = new Time();
//			t[0].hour =1;
//			t[0].minute=1;
//			t[0].second=1;
//			Time tt = new Time();
			
//			Time t= new Time();
//			t.hour =1 ;
//			t.minute =1;
//			t.second = 1;
//			System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");
	}

}
