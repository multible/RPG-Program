import java.awt.EventQueue;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow {

	static WeaponBehavior currentWeapon = null;
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
		

		
		Choice choiceClassA = new Choice();
		choiceClassA.setBounds(25, 489, 127, 20);
		choiceClassA.add("Knight");
		choiceClassA.add("Troll");
		frmRpgfightsim.getContentPane().add(choiceClassA);
		
		Choice choiceWeaponA = new Choice();
		choiceWeaponA.setBounds(186, 489, 127, 20);
		choiceWeaponA.add("Sword");
		choiceWeaponA.add("Bow and Arrow");
		frmRpgfightsim.getContentPane().add(choiceWeaponA);
		
		Choice choiceClassB = new Choice();
		choiceClassB.setBounds(509, 489, 127, 20);
		choiceClassB.add("Knight");
		choiceClassB.add("Troll");
		frmRpgfightsim.getContentPane().add(choiceClassB);
		
		Choice choiceWeaponB = new Choice();
		choiceWeaponB.setBounds(656, 489, 127, 20);
		choiceWeaponB.add("Sword");
		choiceWeaponB.add("Bow and Arrow");
		frmRpgfightsim.getContentPane().add(choiceWeaponB);
			
		
		JButton btnConfirmA = new JButton("Confirm Player I");
		btnConfirmA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String selectionClass = choiceClassA.getSelectedItem();
				String selectionWeapon = choiceWeaponA.getSelectedItem();				
				
				if(selectionWeapon == "Sword") {
					
					currentWeapon = new Sword();
					
				}
				if(selectionWeapon == "Bow and Arrow") {
					
					currentWeapon = new BowAndArrow();
					
				}
				if(selectionClass == "Knight" )
				{
					currentCharacterA = new Knight(currentWeapon);
				}
				if(selectionClass == "Troll" )
				{
					currentCharacterA = new Troll(currentWeapon);
				}
				System.out.println("Player I chose "+ selectionClass +" with " + selectionWeapon + "!");
				currentCharacterA.anzeigen();
			}
		});
		
		
		btnConfirmA.setBounds(93, 535, 147, 23);
		frmRpgfightsim.getContentPane().add(btnConfirmA);
		
		JButton btnConfirmB = new JButton("Confirm Player II");
		btnConfirmB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String selectionClass = choiceClassB.getSelectedItem();
				String selectionWeapon = choiceWeaponB.getSelectedItem();				
				
				if(selectionWeapon == "Sword") {
					
					currentWeapon = new Sword();
					
				}
				if(selectionWeapon == "Bow and Arrow") {
					
					currentWeapon = new BowAndArrow();
					
				}
				if(selectionClass == "Knight" )
				{
					currentCharacterB = new Knight(currentWeapon);
				}
				if(selectionClass == "Troll" )
				{
					currentCharacterB = new Troll(currentWeapon);
				}
				System.out.println("Player I chose "+ selectionClass +" with " + selectionWeapon + "!");
				currentCharacterB.anzeigen();
				
			}
		});
		
		btnConfirmB.setBounds(579, 535, 147, 23);
		frmRpgfightsim.getContentPane().add(btnConfirmB);
				
		
		JButton btnStartFight = new JButton("Fight!");
		btnStartFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Fight Started!");
				currentCharacterA.fight();
				currentCharacterB.fight();
				int rollA = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				int rollB = ThreadLocalRandom.current().nextInt(1, 100 + 1);
				System.out.println("rollA: " + rollA);
				System.out.println("rollB: " + rollB);
				
				if(rollA>rollB) {
					System.out.println("Player I WINS");
				}
				if(rollA==rollB) {
					System.out.println("Both Players DIED");
				}
				if(rollA<rollB) {
					System.out.println("Player II WINS");
				}
			}
		});
		btnStartFight.setBounds(362, 517, 89, 61);
		frmRpgfightsim.getContentPane().add(btnStartFight);
		
	}
}
