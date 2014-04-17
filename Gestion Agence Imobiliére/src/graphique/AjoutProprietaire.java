package graphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import objet.Proprietaire;
import dao.ProprietaireDAO;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class AjoutProprietaire extends JFrame {

	private JPanel contentPane;
	
	private JTextField nom;
	private JTextField prenom;
	private JTextField cin;
	private JTextField mail;
	private JTextField tele;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutProprietaire frame = new AjoutProprietaire();
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
	public AjoutProprietaire() {
		setResizable(false);
		setTitle("Ajouter un proprietaire");
		setBackground(SystemColor.inactiveCaptionBorder);
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
		
		JLabel label = new JLabel("Nom :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_1 = new JLabel("Pr\u00E9nom :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_2 = new JLabel("CIN :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_3 = new JLabel("E-Mail :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_4 = new JLabel("T\u00E9l\u00E9phone :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		nom = new JTextField();
		nom.setBackground(SystemColor.inactiveCaptionBorder);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBackground(SystemColor.inactiveCaptionBorder);
		prenom.setText("");
		prenom.setColumns(10);
		
		cin = new JTextField();
		cin.setBackground(SystemColor.inactiveCaptionBorder);
		cin.setText("");
		cin.setColumns(10);
		
		mail = new JTextField();
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		mail.setText("");
		mail.setColumns(10);
		
		tele = new JTextField();
		tele.setBackground(SystemColor.inactiveCaptionBorder);
		tele.setText("");
		tele.setColumns(10);
		
		JButton button = new JButton("Ajouter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(nom.getText().equals("") || prenom.getText().equals("") || cin.getText().equals("") || mail.getText().equals("") || tele.getText().equals(""))
				{  
					JOptionPane.showMessageDialog(null, "verifiez les champs s'il vous plait !!");
				}
				else{
				ProprietaireDAO pdao=new  ProprietaireDAO();
				//Proprietaire p1=new Proprietaire(nom.getText(),prenom.getText(),cin.getText(),mail.getText(),tele.getText());
			//	pdao.save(p1);
				JOptionPane.showMessageDialog(null, "Proprietaire ajouté avec succés !!");
				    }
			}
		});
		button.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		
		JLabel lblPropritaire = new JLabel("Propri\u00E9taire");
		lblPropritaire.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/proprietaire.png")));
		lblPropritaire.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_1 = new JButton("Annuler");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button_1.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/supprimer-icone-9337-48.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2)
								.addComponent(label_3)
								.addComponent(label_4)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(57)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(prenom, Alignment.LEADING)
										.addComponent(nom, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(57)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(tele, Alignment.LEADING)
										.addComponent(mail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
										.addComponent(cin, Alignment.LEADING)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(187)
							.addComponent(lblPropritaire))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(112)
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
							.addComponent(button_1)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(110, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addComponent(lblPropritaire)
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(tele, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
