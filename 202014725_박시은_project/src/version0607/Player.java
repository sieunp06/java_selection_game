package version0607;

public class Player {
	
	static int hp;			//�⺻ ü��
	static int endurance; 	//�⺻ �γ���
	static int major_pt;	//���� ���� ���� 
	static int tired;		//�ǰ���
	
	
	//ĳ���� ���� �⺻ ����
	public Player() {
		hp = 100;
		endurance = 100;
		major_pt = 0;		
		tired = 0;
	}
	
	//���� ���
	public void print_stat() {
		System.out.println("---------����---------");
		System.out.println("hp : "+hp);
		System.out.println("endurance : "+endurance);
		System.out.println("major_pt : "+major_pt);
		System.out.println("tired : "+tired);
		System.out.println("---------------------");
	}
	
	//Ư¡1)�������� �б�
	public void Change_major() {
		endurance += 10;	//�������ռ��� ã�Ҵٴ� ������ �⻵�� ü�� ��� +10
		major_pt += 15;		//���� �� �б��ְ� ���������Ƿ� +15
		print_stat();
	}
	
	//Ư¡2)���� ����-���� �ߵ�!
	public void Moto() {
		hp += 15;
		endurance += 15;	//������ �������� �γ��� ��� +15
		print_stat();
	}
	
	//Ư¡3)ī���� ����
	public void caffein_war() {	
		tired += 10;
		hp += 10;
		print_stat();
	}
}
