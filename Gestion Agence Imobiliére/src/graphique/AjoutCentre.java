package graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutCentre extends JFrame {

	private JPanel contentPane;
	private JTextField rue;
	private JTextField code;
	private JTextField surface;
	private JTextField prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutAppartement frame = new AjoutAppartement();
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
	public AjoutCentre() {
		setTitle("Ajouter centre commercial");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 580);
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
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblAjouterUnAppartement = new JLabel("Ajouter un centre commercial");
		lblAjouterUnAppartement.setIcon(new ImageIcon(AjoutCentre.class.getResource("/Images/logo-locauxcommerciaux.jpg")));
		lblAjouterUnAppartement.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Adresse", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel label = new JLabel("Surface en m\u00B2 :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("Prix :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_4 = new JLabel("Description :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea description = new JTextArea();
		description.setBackground(SystemColor.inactiveCaptionBorder);
		
		surface = new JTextField();
		surface.setBackground(SystemColor.inactiveCaptionBorder);
		surface.setColumns(10);
		
		prix = new JTextField();
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		prix.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAjouter.setIcon(new ImageIcon(AjoutAppartement.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		btnAjouter.setBackground(Color.WHITE);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(AjoutAppartement.class.getResource("/Images/supprimer-icone-9337-48.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(label_1)
										.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
									.addGap(30)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(description, GroupLayout.PREFERRED_SIZE, 379, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(prix, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
											.addComponent(surface, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(138)
							.addComponent(btnAjouter)
							.addGap(40)
							.addComponent(btnAnnuler))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(167)
							.addComponent(lblAjouterUnAppartement, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addComponent(lblAjouterUnAppartement)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(surface, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_1)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(32)
							.addComponent(description, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(68)
							.addComponent(label_4)
							.addContainerGap())))
		);
		
		JLabel lblNewLabel = new JLabel("Ville :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblRue = new JLabel("Rue :");
		lblRue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		rue = new JTextField();
		rue.setBackground(SystemColor.inactiveCaptionBorder);
		rue.setColumns(10);
		
		JComboBox boxville = new JComboBox();
		
		JLabel lblCodePostal = new JLabel("Code Postal :");
		lblCodePostal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		code = new JTextField();
		code.setBackground(SystemColor.inactiveCaptionBorder);
		code.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(lblRue)
					.addGap(35)
					.addComponent(rue, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(138)
					.addComponent(lblCodePostal)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(code, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRue)
						.addComponent(boxville, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
							.addComponent(code, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(lblCodePostal)
							.addContainerGap())))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
