package version0607;

public class Player {
	
	static int hp;			//기본 체력
	static int endurance; 	//기본 인내심
	static int major_pt;	//전공 지식 수준 
	static int tired;		//피곤함
	
	
	//캐릭터 시작 기본 설정
	public Player() {
		hp = 100;
		endurance = 100;
		major_pt = 0;		
		tired = 0;
	}
	
	//스탯 출력
	public void print_stat() {
		System.out.println("---------스탯---------");
		System.out.println("hp : "+hp);
		System.out.println("endurance : "+endurance);
		System.out.println("major_pt : "+major_pt);
		System.out.println("tired : "+tired);
		System.out.println("---------------------");
	}
	
	//특징1)전과생의 패기
	public void Change_major() {
		endurance += 10;	//전공적합성을 찾았다는 생각에 기뻐서 체력 상승 +10
		major_pt += 15;		//방학 때 패기있게 예습했으므로 +15
		print_stat();
	}
	
	//특징2)나의 모토-힘들어도 견뎌!
	public void Moto() {
		hp += 15;
		endurance += 15;	//존버의 정신으로 인내심 상승 +15
		print_stat();
	}
	
	//특징3)카페인 전사
	public void caffein_war() {	
		tired += 10;
		hp += 10;
		print_stat();
	}
}
