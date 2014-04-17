package graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class AppartementI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private javax.swing.JScrollPane jScrollPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppartementI frame = new AppartementI();
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
	public AppartementI() {
		setResizable(false);
		setTitle("Gestion des Appartements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1013, 475);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.highlight"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel btn = new JPanel();
		btn.setBackground(UIManager.getColor("Button.highlight"));
		
		JLabel lblGestionDesAppartements = new JLabel("Gestion des appartements");
		lblGestionDesAppartements.setIcon(new ImageIcon(AppartementI.class.getResource("/Images/logo-appartement.jpg")));
		lblGestionDesAppartements.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		table = new JTable();
		

		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(btn, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 729, GroupLayout.PREFERRED_SIZE)
							.addGap(22))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGap(177)
							.addComponent(btnRechercher, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(207)
					.addComponent(lblGestionDesAppartements)
					.addContainerGap(429, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnRechercher, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(313))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btn, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
								.addComponent(table, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
							.addGap(22))))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblGestionDesAppartements)
					.addContainerGap(372, Short.MAX_VALUE))
		);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon(AppartementI.class.getResource("/Images/modifier.png")));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(AppartementI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnSupprimer.setBackground(Color.WHITE);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon(AppartementI.class.getResource("/Images/Symbol-Add.png")));
		GroupLayout gl_btn = new GroupLayout(btn);
		gl_btn.setHorizontalGroup(
			gl_btn.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_btn.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_btn.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_btn.createSequentialGroup()
							.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_btn.createSequentialGroup()
							.addGroup(gl_btn.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSupprimer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
								.addComponent(btnModifier, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE))
							.addGap(25))))
		);
		gl_btn.setVerticalGroup(
			gl_btn.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_btn.createSequentialGroup()
					.addGap(49)
					.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		btn.setLayout(gl_btn);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
