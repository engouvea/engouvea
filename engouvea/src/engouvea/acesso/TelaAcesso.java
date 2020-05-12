package engouvea.acesso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaAcesso extends JDialog {
	/*Painel de componentes*/
	private JPanel jPanel = new JPanel(new GridBagLayout()); 
	
	private JLabel usuario = new JLabel("Usuário");
	private JTextField txtusr = new JTextField();

	private JLabel senha = new JLabel("Senha");
	private JTextField txtPass = new JTextField();
	
	/*Botoes*/
	private JButton jButton = new JButton("Logar");
	private JButton jButton2 = new JButton("Cancelar");
	
	
	public TelaAcesso() { /*Executa o que estiver dentro no momento de abertura ou execução*/
		/*Primeira Parte*/
	    setTitle("Controle de Acesso");
	    setSize(new DimensionUIResource(440, 340));
	    setLocationRelativeTo(null);
	    setResizable(false);
	    
	    /*Controlador de posicionamento na tela*/
	    GridBagConstraints gridBagConstraints = new GridBagConstraints();
	    gridBagConstraints.gridx = 0;
	    gridBagConstraints.gridy = 0;
	    gridBagConstraints.gridwidth = 2; /*dois componentes, dois botoes na mema linha*/
	    gridBagConstraints.insets = new Insets(1, 5, 5, 5);
	    
	    usuario.setPreferredSize(new Dimension(200, 25));
	    jPanel.add(usuario, gridBagConstraints);
	    
	    txtusr.setPreferredSize(new Dimension(200, 25));
	    gridBagConstraints.gridy ++;	    
	    jPanel.add(txtusr, gridBagConstraints);	    
	    
	    senha.setPreferredSize(new Dimension(200, 25));
	    gridBagConstraints.gridy ++;
	    jPanel.add(senha, gridBagConstraints);
	    
	    txtPass.setPreferredSize(new Dimension(200, 25));
	    gridBagConstraints.gridy ++;	    
	    jPanel.add(txtPass, gridBagConstraints);
	    
	    
	    /*Botoes*/
	    gridBagConstraints.gridwidth = 1; /*para poder alinha os dois botoes na mema linha*/
	    
	    jButton.setPreferredSize(new DimensionUIResource(92, 25));
	    gridBagConstraints.gridy ++;
	    jPanel.add(jButton, gridBagConstraints);
	    
	    jButton2.setPreferredSize(new DimensionUIResource(92, 25));
	    gridBagConstraints.gridx ++;
	    jPanel.add(jButton2, gridBagConstraints);
	    
	    add(jPanel, BorderLayout.CENTER);
	    
	    
		/*sempre será o útimo comando.*/
		setVisible(true); /*Torna a tela visivel.*/
	}

}
