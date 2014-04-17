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
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JButton;

public class AjoutContratL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutContratL frame = new AjoutContratL();
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
	public AjoutContratL() {
		setTitle("Ajouter un contrat de location");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 580);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblAjouterUnCentre = new JLabel("Ajouter un contrat de location");
		lblAjouterUnCentre.setIcon(new ImageIcon(AjoutContratL.class.getResource("/Images/100915_contrat.jpg")));
		lblAjouterUnCentre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Date", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon(AjoutContratL.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(AjoutContratL.class.getResource("/Images/supprimer-icone-9337-48.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(131, Short.MAX_VALUE)
					.addComponent(lblAjouterUnCentre, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addGap(60))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addComponent(lblDescription)
					.addGap(18)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(171)
					.addComponent(btnAjouter)
					.addGap(28)
					.addComponent(btnSupprimer)
					.addContainerGap(133, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addComponent(lblAjouterUnCentre, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(102)
							.addComponent(lblDescription)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
						.addComponent(btnAjouter))
					.addContainerGap())
		);
		
		JLabel lblDateDeSignature = new JLabel("Date de signature :");
		lblDateDeSignature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("Date debut :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setColumns(10);
		
		JLabel lblDateFin = new JLabel("Date fin :");
		lblDateFin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(34)
							.addComponent(lblDateDeSignature)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(29)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(75)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDateDeSignature)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(label)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblDateFin)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(23))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
