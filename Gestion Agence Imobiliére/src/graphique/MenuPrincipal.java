

package graphique;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JMenu;

public class MenuPrincipal extends javax.swing.JFrame {

 
    public MenuPrincipal() {
    	setResizable(false);
    	getContentPane().setBackground(Color.WHITE);
    	setBackground(SystemColor.inactiveCaptionBorder);
       
        initComponents();
        this.setLocationRelativeTo(null);
              //this.setAlwaysOnTop(true); 
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.WHITE);
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        proprietaire = new javax.swing.JMenuItem();
        Locataire = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        appar = new javax.swing.JMenuItem();
        maison = new javax.swing.JMenuItem();
        terrain = new javax.swing.JMenuItem();
        centrecommercial = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Immobilière");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maison.png")));
        
        JLabel lblBienvenueDansGestion = new JLabel("Bienvenue dans Gestion Immobili\u00E8re");
        lblBienvenueDansGestion.setFont(new Font("Tahoma", Font.BOLD, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel1)
        			.addGap(46)
        			.addComponent(lblBienvenueDansGestion, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(lblBienvenueDansGestion, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jMenu1.setText("Gestion des Clients");
   

        proprietaire.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/locataires.png"))); // NOI18N
        proprietaire.setText("propri\u00E9taires");
        proprietaire.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  				Proprietaire p = new Proprietaire();
  	        	p.setVisible(true);
  			}
  			 
  		});
        jMenu1.add(proprietaire);

        Locataire.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/proprietaire.png"))); // NOI18N
        Locataire.setText("Locataires");
   
        jMenu1.add(Locataire);
        Locataire.addActionListener(new java.awt.event.ActionListener ()
      		{
      			public void actionPerformed(java.awt.event.ActionEvent e )
      			{
      				locataire l = new locataire();
      	        	l.setVisible(true);
      			}
      			 
      		});

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestion des bien immeubles");

        appar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg"))); // NOI18N
        appar.setText("Appartement");
        jMenu2.add(appar);
        appar.addActionListener(new java.awt.event.ActionListener ()
		{
			public void actionPerformed(java.awt.event.ActionEvent e )
			{
				AppartementI a = new AppartementI();
	        	a.setVisible(true);
			}
			 
		});

        maison.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/maison - Copie.png"))); // NOI18N
        maison.setText("Maison");

        jMenu2.add(maison);
        maison.addActionListener(new java.awt.event.ActionListener ()
     		{
     			public void actionPerformed(java.awt.event.ActionEvent e )
     			{
     				MaisonI ma = new MaisonI();
     	        	ma.setVisible(true);
     			}
     			 
     		});

        terrain.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-terrain.jpg"))); // NOI18N
        terrain.setText("Terrain");
        jMenu2.add(terrain);
        terrain.addActionListener(new java.awt.event.ActionListener ()
 		{
 			public void actionPerformed(java.awt.event.ActionEvent e )
 			{
 				Terrain te = new Terrain();
 	        	te.setVisible(true);
 			}
 			 
 		});
        centrecommercial.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-locauxcommerciaux.jpg"))); // NOI18N
        centrecommercial.setText("Centre Commercial");

        jMenu2.add(centrecommercial);
        centrecommercial.addActionListener(new java.awt.event.ActionListener ()
 		{
 			public void actionPerformed(java.awt.event.ActionEvent e )
 			{
 				CentreCom cc = new CentreCom();
 	        	cc.setVisible(true);
 			}
 			 
 		});
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        mnCrationContrat = new JMenu("Gestion des  Contrats");
        mnCrationContrat.setBackground(Color.BLACK);
        jMenuBar1.add(mnCrationContrat);

        mntmContratDeLocation = new JMenuItem("Contrat de location");
        mntmContratDeLocation.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/100915_contrat.jpg")));
        mnCrationContrat.add(mntmContratDeLocation);
        mntmContratDeLocation.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  				Contrat l= new Contrat();
				l.setVisible(true);
  			}
  			 
  		});
        
        
        mntmConratDachat = new JMenuItem("Contrat d'achat");
        mntmConratDachat.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/a\u00E9ra.jpg")));
        mnCrationContrat.add(mntmConratDachat);
        mntmConratDachat.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  			
  			}
  			 
  		});
        
        mnAide = new JMenu("Aide");
        mnAide.setBackground(Color.BLACK);
        jMenuBar1.add(mnAide);        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }                                 

                                             

    private javax.swing.JMenuItem proprietaire;
    private javax.swing.JMenuItem centrecommercial;
    private javax.swing.JMenuItem maison;
    private javax.swing.JMenuItem Locataire;
    private javax.swing.JMenuItem terrain;
    private javax.swing.JMenuItem appar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private JMenu mnCrationContrat;
    private JMenu mnAide;
    private JMenuItem mntmContratDeLocation;
    private JMenuItem mntmConratDachat;
}
