import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class ProtonExercise {

	private JFrame frame;
	private JTextPane textPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProtonExercise window = new ProtonExercise();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProtonExercise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Protonlogo = new JLabel("");
		Protonlogo.setHorizontalAlignment(SwingConstants.LEFT);
		Protonlogo.setBackground(Color.WHITE);
		Image img4 = new ImageIcon(this.getClass().getResource("/protonlogo2.png")).getImage();
		Protonlogo.setIcon(new ImageIcon(img4));
		Protonlogo.setFont(new Font("Gill Sans MT", Font.BOLD, 14));
		Protonlogo.setForeground(Color.BLACK);
		Protonlogo.setBounds(131, 11, 338, 60);
		frame.getContentPane().add(Protonlogo);
		
		JButton PersonaButton = new JButton("");
		PersonaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("                  Proton Persona"
						+"\nBasic Salary: RM 4,000"
						+ "\nMonthly installment: RM 600"
						+ "\nHorsePower: 109PS"
						+ "\nFeatures: 1.N95 Cabin Filter | 2.Fancy voice command "
						+ "\nAccessories: 1.Magnetic Sunshade | 2.Spoiler R3");
				/*JOptionPane.showMessageDialog(null, "Proton Persona 2021:"
						+ "\nBasic Salary: RM 4,000"
						+ "\nMonthly installment: RM 600"
						+ "\nHorsePower: 109PS"
						+ "\nFeatures: 1.N95 Cabin Filter | 2.Fancy voice command "
						+ "\nAccesories: 1.Magnetic Sunshade | 2.Spoiler R3");*/
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/persona.png")).getImage();
		PersonaButton.setIcon(new ImageIcon(img));
		PersonaButton.setForeground(Color.GRAY);
		PersonaButton.setBounds(10, 218, 183, 55);
		frame.getContentPane().add(PersonaButton);
		
		JButton x50Button = new JButton("New button");
		x50Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("                  Proton X50"
						+"\nBasic Salary: RM 4,500"
						+ "\nMonthly installment: RM 800"
						+ "\nHorsePower: 175PS"
						+ "\nFeatures: 1.Comprehensive ADAS suite and safety features \n2.Hi-tech infotainment system"
						+ "\nAccessories: 1.Electric Powered Tailgate | 2.Coil Mats | 3.Sunshades");
				/*JOptionPane.showMessageDialog(null, "Proton X50:"
						+ "\nBasic Salary: RM 4,500"
						+ "\nMonthly installment: RM 800"
						+ "\nHorsePower: 175PS"
						+ "\nFeatures: 1.Comprehensive ADAS suite and safety features \n2.Hi-tech infotainment system"
						+ "\nAccesories: 1.Electric Powered Tailgate | 2.Coil Mats | 3.Sunshades");*/
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/x50.png")).getImage();
		x50Button.setIcon(new ImageIcon(img1));
		x50Button.setBounds(10, 284, 183, 55);
		frame.getContentPane().add(x50Button);
		
		JButton x70Button = new JButton("New button");
		x70Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("                  Proton X70"
						+"\nBasic Salary: RM 6,500"
						+ "\nMonthly installment: RM 1,500"
						+ "\nHorsePower: 181PS"
						+ "\nFeatures: 1.Improved Safety Features – TPMS, IHBC, 360 Camera and Parking Sensors | 2. 7-Speed Wet Dual Clutch Transmission"
						+ "\nAccessories: 1.Side steps | 2.Solar film | 3.Rear bumper scuff plate");
				/*JOptionPane.showMessageDialog(null, "Proton X70:"
						+ "\nBasic Salary: RM 5,500"
						+ "\nMonthly installment: RM 1,000"
						+ "\nHorsePower: 181PS"
						+ "\nFeatures: 1.Improved Safety Features – TPMS, IHBC, 360 Camera and Parking Sensors | 2. 7-Speed Wet Dual Clutch Transmission"
						+ "\nAccesories: 1.Side steps | 2.Solar film | 3.Rear bumper scuff plate");*/
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/x70.png")).getImage();
		x70Button.setIcon(new ImageIcon(img2));
		x70Button.setBounds(10, 347, 183, 55);
		frame.getContentPane().add(x70Button);
		
		JButton SagaButton = new JButton("New button");
		SagaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textPane.setText( "                  Proton Saga"
						+"\nBasic Salary: RM 2,500"
						+ "\nMonthly installment: RM 450"
						+ "\nHorsePower: 95PS"
						+ "\nFeatures: 1.Improve ABS, EBD and BA | 2.Improved cabin quality"
						+ "\nAccessories: 1.Leather seats | 2.Side skirt and spoiler");
				/*JOptionPane.showMessageDialog(null, "Proton Saga:"
						+ "\nBasic Salary: RM 2,500"
						+ "\nMonthly installment: RM 450"
						+ "\nHorsePower: 95PS"
						+ "\nFeatures: 1.Improve ABS, EBD and BA | 2.Improved cabin quality"
						+ "\nAccesories: 1.Leather seats | 2.Side skirt and spoiler");*/
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/saga.png")).getImage();
		SagaButton.setIcon(new ImageIcon(img3));
		SagaButton.setBounds(10, 149, 183, 55);
		frame.getContentPane().add(SagaButton);
		
		JLabel lblNewLabel_1 = new JLabel("Please Choose Model That Suits Your Needs");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(137, 94, 332, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textPane = new JTextPane();
		textPane.setForeground(Color.BLACK);
		textPane.setEditable(false);
		textPane.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		textPane.setBackground(SystemColor.menu);
		textPane.setBounds(238, 142, 338, 260);
		frame.getContentPane().add(textPane);
	}
}
