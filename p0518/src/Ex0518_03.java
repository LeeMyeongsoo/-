
public class Ex0518_03 {

	public static void main(String[] args) {
		Card c1 = new Card();//이렇게 객체 선언 해야 Card에 있는 걸 쓸수있어
		c1.kind = "Heart";//Card c1 = new Card();위에 이걸 선언해야 쓴다! 
		c1.number = 7;
		Card c2= new Card();
		c2.kind ="spade";
		c2.number = 4;
		
		System.out.printf("카드종류:%s, 숫자:%d \n",c1.kind,c1.number);
		System.out.printf("카드폭:%d, 카드길이:%d \n",c1.width,c1.height);
		c1.width = 200;
		c1.height = 300;
		System.out.println("====================================================");
		System.out.printf("카드종류:%s, 숫자:%d \n",c2.kind,c2.number);
		System.out.printf("카드폭:%d, 카드길이:%d \n",c2.width,c2.height);
		
	}

}
