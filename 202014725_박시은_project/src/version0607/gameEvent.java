package version0607;

public class gameEvent {
	
	Player player = new Player();

	
	//�� �ȸ���
	public void choice1_1() {
		Player.hp -= 15;
		Player.tired += 15;
		player.print_stat();
	}
	//��� ��
	public void choice1_2() {
		Player.tired += 30;
		player.print_stat();
	}
	
	//c�� ���� �ǽ� ����
	public void choice2_1() {
		Player.major_pt += 15;
		Player.endurance -= 5;
		player.print_stat();
	}
	//�ı� ���� Ǯ�� ����
	public void choice2_2() {
		Player.major_pt += 10;
		Player.endurance -= 10;
		player.print_stat();
	}
	//�ź��� �н�Ȱ�� ����
	public void choice2_3() {
		Player.tired += 15;
		Player.hp -= 15;
		Player.endurance -= 10;
		player.print_stat();
	}
	
	//ī���� ���� ����
	public void choice3_1() {
		Player.hp += 5;
		Player.tired += 10;
		Player.endurance -= 8;
		player.print_stat();
	}
	//���� �ܴ�.
	public void choice3_2() {
		Player.hp += 10;
		Player.tired -= 10;
		Player.endurance += 8;
		player.print_stat();
	}
	
	//���� ��
	public void choice4_1() {
		Player.endurance += 10;
		Player.tired -= 10;
		player.print_stat();
	}
	//���� ���� ����.
	public void choice4_2() {
		Player.major_pt += 10;
		Player.endurance -= 10;
		Player.tired += 10;
		player.print_stat();
	}
	
	
	
	//����
		//1) ü�� ���� ����.
	public void low_hp() {
		//ü�� 70 ����, 
		System.out.println("����1.ü���� �������پƾƾ�..");
	}
		//2) �ʹ� �ǰ��� ����.
	public void high_tired() {
		//�Ƿε� 50 �̻�
		System.out.println("����2.�ʹ� �ǰ��ؾ־־־�...");
	}
		//3)���� ���� ����.
	public void high_major() {
		//�������� ����Ʈ 30 �̻�
		System.out.println("����3.���� ������ �޾Ҵ�!");
	}
		//3)�׳� �׷� ����
	public void soso() {
	//�������� ����Ʈ 30 �̻�
	System.out.println("����4.�׳� �׷���..");
}
}
