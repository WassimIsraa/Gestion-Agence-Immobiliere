package graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class locataire extends JFrame {

	private JPanel contentPane;
	private JTextField recherchertxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					locataire frame = new locataire();
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
	public locataire() {
		setTitle("gestion des locataires");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 475);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JButton button = new JButton("Ajouter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutLocataire a = new AjoutLocataire();
				a.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(locataire.class.getResource("/Images/Symbol-Add.png")));
		
		JButton button_1 = new JButton("Supprimer");
		button_1.setIcon(new ImageIcon(locataire.class.getResource("/Images/supprimer.png")));
		
		JButton button_2 = new JButton("Modifier");
		button_2.setIcon(new ImageIcon(locataire.class.getResource("/Images/modifier.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 162, Short.MAX_VALUE)
				.addGap(0, 162, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 258, Short.MAX_VALUE)
				.addGap(0, 258, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblGestionDesLocataires = new JLabel("Gestion des Locataires");
		lblGestionDesLocataires.setIcon(new ImageIcon(locataire.class.getResource("/Images/proprietaire.png")));
		lblGestionDesLocataires.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JButton btnRechercher = new JButton("Rechercher");
		
		recherchertxt = new JTextField();
		recherchertxt.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(204)
					.addComponent(btnRechercher, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(recherchertxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(307, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(315, Short.MAX_VALUE)
					.addComponent(lblGestionDesLocataires, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
					.addGap(229))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblGestionDesLocataires, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(recherchertxt, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRechercher, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
