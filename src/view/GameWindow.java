package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.ATController;
import model.Combat;
import model.Dungeon;
import model.Player;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {

	private JPanel contentPane,titleNamePanel,startButtonPanel,choiceButtonPanel,mainTextPanel,playerPanel;
	private ATController baseController;
	private Container con;
	private JLabel titleNameLabel, hpLabel,hpLabelValue,weaponLabel,weaponLabelType,playerLocation,playerLocationString,diceRoll;
	private JTextArea mainTextArea;
	private JButton startButton,choice1,choice2,choice3,choice4;
	private Font titleFont = new Font("Times New Roman",Font.PLAIN,90);
	private Font normalFont=new Font("Times New Roman",Font.PLAIN,25);
	private Player player;
	private ChoiceHandler choiceHandler=new ChoiceHandler();
	private Dungeon dungeon;
	private Combat combat;
	private int gameMode;
	
	public GameWindow(ATController baseController) {
		setupFrame();
		this.baseController=baseController;
		setupListeners();
		this.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//Set the form to be in center
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);//Set the form to be in center
		startingScreen();
	}
	public void setupFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		con=this.getContentPane();
	}
	public void startingScreen()
	{
		titleNamePanel=new JPanel();
		titleNamePanel.setBounds(100,100,1000,150);
		titleNamePanel.setBackground(Color.black);
		
		startButton=new JButton("START GAME");
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createGameScreen();
			}
		});
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButton.setFocusPainted(false);
		
		startButtonPanel=new JPanel();
		startButtonPanel.setBounds(460,500,250,100);
		startButtonPanel.setBackground(Color.black);
		startButtonPanel.add(startButton);
		
		titleNameLabel=new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		
		con.add(startButtonPanel);
		con.add(titleNamePanel);
		
	}
	public void createGameScreen() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel=new JPanel();
		mainTextPanel.setBounds(100,100,1000,350);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea=new JTextArea("Greetings traveler.\nPlease choose which adventure would you like to play.\nPick any gamemode from below.");
		mainTextArea.setBounds(100,100,1000,350);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel=new JPanel();
		choiceButtonPanel.setBounds(250, 460, 700, 280);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1=new JButton("The dragon's tale");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choiceButtonPanel.add(choice1);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		
		choice2=new JButton("Fight simulator");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choiceButtonPanel.add(choice2);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		
		choice3=new JButton("");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choiceButtonPanel.add(choice3);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		
		choice4=new JButton("");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choiceButtonPanel.add(choice4);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		
		playerPanel=new JPanel();
		playerPanel.setBounds(100,15,1000,100);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		
	//	playerLocation=new JLabel("Location:");
	//	playerLocation.setFont(normalFont);
	//	playerLocation.setForeground(Color.white);
	//	playerPanel.add(playerLocation);
		
		
		playerLocationString=new JLabel("");
		playerLocationString.setFont(normalFont);
		playerLocationString.setForeground(Color.white);
		playerPanel.add(playerLocationString);
		
		
		hpLabel=new JLabel("           Health:");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelValue = new JLabel();
		hpLabelValue.setFont(normalFont);
		hpLabelValue.setForeground(Color.white);
		playerPanel.add(hpLabelValue);
		
		weaponLabel = new JLabel("        Weapon:");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		
		weaponLabelType=new JLabel("");
		weaponLabelType.setFont(normalFont);
		weaponLabelType.setForeground(Color.white);
		playerPanel.add(weaponLabelType);
		
		diceRoll=new JLabel("");
		diceRoll.setFont(normalFont);
		diceRoll.setForeground(Color.white);
		playerPanel.add(diceRoll);
		
		player = new Player(hpLabelValue,weaponLabelType,playerLocationString,diceRoll);
		playerLocationString.setText(player.getPlayerLocation());
		weaponLabelType.setText(player.getPrimaryWeapon().getWeaponName());
		this.hpLabelValue.setText(""+player.getHealth());
		
	}

	public void setupListeners()
	{
		
	}
	public class ChoiceHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
		String playerChoice=event.getActionCommand();
		if(!player.getPlayerLocation().equals("Starting Screen"))
		{
			if(gameMode==1)
			{
				dungeon.setScenerio(playerChoice);
			}
			else if(gameMode==2)
			{
				combat.setScenario(playerChoice);
			}
			
		}
		else
		{
			switch(playerChoice) {
			case "c1":
				dungeon=new Dungeon( mainTextArea, startButton, choice1, choice2, choice3, choice4,player);
				baseController.setDungeon(dungeon);
				gameMode=1;
				break;
			case "c2":
				combat=new Combat(mainTextArea, startButton, choice1, choice2, choice3, choice4, player);
				gameMode=2;
				break;
			case "c3":
				
				break;
			case "c4":
				
				break;
			}
			
		}
			
	 }
   }
}


