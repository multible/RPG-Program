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
		frmRpgfightsim.getContentPane().add(choiceClassA);
		
		Choice choiceWeaponA = new Choice();
		choiceWeaponA.setBounds(186, 489, 127, 20);
		choiceWeaponA.add("Sword");
		choiceWeaponA.add("Bow and Arrow");
		choiceWeaponA.add("No Weapon");
		frmRpgfightsim.getContentPane().add(choiceWeaponA);
		
		Choice choiceClassB = new Choice();
		choiceClassB.setBounds(520, 489, 127, 20);
		choiceClassB.add("Knight");
		choiceClassB.add("Troll");
		frmRpgfightsim.getContentPane().add(choiceClassB);
		
		Choice choiceWeaponB = new Choice();
		choiceWeaponB.setBounds(693, 489, 127, 20);
		choiceWeaponB.add("Sword");
		choiceWeaponB.add("Bow and Arrow");
		choiceWeaponB.add("No Weapon");
		frmRpgfightsim.getContentPane().add(choiceWeaponB);
			
		
		JButton btnConfirmA = new JButton("Confirm Player I");
		btnConfirmA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectionClassA = choiceClassA.getSelectedItem();
				String selectionWeaponA = choiceWeaponA.getSelectedItem();				
				
				if(selectionWeaponA == "Sword") {
					
					currentWeaponA = new Sword();
					
				}
				if(selectionWeaponA == "Bow and Arrow") {
					
					currentWeaponA = new BowAndArrow();
					
				}
				if(selectionWeaponA == "No Weapon") {
					
					currentWeaponA = new NoWeapon();
					
				}
				if(selectionClassA == "Knight" )
				{
					currentCharacterA = new Knight(currentWeaponA);
				}
				if(selectionClassA == "Troll" )
				{
					currentCharacterA = new Troll(currentWeaponA);
				}
				System.out.println("Player I chose "+ selectionClassA +" with " + selectionWeaponA + "!");
				lblCharImageA.setIcon(new ImageIcon(currentCharacterA.anzeigen()));
				lblWeaponSlotA.setIcon(new ImageIcon(currentWeaponA.waffeAnzeigen()));
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
				
				if(selectionWeaponB == "Sword") {
					
					currentWeaponB = new Sword();
					
				}
				if(selectionWeaponB == "Bow and Arrow") {
					
					currentWeaponB = new BowAndArrow();
					
				}
				if(selectionWeaponB == "No Weapon") {
					
					currentWeaponB = new NoWeapon();
					
				}
				if(selectionClassB == "Knight" )
				{
					currentCharacterB = new Knight(currentWeaponB);
				}
				if(selectionClassB == "Troll" )
				{
					currentCharacterB = new Troll(currentWeaponB);
				}
				System.out.println("Player I chose "+ selectionClassB +" with " + selectionWeaponB + "!");
				lblCharImageB.setIcon(new ImageIcon(currentCharacterB.anzeigen()));
				lblWeaponSlotB.setIcon(new ImageIcon(currentWeaponB.waffeAnzeigen()));
				
			}
		});
		
		btnConfirmB.setBounds(603, 535, 147, 23);
		frmRpgfightsim.getContentPane().add(btnConfirmB);
				
		
		JButton btnStartFight = new JButton("Fight!");
		btnStartFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Fight Started!");
				currentCharacterA.fight(selectionClassA);
				currentCharacterB.fight(selectionClassB);
				int rollA = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				int rollB = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				System.out.println("rollA: " + rollA);
				System.out.println("rollB: " + rollB);
				
				if(rollA>rollB) {
					System.out.println("Player I WINS");
					lblCharImageB.setIcon(new ImageIcon("src\\res\\skull.png"));
				}
				if(rollA==rollB) {
					System.out.println("Both Players DIED");
					lblCharImageA.setIcon(new ImageIcon("src\\res\\skull.png"));
					lblCharImageB.setIcon(new ImageIcon("src\\res\\skull.png"));
				}
				if(rollA<rollB) {
					System.out.println("Player II WINS");
					lblCharImageA.setIcon(new ImageIcon("src\\res\\skull.png"));
				}
			}
		});
		btnStartFight.setBounds(375, 516, 89, 61);
		frmRpgfightsim.getContentPane().add(btnStartFight);
		

		
		
		
		
	}
}
