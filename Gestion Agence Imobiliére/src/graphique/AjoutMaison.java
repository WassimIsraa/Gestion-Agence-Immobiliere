package graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutMaison extends JFrame {

	private JPanel contentPane;
	private JButton btnAjouter;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField surface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutMaison frame = new AjoutMaison();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjoutMaison() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblAjouterUneMaison = new JLabel("Ajouter une maison");
		lblAjouterUneMaison.setIcon(new ImageIcon(AjoutMaison.class.getResource("/Images/maison - Copie.png")));
		lblAjouterUneMaison.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel label_4 = new JLabel("Surface en m\u00B2 :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_5 = new JLabel("Prix :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblGarage = new JLabel("Garage :");
		lblGarage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton ouigarage = new JRadioButton("oui");
		ouigarage.setBackground(Color.WHITE);
		
		JRadioButton nongarage = new JRadioButton("non");
		nongarage.setBackground(Color.WHITE);
		
		JLabel lblJardin = new JLabel("Jardin :");
		lblJardin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton ouijrd = new JRadioButton("oui");
		ouijrd.setBackground(Color.WHITE);
		
		JRadioButton nonjrd = new JRadioButton("non");
		nonjrd.setBackground(Color.WHITE);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea descM = new JTextArea();
		descM.setBackground(SystemColor.inactiveCaptionBorder);
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouter.setIcon(new ImageIcon(AjoutMaison.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(AjoutMaison.class.getResource("/Images/supprimer-icone-9337-48.png")));
		
		JLabel lblChambre = new JLabel("Chambre :");
		lblChambre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox boxchambre = new JComboBox();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Adresse", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Ville :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_1 = new JLabel("Rue :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("Code Postal :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 475, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(label_1)
					.addGap(35)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(138)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 105, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(label_2)
							.addContainerGap())))
		);
		panel_1.setLayout(gl_panel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		
		surface = new JTextField();
		surface.setColumns(10);
		surface.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(551, Short.MAX_VALUE)
					.addComponent(lblAjouterUneMaison)
					.addGap(167))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(417, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblJardin, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGarage)
										.addComponent(lblChambre))
									.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(boxchambre, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(ouigarage)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(nongarage))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(ouijrd)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(nonjrd))
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(surface, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblDescription)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnAjouter)
							.addGap(17)))
					.addGap(26)
					.addComponent(btnAnnuler)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(130, Short.MAX_VALUE)
					.addComponent(descM, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
					.addGap(29))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblAjouterUneMaison)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(surface, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblJardin)
						.addComponent(ouijrd)
						.addComponent(nonjrd))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(37)
							.addComponent(nongarage))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGarage)
								.addComponent(ouigarage))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(boxchambre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(lblChambre)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(descM, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(32)
							.addComponent(lblDescription)
							.addContainerGap())))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
