import java.awt.EventQueue;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class MainWindow {

	static String selectionClassB = null;
	static String selectionClassA = null;
	
	static WeaponBehavior currentWeaponA = null;
	static WeaponBehavior currentWeaponB = null;
	
	static Character currentCharacterA = null;
	static Character currentCharacterB = null;
	
	private JFrame frmRpgfightsim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmRpgfightsim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRpgfightsim = new JFrame();
		frmRpgfightsim.setTitle("RPG-Fight-Sim");
		frmRpgfightsim.setBounds(100, 100, 860, 650);
		frmRpgfightsim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRpgfightsim.getContentPane().setLayout(null);
		

		JLabel lblCharImageA = new JLabel("");
		lblCharImageA.setBounds(25, 25, 369, 350);
		frmRpgfightsim.getContentPane().add(lblCharImageA);
		
		JLabel lblCharImageB = new JLabel("");
		lblCharImageB.setBounds(452, 25, 369, 350);
		frmRpgfightsim.getContentPane().add(lblCharImageB);
		
		JLabel lblWeaponSlotA = new JLabel("");
		lblWeaponSlotA.setBounds(25, 408, 300, 60);
		frmRpgfightsim.getContentPane().add(lblWeaponSlotA);
		
		JLabel lblWeaponSlotB = new JLabel("");
		lblWeaponSlotB.setBounds(520, 408, 300, 60);
		frmRpgfightsim.getContentPane().add(lblWeaponSlotB);
		
		
		Choice choiceClassA = new Choice();
		choiceClassA.setBounds(25, 489, 127, 20);
		choiceClassA.add("Knight");
		choiceClassA.add("Troll");
		choiceClassA.add("King");
		choiceClassA.add("Queen");
		frmRpgfightsim.getContentPane().add(choiceClassA);
		
		Choice choiceWeaponA = new Choice();
		choiceWeaponA.setBounds(186, 489, 127, 20);
		choiceWeaponA.add("Sword");
		choiceWeaponA.add("Bow and Arrow");
		choiceWeaponA.add("No Weapon");
		choiceWeaponA.add("Frost Staff");
		frmRpgfightsim.getContentPane().add(choiceWeaponA);
		
		Choice choiceClassB = new Choice();
		choiceClassB.setBounds(520, 489, 127, 20);
		choiceClassB.add("Knight");
		choiceClassB.add("Troll");
		choiceClassB.add("King");
		choiceClassB.add("Queen");
		frmRpgfightsim.getContentPane().add(choiceClassB);
		
		Choice choiceWeaponB = new Choice();
		choiceWeaponB.setBounds(693, 489, 127, 20);
		choiceWeaponB.add("Sword");
		choiceWeaponB.add("Bow and Arrow");
		choiceWeaponB.add("No Weapon");
		choiceWeaponB.add("Frost Staff");
		frmRpgfightsim.getContentPane().add(choiceWeaponB);
			
		
		JButton btnConfirmA = new JButton("Confirm Player I");
		btnConfirmA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectionClassA = choiceClassA.getSelectedItem();
				String selectionWeaponA = choiceWeaponA.getSelectedItem();				
				
				switch(selectionWeaponA) {
				case "Sword":
					currentWeaponA = new Sword();
					break;
				case "Bow and Arrow":
					currentWeaponA = new BowAndArrow();
					break;
				case "No Weapon":
					currentWeaponA = new NoWeapon();
					break;
				case "Frost Staff":
					currentWeaponA = new FrostStaff();
					break;
				}
				switch(selectionClassA) {
				case "Knight":
					currentCharacterA = new Knight(currentWeaponA);
					break;
				case "Troll":
					currentCharacterA = new Troll(currentWeaponA);
					break;
				case "Queen":
					currentCharacterA = new Queen(currentWeaponA);
					break;
				case "King":
					currentCharacterA = new King(currentWeaponA);
					break;
				}
				System.out.println("Player I chose "+ selectionClassA +" with " + selectionWeaponA + "!");
				lblCharImageA.setIcon(new ImageIcon(getClass().getClassLoader().getResource(currentCharacterA.anzeigen())));
				lblWeaponSlotA.setIcon(new ImageIcon(getClass().getClassLoader().getResource(currentWeaponA.waffeAnzeigen())));
			}
		});
		
		
		btnConfirmA.setBounds(101, 535, 147, 23);
		frmRpgfightsim.getContentPane().add(btnConfirmA);
		
		JButton btnConfirmB = new JButton("Confirm Player II");
		btnConfirmB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectionClassB = choiceClassB.getSelectedItem();
				String selectionWeaponB = choiceWeaponB.getSelectedItem();
				
				switch(selectionWeaponB) {
				case "Sword":
					currentWeaponB = new Sword();
					break;
				case "Bow and Arrow":
					currentWeaponB = new BowAndArrow();
					break;
				case "No Weapon":
					currentWeaponB = new NoWeapon();
					break;
				case "Frost Staff":
					currentWeaponB = new FrostStaff();
					break;
				}
				switch(selectionClassB) {
				case "Knight":
					currentCharacterB = new Knight(currentWeaponB);
					break;
				case "Troll":
					currentCharacterB = new Troll(currentWeaponB);
					break;
				case "Queen":
					currentCharacterB = new Queen(currentWeaponA);
					break;
				case "King":
					currentCharacterB = new King(currentWeaponA);
					break;
				}
				System.out.println("Player II chose "+ selectionClassB +" with " + selectionWeaponB + "!");
				lblCharImageB.setIcon(new ImageIcon(getClass().getClassLoader().getResource(currentCharacterB.anzeigen())));
				lblWeaponSlotB.setIcon(new ImageIcon(getClass().getClassLoader().getResource(currentWeaponB.waffeAnzeigen())));
			}
		});
		
		btnConfirmB.setBounds(603, 535, 147, 23);
		frmRpgfightsim.getContentPane().add(btnConfirmB);
				
		
		ImageIcon lost = new ImageIcon(getClass().getClassLoader().getResource("skull.png"));
		
		JButton btnStartFight = new JButton("Fight!");
		btnStartFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Fight Started!");
				currentCharacterA.fight(selectionClassB,currentCharacterA.getRole());
				currentCharacterB.fight(selectionClassA,currentCharacterB.getRole());
				int rollA = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				int rollB = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				System.out.println("rollA: " + rollA);
				System.out.println("rollB: " + rollB);
				
				if(rollA>rollB) {
					System.out.println("Player I WINS");
					lblCharImageB.setIcon(lost);
				}
				if(rollA==rollB) {
					System.out.println("Both Players DIED");
					lblCharImageA.setIcon(lost);
					lblCharImageB.setIcon(lost);
				}
				if(rollA<rollB) {
					System.out.println("Player II WINS");
					lblCharImageA.setIcon(lost);
				}
			}
		});
		btnStartFight.setBounds(375, 516, 89, 61);
		frmRpgfightsim.getContentPane().add(btnStartFight);			
	}
}
