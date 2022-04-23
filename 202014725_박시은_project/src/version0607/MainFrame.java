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

	//버튼)page1 -> page2
	static JButton StartIcon = new JButton ("");
	private ImageIcon start_click = new ImageIcon(MainFrame.class.getResource("../images/start_click2.jpg"));
	
	//시작 화면
	static JPanel page1 = new JPanel();
	
	//챕터1-1 화면
	static JPanel page2one = new JPanel() {
		Image Background = new ImageIcon(MainFrame.class.getResource("../images/page2.jpg")).getImage();
		public void paint(Graphics g) {
			g.drawImage(Background,0,0,null);
		}
	};
	
	//<html>  /  <br>  /   </html>
	//label)스토리 텍스트 출력
	JLabel txt1 = new JLabel("<html>박시은의 하루</html>");
	JLabel txt2 = new JLabel("<html>박시은은 이번 학기 21학점을 듣습니다.<br>"
			+ "당신은 박시은이 좋은 학점을 받을 수 있도록 도와야합니다.<br>"
			+ "화이팅..!</html>");
	//플레이어 특징 안내 텍스트
		//Change_major
	JLabel Change_major_txt = new JLabel("<html>박시은은 이번 학기에 컴퓨터공학부로 전과를 하였습니다."
			+ "<br>전공적합성을 찾았다는 생각에 인내심이 조금 증가합니다."
			+ "<br>또한 전과생의 패기로 뒤쳐지고 싶지 않아 방학 때 예습을 하여 전공지식이 조금 상승합니다.</html>");
		//Moto
	JLabel Moto_txt = new JLabel("<html><br>박시은의 모토는 '힘들어도 견디면 어떻게든 된다'입니다."
			+ "<br>언제부터 그런 모토가 있었는지는 자신도 모릅니다."
			+ "<br>박시은은 자신의 모토를 따라 행동하기 때문에 체력이 조금 증가하고"
			+ "<br>인내심 또한 조금 증가합니다.</html>");
		//caffein_war
	JLabel caffein_war_txt = new JLabel("<html><br><br>박시은은 '몬스터'라는 카페인 음료를 즐겨마십니다."
			+ "<br>맛으로 먹는 건 아닙니다. 아니긴 한데 맛도 있어서 좋아하는 겁니다. 여튼 아닙니다."
			+ "<br>코드를 작성하는 지금도 마시고 있을지 모릅니다."
			+ "<br>카페인을 마심으로써 반짝! 체력이 살짝 증가합니다."
			+ "<br>또한 피로도도 증가합니다.</html>");
	//1) 밥 뭐 먹어?
	JLabel txt3 = new JLabel("<html>박시은은 어김없이 10시에 일어났습니다."
			+ "<br>배가 고프진 않지만 일단 밥을 먹어야 합니다."
			+ "<br>어떤 걸 먹겠습니까?</html>");
		//선택지1
	static JButton choice1_1 = new JButton ("먹지 않는다.");
	static JButton choice1_2 = new JButton ("남은 찌개에 밥을 먹는다.");
	
	//2) 어떤 과제를 먼저 할까요?
	JLabel txt4 = new JLabel("<html>어쩌다보니 11시가 되었습니다."
			+ "<br>이젠 공부를 시작해야할 시간입니다."
			+ "<br>박시은은 과제를 남은 과제를 확인했습니다."
			+ "<br>어떤 과목의 과제를 먼저 하시겠습니까?</html>");
		//선택지2
	static JButton choice2_1 = new JButton ("c프로그래밍");
	static JButton choice2_2 = new JButton ("<html>컴퓨터<br>구조론</html>");
	static JButton choice2_3 = new JButton ("<html>거북이<br>학습그룹</html>");
		
	//3)졸리다.
	JLabel txt5 = new JLabel("<html>과제를 하던 박시은은 졸립니다."
			+ "<br>어떻게 하시겠습니까?</html>");
		//선택지3
	static JButton choice3_1 = new JButton ("카페인 음료를 마신다");
	static JButton choice3_2 = new JButton ("조금 잔다.");	
	
	//4)게임하고 싶다.
	JLabel txt6 = new JLabel("<html>욕심이 많아서 전과생 주제에 "
			+ "<br>21학점을 듣고 비교과를 왕창 신청한 박시은은"
			+ "<br>잠시 쉬고 싶습니다. "
			+ "<br>게임을 잠시 플레이 하시겠습니까?</html>");
		//선택지4
	static JButton choice4_1 = new JButton ("게임을 한다.");
	static JButton choice4_2 = new JButton ("게임을 하지 않는다.");
	
	//텍스트가 넘어가도록 하는 버튼
	static JButton nextIcon_1 = new JButton ("");
	static JButton nextIcon_2 = new JButton ("");
	static JButton nextIcon_3 = new JButton ("");
	static JButton nextIcon_4 = new JButton ("");
	static JButton nextIcon_5 = new JButton ("");
	private ImageIcon click_next = new ImageIcon(MainFrame.class.getResource("../images/nextIcon.jpg"));
	
	//특징 선택 버튼
	static JButton Change_major = new JButton ("<html>전과생의<br>패기</html>");
	static JButton Moto = new JButton ("존버장인");
	static JButton caffein_war = new JButton ("<html>카페인<br>워리어</html>");
	
	//엔딩
	JLabel ending1 = new JLabel("<html>엔딩1. 체력이 떨어진다아아아.."
			+ "<br>박시은의 체력이 80 이하가 되었습니다."
			+ "<br>아마 박시은은 곧 방전이 되겠군요..</html>");
	JLabel ending2 = new JLabel("<html>엔딩2. 너무 피곤해애애애애애.."
			+ "<br>박시은은 피로도가 30 이상이 되었습니다."
			+ "<br>피곤해서 공부에 집중을 하지 못하겠군요..</html>");
	JLabel ending3 = new JLabel("<html>엔딩3. 좋은 학점을 받았다!.."
			+ "<br>와! 축하드립니다! 좋은 학점을 받았습니다!</html>");
	JLabel ending4 = new JLabel("<html>엔딩4. 그냥 그래요..</html>");

	
	
	public MainFrame() {
		homeframe();
		setpanel();		//패널 관련 설정
		MouseAction();			//마우스 이벤트
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
	
	
	//패널 관련 설정
	public void setpanel() {
		//패널 세팅
		page1.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		page2one.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT - 316);
		
		//버튼 세팅
		StartIcon.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		nextIcon_1.setBounds(500,750,100,60);
		nextIcon_2.setBounds(500,750,100,60);
		nextIcon_3.setBounds(500,750,100,60);
		nextIcon_4.setBounds(500,750,100,60);
		nextIcon_5.setBounds(500,750,100,60);
			//전과생의 패기 버튼
		Change_major.setBounds(45,560,140,80);
		Change_major.setHorizontalAlignment(JLabel.CENTER);
		Change_major.setFont(new Font("DX시인과나", 0, 20));
		Change_major.setBackground(Color.WHITE);
			//존버 장인
		Moto.setBounds(250,560,140,80);
		Moto.setHorizontalAlignment(JLabel.CENTER);
		Moto.setFont(new Font("DX시인과나", 0, 20));
		Moto.setBackground(Color.WHITE);
			//카페인 워리어
		caffein_war.setBounds(445,560,140,80);
		caffein_war.setHorizontalAlignment(JLabel.CENTER);
		caffein_war.setFont(new Font("DX시인과나", 0, 20));
		caffein_war.setBackground(Color.WHITE);
		
			//choice1_1
		choice1_1.setBounds(40,750,250,40);
		choice1_1.setHorizontalAlignment(JLabel.CENTER);
		choice1_1.setFont(new Font("DX시인과나", 0, 20));
		choice1_1.setBackground(Color.WHITE);
			//choice1_2
		choice1_2.setBounds(300,750,250,40);
		choice1_2.setHorizontalAlignment(JLabel.CENTER);
		choice1_2.setFont(new Font("DX시인과나", 0, 20));
		choice1_2.setBackground(Color.WHITE);
		
			//choice2_1
		choice2_1.setBounds(45,730,140,80);
		choice2_1.setHorizontalAlignment(JLabel.CENTER);
		choice2_1.setFont(new Font("DX시인과나", 0, 20));
		choice2_1.setBackground(Color.WHITE);
			//choice2_2
		choice2_2.setBounds(250,730,140,80);
		choice2_2.setHorizontalAlignment(JLabel.CENTER);
		choice2_2.setFont(new Font("DX시인과나", 0, 20));
		choice2_2.setBackground(Color.WHITE);
			//choice2_3
		choice2_3.setBounds(445,730,140,80);
		choice2_3.setHorizontalAlignment(JLabel.CENTER);
		choice2_3.setFont(new Font("DX시인과나", 0, 20));
		choice2_3.setBackground(Color.WHITE);
		
			//choice3_1
		choice3_1.setBounds(40,750,250,40);
		choice3_1.setHorizontalAlignment(JLabel.CENTER);
		choice3_1.setFont(new Font("DX시인과나", 0, 20));
		choice3_1.setBackground(Color.WHITE);
			//choice3_1
		choice3_2.setBounds(300,750,250,40);
		choice3_2.setHorizontalAlignment(JLabel.CENTER);
		choice3_2.setFont(new Font("DX시인과나", 0, 20));
		choice3_2.setBackground(Color.WHITE);
		
			//choice4_1
		choice4_1.setBounds(40,750,250,40);
		choice4_1.setHorizontalAlignment(JLabel.CENTER);
		choice4_1.setFont(new Font("DX시인과나", 0, 20));
		choice4_1.setBackground(Color.WHITE);
			//choice4_2
		choice4_2.setBounds(300,750,250,40);
		choice4_2.setHorizontalAlignment(JLabel.CENTER);
		choice4_2.setFont(new Font("DX시인과나", 0, 20));
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

		//label 세팅
			//txt1
		txt1.setBounds(0,540,MainClass.SCREEN_WIDTH,316);
		txt1.setHorizontalAlignment(JLabel.LEFT);
		txt1.setFont(new Font("DX시인과나", 0, 30));
		txt1.setBackground(Color.WHITE);
			//txt2
		txt2.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		txt2.setHorizontalAlignment(JLabel.LEFT);
		txt2.setFont(new Font("DX시인과나", 0, 20));
		txt2.setBackground(Color.WHITE);
		
			//Change_major_txt
		Change_major_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		Change_major_txt.setHorizontalAlignment(JLabel.LEFT);
		Change_major_txt.setFont(new Font("DX시인과나", 0, 15));
			//Moto_txt
		Moto_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		Moto_txt.setHorizontalAlignment(JLabel.LEFT);
		Moto_txt.setFont(new Font("DX시인과나", 0, 15));
			//caffein_war_txt
		caffein_war_txt.setBounds(0,520,MainClass.SCREEN_WIDTH,316);
		caffein_war_txt.setHorizontalAlignment(JLabel.LEFT);
		caffein_war_txt.setFont(new Font("DX시인과나", 0, 15));
		
			//txt3
		txt3.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt3.setHorizontalAlignment(JLabel.LEFT);
		txt3.setFont(new Font("DX시인과나", 0, 20));
		txt3.setBackground(Color.WHITE);
			//txt4
		txt4.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt4.setHorizontalAlignment(JLabel.LEFT);
		txt4.setFont(new Font("DX시인과나", 0, 20));
		txt4.setBackground(Color.WHITE);	
			//txt5
		txt5.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt5.setHorizontalAlignment(JLabel.LEFT);
		txt5.setFont(new Font("DX시인과나", 0, 20));
		txt5.setBackground(Color.WHITE);
			//txt6
		txt6.setBounds(0,520,MainClass.SCREEN_WIDTH,200);
		txt6.setHorizontalAlignment(JLabel.LEFT);
		txt6.setFont(new Font("DX시인과나", 0, 20));
		txt6.setBackground(Color.WHITE);
			//ending1
		ending1.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending1.setHorizontalAlignment(JLabel.CENTER);
		ending1.setFont(new Font("DX시인과나", 0, 20));
		ending1.setBackground(Color.WHITE);
			//ending2
		ending2.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending2.setHorizontalAlignment(JLabel.CENTER);
		ending2.setFont(new Font("DX시인과나", 0, 20));
		ending2.setBackground(Color.WHITE);
			//ending3
		ending3.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending3.setHorizontalAlignment(JLabel.CENTER);
		ending3.setFont(new Font("DX시인과나", 0, 20));
		ending3.setBackground(Color.WHITE);
			//ending4
		ending4.setBounds(0,0,MainClass.SCREEN_WIDTH,MainClass.SCREEN_HEIGHT);
		ending4.setHorizontalAlignment(JLabel.CENTER);
		ending4.setFont(new Font("DX시인과나", 0, 20));
		ending4.setBackground(Color.WHITE);
		
		//setBorderPainted(버튼 테두리)
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
			//특징 선택지
		add(Change_major);
		add(Moto);
		add(caffein_war);
		add(Change_major_txt);
		add(Moto_txt);
		add(caffein_war_txt);
			//선택지
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
	
	//마우스 이벤트
	public void MouseAction() {
		//startIcon
		StartIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				page1.setVisible(false);
				page2one.setVisible(true);
				txt1.setVisible(true);
				nextIcon_1.setVisible(true);
			}
		});
		
		//nextIcon_1
		nextIcon_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
						
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
						
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				nextIcon_1.setVisible(false);
				nextIcon_2.setVisible(true);
				txt1.setVisible(false);
				txt2.setVisible(true);
			}
		});
		//nextIcon_2
			//특징 선택
		nextIcon_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
						
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
						
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				nextIcon_2.setVisible(false);
				txt2.setVisible(false);
				
				//특성 버튼
				Change_major.setVisible(true);
				Moto.setVisible(true);
				caffein_war.setVisible(true);
			}
		});
		
			//Change_major
		Change_major.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				Change_major_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				Change_major_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				player.Change_major();
					//특성창 false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//텍스트3 true
				txt3.setVisible(true);
					//선택지 버튼 true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
				
			}
		});
		
			//Moto
		Moto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				Moto_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				Moto_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				player.Moto();
					//특성창 false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//텍스트3 true
				txt3.setVisible(true);
					//선택지 버튼 true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
			}
		});
		
			//caffein_war
		caffein_war.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				caffein_war_txt.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				caffein_war_txt.setVisible(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
				player.caffein_war();
					//특성창 false
				Change_major.setVisible(false);
				Moto.setVisible(false);
				caffein_war.setVisible(false);
					//텍스트3 true
				txt3.setVisible(true);
					//선택지 버튼 true
				choice1_1.setVisible(true);
				choice1_2.setVisible(true);
			}
		});
		
		//choice1_1
		choice1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
			
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
			public void mouseEntered(MouseEvent e) {	//마우스 들어갔을 때
				
			}
			@Override
			public void mouseExited(MouseEvent e) {		//마우스가 나왔을 때
				
			}
			@Override
			public void mousePressed(MouseEvent e) {	//클릭했을 때
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
