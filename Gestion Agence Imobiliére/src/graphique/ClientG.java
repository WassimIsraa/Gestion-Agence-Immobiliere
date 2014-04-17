package graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import dao.ClientDAO;

import objet.Client;
import dao.ClientDAO;
import javax.swing.JTable;
public class ClientG extends JFrame  implements ActionListener{

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JButton b1,b2,b3;
	public JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientG frame = new ClientG();
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
	public ClientG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel l1 = new JLabel("Id");
		
		JLabel l2 = new JLabel("Nom");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		 b1 = new JButton("Ajouter");
		 b1.setForeground(Color.RED);
		 b1.setBackground(Color.YELLOW);b1.addActionListener(this);
		
		 b2 = new JButton("Supprimer");b2.addActionListener(this);
		
		 b3 = new JButton("Modifier");b3.addActionListener(this);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(b1)
							.addGap(29)
							.addComponent(b2)
							.addGap(56)
							.addComponent(b3)
							.addGap(88))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(l1)
								.addComponent(l2))
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addGap(160))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(b1)
						.addComponent(b2)
						.addComponent(b3))
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public int getTf1()
	{
		return Integer.parseInt(textField.getText());
	}
	public String getTf2()
	{
		return textField.getText();
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Ajouter"))
		{
			if(textField.getText().equals("") || textField_1.getText().equals("") )
			{   System.out.println("mchetttt");
				textField.setBackground(Color.pink);textField_1.setBackground(Color.pink);
				  JOptionPane.showMessageDialog(null, " Un ou plusieurs champs vides !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			}
			else{	
		    ClientDAO dao=new ClientDAO();
			//Client client=new Client(getTf1(),getTf2());
			//dao.save(client);
			JOptionPane.showMessageDialog(null, " Client Ajouté avec succés !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			    }
		}
		
		if(e.getActionCommand().equals("Modifier"))
		{
			
			if(textField.getText().equals("") || textField_1.getText().equals("") )
			{   //System.out.println("mchetttt");
				textField.setBackground(Color.pink);textField_1.setBackground(Color.pink);
				  JOptionPane.showMessageDialog(null, " Un ou plusieurs champs vides !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			}
			else{	
		    ClientDAO dao=new ClientDAO();
			//Client client=new Client(getTf1(),getTf2());
			//dao.update(client);
			JOptionPane.showMessageDialog(null, " Client Modifié avec succés !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			    }
		}
		
		if(e.getActionCommand().equals("Supprimer"))
		{
			
			if(textField.getText().equals("") || textField_1.getText().equals("") )
			{   //System.out.println("mchetttt");
				textField.setBackground(Color.pink);textField_1.setBackground(Color.pink);
				  JOptionPane.showMessageDialog(null, " Un ou plusieurs champs vides !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			}
			else{	
		    ClientDAO dao=new ClientDAO();
			//Client client=new Client(getTf1(),getTf2());
			//dao.delete(client);
			JOptionPane.showMessageDialog(null, " Client supprimé avec succés !!", "Alerte",JOptionPane.ERROR_MESSAGE);
			    }
		}
		
	}
	
	
	
	public static void main1(String[] args)
	{
		//System.out.println("mchetttt");  
		ClientG cg=new ClientG();
		cg.show();
	}
}
