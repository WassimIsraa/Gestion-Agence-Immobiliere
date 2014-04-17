package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField pwd;

	/**
	 * Launch the application.
	 */
 
	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Authentification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 377);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		
		JLabel lblNomDeLutilisateur = new JLabel("Nom de l'utilisateur :");
		lblNomDeLutilisateur.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Tahoma", Font.ITALIC, 15));
		
		login = new JTextField();
		login.setColumns(10);
		
		pwd = new JTextField();
		pwd.setColumns(10);
		
		JLabel lblAuthentification = new JLabel("Authentification ");
		lblAuthentification.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/Images/kgpg-icone-6007-128.png")));
		
		JButton connexion = new JButton("Connexion");
		connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String l=login.getText();
				String m =pwd.getText();


				boolean b=false;

				if (l.equals("admin")== false){
				JOptionPane.showMessageDialog(null," Login incorrect Essayer de nouveau","Error Message",JOptionPane.ERROR_MESSAGE);}
				if (m.equals("1234")== false){JOptionPane.showMessageDialog(null," Mot de passe incoorrect Essayer de nouveau\n","Error Message",JOptionPane.ERROR_MESSAGE);
				}
				  
				 
				if((l.equals("admin"))&&(m.equals("1234"))){
				          
				       
				                new MenuPrincipal().setVisible(true);
				            }
				            else
				            {
				                JOptionPane.showMessageDialog(null,"Login ou Mot_passe est incorrecte ", "Erreur", JOptionPane.ERROR_MESSAGE,null);
				            } this.setVisible(false);

		  }

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}});
		connexion.setIcon(new ImageIcon(Login.class.getResource("/Images/limportation-kgpg-icone-9298-48.png")));
		connexion.setFont(new Font("Tahoma", Font.ITALIC, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblAuthentification))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblMotDePasse)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(pwd, 186, 186, 186))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNomDeLutilisateur)
									.addGap(42)
									.addComponent(login, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(154, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(255, Short.MAX_VALUE)
					.addComponent(connexion)
					.addGap(220))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(45)
							.addComponent(lblAuthentification)))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomDeLutilisateur)
						.addComponent(login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMotDePasse)
						.addComponent(pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(connexion)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Login().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
}
