package version0607;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	Player player = new Player();
	gameEvent event = new gameEvent();

	//��ư)page1 -> page2
	static JButton StartIcon = new JButton ("");
	private ImageIcon start_click = new ImageIcon(MainFrame.class.getResource("../images/start_click2.jpg"));
	
	//���� ȭ��
	static JPanel page1 = new JPanel();
	
	//é��1-1 ȭ��
	static JPanel page2one = new JPanel() {
		Image Background = new ImageIcon(MainFrame.class.getResource("../images/page2.jpg")).getImage();
		public void paint(Graphics g) {
			g.drawImage(Background,0,0,null);
		}
	};
	
	//<html>  /  <br>  /   </html>
	//label)���丮 �ؽ�Ʈ ���
	JLabel txt1 = new JLabel("<html>�ڽ����� �Ϸ�</html>");
	JLabel txt2 = new JLabel("<html>�ڽ����� �̹� �б� 21������ ����ϴ�.<br>"
			+ "����� �ڽ����� ���� ������ ���� �� �ֵ��� ���;��մϴ�.<br>"
			+ "ȭ����..!</html>");
	//�÷��̾� Ư¡ �ȳ� �ؽ�Ʈ
		//Change_major
	JLabel Change_major_txt = new JLabel("<html>�ڽ����� �̹� �б⿡ ��ǻ�Ͱ��кη� ������ �Ͽ����ϴ�."
			+ "<br>�������ռ��� ã�Ҵٴ� ������ �γ����� ���� �����մϴ�."
			+ "<br>���� �������� �б�� �������� ���� �ʾ� ���� �� ������ �Ͽ� ���������� ���� ����մϴ�.</html>");
		//Moto
	JLabel Moto_txt = new JLabel("<html><br>�ڽ����� ����� '���� �ߵ�� ��Ե� �ȴ�'�Դϴ�."
			+ "<br>�������� �׷� ���䰡 �־������� �ڽŵ� �𸨴ϴ�."
			+ "<br>�ڽ����� �ڽ��� ���並 ���� �ൿ�ϱ� ������ ü���� ���� �����ϰ�"
			+ "<br>�γ��� ���� ���� �����մϴ�.</html>");
		//caffein_war
	JLabel caffein_war_txt = new JLabel("<html><br><br>�ڽ����� '����'��� ī���� ���Ḧ ��ܸ��ʴϴ�."
			+ "<br>������ �Դ� �� �ƴմϴ�. �ƴϱ� �ѵ� ���� �־ �����ϴ� �̴ϴ�. ��ư �ƴմϴ�."
			+ "<br>�ڵ带 �ۼ��ϴ� ���ݵ� ���ð� ������ �𸨴ϴ�."
			+ "<br>ī������ �������ν� ��¦! ü���� ��¦ �����մϴ�."
			+ "<br>���� �Ƿε��� �����մϴ�.</html>");
	//1) �� �� �Ծ�?
	JLabel txt3 = new JLabel("<html>�ڽ����� ������ 10�ÿ� �Ͼ���ϴ�."
			+ "<br>�谡 ������ ������ �ϴ� ���� �Ծ�� �մϴ�."
			+ "<br>� �� �԰ڽ��ϱ�?</html>");
		//������1
	static JButton choice1_1 = new JButton ("���� �ʴ´�.");
	static JButton choice1_2 = new JButton ("���� ��� ���� �Դ´�.");
	
	//2) � ������ ���� �ұ��?
	JLabel txt4 = new JLabel("<html>��¼�ٺ��� 11�ð� �Ǿ����ϴ�."
			+ "<br>���� ���θ� �����ؾ��� �ð��Դϴ�."
			+ "<br>�ڽ����� ������ ���� ������ Ȯ���߽��ϴ�."
			+ "<br>� ������ ������ ���� �Ͻðڽ��ϱ�?</html>");
		//������2
	static JButton choice2_1 = new JButton ("c���α׷���");
	static JButton choice2_2 = new JButton ("<html>��ǻ��<br>������</html>");
	static JButton choice2_3 = new JButton ("<html>�ź���<br>�н��׷�</html>");
		
	//3)������.
	JLabel txt5 = new JLabel("<html>������ �ϴ� �ڽ����� �����ϴ�."
			+ "<br>��� �Ͻðڽ��ϱ�?</html>");
		//������3
	static JButton choice3_1 = new JButton ("ī���� ���Ḧ ���Ŵ�");
	static JButton choice3_2 = new JButton ("���� �ܴ�.");	
	
	//4)�����ϰ� �ʹ�.
	JLabel txt6 = new JLabel("<html>����� ���Ƽ� ������ ������ "
			+ "<br>21������ ��� �񱳰��� ��â ��û�� �ڽ�����"
			+ "<br>��� ���� �ͽ��ϴ�. "
			+ "<br>������ ��� �÷��� �Ͻðڽ��ϱ�?</html>");
		//������4
	static JButton choice4_1 = new JButton ("������ �Ѵ�.");
	static JButton choice4_2 = new JButton ("������ ���� �ʴ´�.");
	
	//�ؽ�Ʈ�� �Ѿ���� �ϴ� ��ư
	static JButton nextIcon_1 = new JButton ("");
	static JButton nextIcon_2 = new JButton ("");
	static JButton nextIcon_3 = new JButton ("");
	static JButton nextIcon_4 = new JButton ("");
	static JButton nextIcon_5 = new JButton ("");
	private ImageIcon click_next = new ImageIcon(MainFrame.class.getResource("../images/nextIcon.jpg"));
	
	//Ư¡ ���� ��ư
	static JButton Change_major = new JButton ("<html>��������<br>�б�</html>");
	static JButton Moto = new JButton ("��������");
	static JButton caffein_war = new JButton ("<html>ī����<br>������</html>");
	
	//����
	JLabel ending1 = new JLabel("<html>����1. ü���� �������پƾƾ�.."
			+ "<br>�ڽ����� ü���� 80 ���ϰ� �Ǿ����ϴ�."
			+ "<br>�Ƹ� �ڽ����� �� ������ �ǰڱ���..</html>");
	JLabel ending2 = new JLabel("<html>����2. �ʹ� �ǰ��ؾ־־־־�.."
			+ "<br>�ڽ����� �Ƿε��� 30 �̻��� �Ǿ����ϴ�."
			+ "<br>�ǰ��ؼ� ���ο� ������ ���� ���ϰڱ���..</html>");
	JLabel ending3 = new JLabel("<html>����3. ���� ������ �޾Ҵ�!.."
			+ "<br>��! ���ϵ帳�ϴ�! ���� ������ �޾ҽ��ϴ�!</html>");
	JLabel ending4 = new JLabel("<html>����4. �׳� �׷���..</html>");

	
	
	public MainFrame() {
		homeframe();
		setpanel();		//�г� ���� ����
		MouseAction();			//���콺 �̺�Ʈ
	}
	
	public void homeframe() {
		setTitle("The Daily of Sieun Park DEMO");
		setSize(MainClass.SCREEN_WIDTH, MainClass.SCREEN_HEIGHT);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	
	//�г� ���� ����
	public void setpanel() {
		//�г� ����
		page1.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		page2one.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT - 316);
		
		//��ư ����
		StartIcon.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		nextIcon_1.setBounds(500,750,100,60);
		nextIcon_2.setBounds(500,750,100,60);
		nextIcon_3.setBounds(500,750,100,60);
		nextIcon_4.setBounds(500,750,100,60);
		nextIcon_5.setBounds(500,750,100,60);
			//�������� �б� ��ư
		Change_major.setBounds(45,560,140,80);
		Change_major.setHorizontalAlignment(JLabel.CENTER);
		Change_major.setFont(new Font("DX���ΰ���", 0, 20));
		Change_major.setBackground(Color.WHITE);
			//���� ����
		Moto.setBounds(250,560,140,80);
		Moto.setHorizontalAlignment(JLabel.CENTER);
		Moto.setFont(new Font("DX���ΰ���", 0, 20));
		Moto.setBackground(Color.WHITE);
			//ī���� ������
		caffein_war.setBounds(445,560,140,80);
		caffein_war.setHorizontalAlignment(JLabel.CENTER);
		caffein_war.setFont(new Font("DX���ΰ���", 0, 20));
		caffein_war.setBackground(Color.WHITE);
		
			//choice1_1
		choice1_1.setBounds(40,750,250,40);
		choice1_1.setHorizontalAlignment(JLabel.CENTER);
		choice1_1.setFont(new Font("DX���ΰ���", 0, 20));
		choice1_1.setBackground(Color.WHITE);
			//choice1_2
		choice1_2.setBounds(300,750,250,40);
		choice1_2.setHorizontalAlignment(JLabel.CENTER);
		choice1_2.setFont(new Font("DX���ΰ���", 0, 20));
		choice1_2.setBackground(Color.WHITE);
		
			//choice2_1
		choice2_1.setBounds(45,730,140,80);
		choice2_1.setHorizontalAlignment(JLabel.CENTER);
		choice2_1.setFont(new Font("DX���ΰ���", 0, 20));
		choice2_1.setBackground(Color.WHITE);
			//choice2_2
		choice2_2.setBounds(250,730,140,80);
		choice2_2.setHorizontalAlignment(JLabel.CENTER);
		choice2_2.setFont(new Font("DX���ΰ���", 0, 20));
		choice2_2.setBackground(Color.WHITE);
			//choice2_3
		choice2_3.setBounds(445,730,140,80);
		choice2_3.setHorizontalAlignment(JLabel.CENTER);
		choice2_3.setFont(new Font("DX���ΰ���", 0, 20));
		choice2_3.setBackground(Color.WHITE);
		
			//choice3_1
		choice3_1.setBounds(40,750,250,40);
		choice3_1.setHorizontalAlignment(JLabel.CENTER);
		choice3_1.setFont(new Font("DX���ΰ���", 0, 20));
		choice3_1.setBackground(Color.WHITE);
			//choice3_1
		choice3_2.setBounds(300,750,250,40);
		choice3_2.setHorizontalAlignment(JLabel.CENTER);
		choice3_2.setFont(new Font("DX���ΰ���", 0, 20));
		choice3_2.setBackground(Color.WHITE);
		
			//choice4_1
		choice4_1.setBounds(40,750,250,40);
		choice4_1.setHorizontalAlignment(JLabel.CENTER);
		choice4_1.setFont(new Font("DX���ΰ���", 0, 20));
		choice4_1.setBackground(Color.WHITE);
			//choice4_2
		choice4_2.setBounds(300,750,250,40);
		choice4_2.setHorizontalAlignment(JLabel.CENTER);
		choice4_2.setFont(new Font("DX���ΰ���", 0, 20));
		choice4_2.setBackground(Color.WHITE);
		
		
		//setLayout
		page2one.setLayout(null);
		page1.setLayout(null);
		
		//setVisible
		page2one.setVisible(false);
		
		//label.setOpaque(true)
		txt1.setOpaque(true);
		txt2.setOpaque(true);
		Change_major_txt.setOpaque(true);
		Moto_txt.setOpaque(true);
		caffein_war_txt.setOpaque(true);
		txt3.setOpaque(true);
		txt4.setOpaque(true);
		txt5.setOpaque(true);
		txt6.setOpaque(true);
		ending1.setOpaque(true);
		ending2.setOpaque(true);
		ending3.setOpaque(true);
		ending4.setOpaque(true);

		//label ����
			//txt1
		txt1.setBounds(0,540,MainClass.SCREEN_WIDTH,316);
		txt1.setHorizontalAlignment(JLabel.LEFT);
		txt1.setFont(new Font("DX���ΰ���", 0, 30));
		txt1.setBackground(Color.WHITE);
			//txt2
		txt2.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		txt2.setHorizontalAlignment(JLabel.LEFT);
		txt2.setFont(new Font("DX���ΰ���", 0, 20));
		txt2.setBackground(Color.WHITE);
		
			//Change_major_txt
		Change_major_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		Change_major_txt.setHorizontalAlignment(JLabel.LEFT);
		Change_major_txt.setFont(new Font("DX���ΰ���", 0, 15));
			//Moto_txt
		Moto_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		Moto_txt.setHorizontalAlignment(JLabel.LEFT);
		Moto_txt.setFont(new Font("DX���ΰ���", 0, 15));
			//caffein_war_txt
		caffein_war_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		caffein_war_txt.setHorizontalAlignment(JLabel.LEFT);
		caffein_war_txt.setFont(new Font("DX���ΰ���", 0, 15));
		
			//txt3
		txt3.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt3.setHorizontalAlignment(JLabel.LEFT);
		txt3.setFont(new Font("DX���ΰ���", 0, 20));
		txt3.setBackground(Color.WHITE);
			//txt4
		txt4.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt4.setHorizontalAlignment(JLabel.LEFT);
		txt4.setFont(new Font("DX���ΰ���", 0, 20));
		txt4.setBackground(Color.WHITE);	
			//txt5
		txt5.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt5.setHorizontalAlignment(JLabel.LEFT);
		txt5.setFont(new Font("DX���ΰ���", 0, 20));
		txt5.setBackground(Color.WHITE);
			//txt6
		txt6.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt6.setHorizontalAlignment(JLabel.LEFT);
		txt6.setFont(new Font("DX���ΰ���", 0, 20));
		txt6.setBackground(Color.WHITE);
			//ending1
		ending1.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending1.setHorizontalAlignment(JLabel.CENTER);
		ending1.setFont(new Font("DX���ΰ���", 0, 20));
		ending1.setBackground(Color.WHITE);
			//ending2
		ending2.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending2.setHorizontalAlignment(JLabel.CENTER);
		ending2.setFont(new Font("DX���ΰ���", 0, 20));
		ending2.setBackground(Color.WHITE);
			//ending3
		ending3.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending3.setHorizontalAlignment(JLabel.CENTER);
		ending3.setFont(new Font("DX���ΰ���", 0, 20));
		ending3.setBackground(Color.WHITE);
			//ending4
		ending4.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending4.setHorizontalAlignment(JLabel.CENTER);
		ending4.setFont(new Font("DX���ΰ���", 0, 20));
		ending4.setBackground(Color.WHITE);
		
		//setBorderPainted(��ư �׵θ�)
		StartIcon.setBorderPainted(false);
		nextIcon_1.setBorderPainted(false);
		nextIcon_2.setBorderPainted(false);
		nextIcon_3.setBorderPainted(false);
		nextIcon_4.setBorderPainted(false);
		nextIcon_5.setBorderPainted(false);
		Change_major.setBorderPainted(false);
		Moto.setBorderPainted(false);
		caffein_war.setBorderPainted(false);

		//add
		add(page1);
		add(page2one);
			//add txt
		add(txt1);
		add(txt2);
			//Ư¡ ������
		add(Change_major);
		add(Moto);
		add(caffein_war);
		add(Change_major_txt);
		add(Moto_txt);
		add(caffein_war_txt);
			//������
		add(choice1_1);
		add(choice1_2);
		add(choice2_1);
		add(choice2_2);
		add(choice2_3);
		add(choice3_1);
		add(choice3_2);
		add(choice4_1);
		add(choice4_2);
			//add txt
		add(txt3);
		add(txt4);
		add(txt5);
		add(txt6);
		add(ending1);
		add(ending2);
		add(ending3);
		add(ending4);
		
		//nextIcon.setIcon
		add(nextIcon_1);
		add(nextIcon_2); 
		add(nextIcon_3);
		add(nextIcon_4); 
		add(nextIcon_5); 
		nextIcon_1.setIcon(click_next);
		nextIcon_2.setIcon(click_next);
		nextIcon_3.setIcon(click_next);
		nextIcon_4.setIcon(click_next);
		nextIcon_5.setIcon(click_next);
		
		//setVisible
		nextIcon_1.setVisible(false);
		nextIcon_2.setVisible(false);
		nextIcon_3.setVisible(false);
		nextIcon_4.setVisible(false);
		nextIcon_5.setVisible(false);
		Change_major.setVisible(false);
		Moto.setVisible(false);
		caffein_war.setVisible(false);
		Change_major_txt.setVisible(false);
		Moto_txt.setVisible(false);
		caffein_war_txt.setVisible(false);
		choice1_1.setVisible(false);
		choice1_2.setVisible(false);
		choice2_1.setVisible(false);
		choice2_2.setVisible(false);
		choice2_3.setVisible(false);
		choice3_1.setVisible(false);
		choice3_2.setVisible(false);
		choice4_1.setVisible(false);
		choice4_2.setVisible(false);
		txt3.setVisible(false);
		txt4.setVisible(false);
		txt5.setVisible(false);
		txt6.setVisible(false);
		ending1.setVisible(false);
		ending2.setVisible(false);
		ending3.setVisible(false);
		ending4.setVisible(false);
				
		//image add
		page1.add(StartIcon);
		StartIcon.setIcon(start_click);	
	}
	
	public void ending() {
		if(player.hp <= 80) {
			event.low_hp();
			set_ending1();
		}
		else if (player.tired >=30) {
			event.high_tired();
			set_ending2();
		}
		else if (player.major_pt>=30) {
			event.high_major();
			set_ending3();
		}
		else {
			event.soso();
			set_ending4();
		}
	}
	
	public void set_ending1() {
		ending1.setVisible(true);
		
	}
	public void set_ending2() {
		ending2.setVisible(true);
		
	}
	public void set_ending3() {
		ending3.setVisible(true);
	}
	public void set_ending4() {
		ending4.setVisible(true);
	}
	
	//���콺 �̺�Ʈ
	public void MouseAction() {
		//startIcon
		StartIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				page1.setVisible(false);
				page2one.setVisible(true);
				txt1.setVisible(true);
				nextIcon_1.setVisible(true);
			}
		});
		
		//nextIcon_1
		nextIcon_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
						
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
						
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				nextIcon_1.setVisible(false);
				nextIcon_2.setVisible(true);
				txt1.setVisible(false);
				txt2.setVisible(true);
			}
		});
		//nextIcon_2
			//Ư¡ ����
		nextIcon_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
						
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
						
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				nextIcon_2.setVisible(false);
				txt2.setVisible(false);
				
				//Ư�� ��ư
				Change_major.setVisible(true);
				Moto.setVisible(true);
				caffein_war.setVisible(true);
			}
		});
		
			//Change_major
		Change_major.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				Change_major_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				Change_major_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				player.Change_major();
					//Ư��â false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//�ؽ�Ʈ3 true
				txt3.setVisible(true);
					//������ ��ư true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
				
			}
		});
		
			//Moto
		Moto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				Moto_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				Moto_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				player.Moto();
					//Ư��â false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//�ؽ�Ʈ3 true
				txt3.setVisible(true);
					//������ ��ư true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
			}
		});
		
			//caffein_war
		caffein_war.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				caffein_war_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				caffein_war_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				player.caffein_war();
					//Ư��â false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//�ؽ�Ʈ3 true
				txt3.setVisible(true);
					//������ ��ư true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
			}
		});
		
		//choice1_1
		choice1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
			
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice1_1();
				
				txt3.setVisible(false);
				choice1_1.setVisible(false);
				choice1_2.setVisible(false);
				
				txt4.setVisible(true);
				choice2_1.setVisible(true);
				choice2_2.setVisible(true);
				choice2_3.setVisible(true);
			}
		});
		//choice1_2
		choice1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice1_2();
				
				txt3.setVisible(false);
				choice1_1.setVisible(false);
				choice1_2.setVisible(false);
				
				txt4.setVisible(true);
				choice2_1.setVisible(true);
				choice2_2.setVisible(true);
				choice2_3.setVisible(true);
			}
		});
		
		
		//choice2_1
		choice2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice2_1();
				
				txt4.setVisible(false);
				choice2_1.setVisible(false);
				choice2_2.setVisible(false);
				choice2_3.setVisible(false);
				
				txt5.setVisible(true);
				choice3_1.setVisible(true);
				choice3_2.setVisible(true);
				
			}
		});
		//choice2_2
		choice2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice2_2();
				
				txt4.setVisible(false);
				choice2_1.setVisible(false);
				choice2_2.setVisible(false);
				choice2_3.setVisible(false);
				
				txt5.setVisible(true);
				choice3_1.setVisible(true);
				choice3_2.setVisible(true);
			}
		});
		//choice2_3
		choice2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice2_3();
				
				txt4.setVisible(false);
				choice2_1.setVisible(false);
				choice2_2.setVisible(false);
				choice2_3.setVisible(false);
				
				txt5.setVisible(true);
				choice3_1.setVisible(true);
				choice3_2.setVisible(true);
			}
		});
		
		
		//choice3_1
		choice3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice3_1();
				
				txt5.setVisible(false);
				choice3_1.setVisible(false);
				choice3_2.setVisible(false);
				
				txt6.setVisible(true);
				choice4_1.setVisible(true);
				choice4_2.setVisible(true);
			}
		});
		//choice3_2
		choice3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice3_2();
				
				txt5.setVisible(false);
				choice3_1.setVisible(false);
				choice3_2.setVisible(false);
				
				txt6.setVisible(true);
				choice4_1.setVisible(true);
				choice4_2.setVisible(true);
			
			}
		});
		
		
		//choice4_1
		choice4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice4_1();
				
				txt6.setVisible(false);
				choice4_1.setVisible(false);
				choice4_2.setVisible(false);
				
				page2one.setVisible(false);
				
				ending();
			}
		});
		//choice4_2
		choice4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//���콺 ���� ��
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//���콺�� ������ ��
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//Ŭ������ ��
				event.choice4_2();
				
				txt6.setVisible(false);
				choice4_1.setVisible(false);
				choice4_2.setVisible(false);
				
				page2one.setVisible(false);
				
				ending();
			}
		});
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
}
