package lambda;

interface Lambda01{
	public void lam();			//람다식은 인터페이스와 함께 사용
}
class Test01 implements Lambda01{
	@Override					//인터페이스는 실체화가 되어있지 않기 때문에 오버라이드 필요
	public void lam() {
		System.out.println("lambda 01 실행");
	}
}

//fx가 아닌 자바문법이라서 사전작업 없음
public class Ex01 {
	public static void main(String[] args) {
		
		Test01 t = new Test01();
		t.lam();
		
		Lambda01 lam01 = new Lambda01() {	//인터페이스 형태로 객체 생성을 하면 객체를 만들때 오버라이드가 진행됨
			
			@Override
			public void lam() {
				System.out.println("인터페이스 객체 생성");
				
			}
		};
		
		lam01.lam();
		
		//위의 인터페이스 객체생성 + 오버라이드 과정을 간소화해 놓은 것이 람다식
		
		Lambda01 lam02 = ()-> System.out.println("람다식 객체 생성");
		lam02.lam();
		
	}
}
