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

//import objet.ProprietaireO;
//import dao.ProprietaireDao;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JComboBox;

public class AjoutLocataire extends JFrame {

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
	public AjoutLocataire() {
		setResizable(false);
		setTitle("Ajouter un locataire");
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
		
		JButton Ajouter = new JButton("Ajouter");
		Ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(nom.getText().equals("") || prenom.getText().equals("") || cin.getText().equals("") || mail.getText().equals("") || tele.getText().equals(""))
				{  
					JOptionPane.showMessageDialog(null, "verifiez les champs s'il vous plait !!");
				}
				else{
				//ProprietaireDao pdao=new  ProprietaireDao();
				//ProprietaireO p1=new ProprietaireO(nom.getText(),prenom.getText(),cin.getText(),mail.getText(),tele.getText());
				//pdao.save(p1);
				JOptionPane.showMessageDialog(null, "Proprietaire ajouté avec succés !!");
				    }
			}
		});
		Ajouter.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		
		JLabel lblPropritaire = new JLabel("Locataire");
		lblPropritaire.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/proprietaire.png")));
		lblPropritaire.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton Anuuler = new JButton("Annuler");
		Anuuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		Anuuler.setIcon(new ImageIcon(AjoutProprietaire.class.getResource("/Images/supprimer-icone-9337-48.png")));
		
		JLabel lblType = new JLabel("Type :");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4)
								.addComponent(label_3)
								.addComponent(label_2)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(67)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(prenom, Alignment.LEADING)
								.addComponent(nom, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
								.addComponent(cin, Alignment.LEADING)
								.addComponent(mail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
								.addComponent(tele, Alignment.LEADING)
								.addGroup(Alignment.LEADING, gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
										.addComponent(Ajouter)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Anuuler)
										.addGap(12))
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
							.addGap(124))
						.addComponent(lblType)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(202)
							.addComponent(lblPropritaire)))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblPropritaire)
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(label_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(cin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(tele, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblType)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Ajouter)
						.addComponent(Anuuler, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
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
