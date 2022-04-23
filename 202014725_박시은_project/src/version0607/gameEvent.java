package version0607;

public class gameEvent {
	
	Player player = new Player();

	
	//밥 안먹음
	public void choice1_1() {
		Player.hp -= 15;
		Player.tired += 15;
		player.print_stat();
	}
	//찌개에 밥
	public void choice1_2() {
		Player.tired += 30;
		player.print_stat();
	}
	
	//c프 기초 실습 과제
	public void choice2_1() {
		Player.major_pt += 15;
		Player.endurance -= 5;
		player.print_stat();
	}
	//컴구 예제 풀기 과제
	public void choice2_2() {
		Player.major_pt += 10;
		Player.endurance -= 10;
		player.print_stat();
	}
	//거북이 학습활동 보고서
	public void choice2_3() {
		Player.tired += 15;
		Player.hp -= 15;
		Player.endurance -= 10;
		player.print_stat();
	}
	
	//카페인 음료 섭취
	public void choice3_1() {
		Player.hp += 5;
		Player.tired += 10;
		Player.endurance -= 8;
		player.print_stat();
	}
	//조금 잔다.
	public void choice3_2() {
		Player.hp += 10;
		Player.tired -= 10;
		Player.endurance += 8;
		player.print_stat();
	}
	
	//게임 함
	public void choice4_1() {
		Player.endurance += 10;
		Player.tired -= 10;
		player.print_stat();
	}
	//게임 하지 않음.
	public void choice4_2() {
		Player.major_pt += 10;
		Player.endurance -= 10;
		Player.tired += 10;
		player.print_stat();
	}
	
	
	
	//엔딩
		//1) 체력 낮아 엔딩.
	public void low_hp() {
		//체력 70 이하, 
		System.out.println("엔딩1.체력이 떨어진다아아아..");
	}
		//2) 너무 피곤해 엔딩.
	public void high_tired() {
		//피로도 50 이상
		System.out.println("엔딩2.너무 피곤해애애애애...");
	}
		//3)학점 높아 엔딩.
	public void high_major() {
		//전공지식 포인트 30 이상
		System.out.println("엔딩3.좋은 학점을 받았다!");
	}
		//3)그냥 그래 엔딩
	public void soso() {
	//전공지식 포인트 30 이상
	System.out.println("엔딩4.그냥 그래요..");
}
}
