package engouvea.executavel;

import javax.swing.JOptionPane;

/*import engouvea.classes.Pessoa;*/
import engouvea.classes.Usuario;
/*import engouvea.endereco.Cidade;
import engouvea.endereco.Endereco;
import engouvea.endereco.Estado;*/

/*pacote engouvea*/

public class index {
/*Váriáveis publicas*/
	
	/*Método Execultável*/
	public static void main(String[] args) {
		
		try {
	/*Variáveis privadas*/
		
		/*Adiciona os atributos para clsse*/
		/*Endereco endereco = new Endereco();
			endereco.setLogradouro("Passagem Simeão");
			endereco.setBairro("Marco");
			endereco.setCep("66095620");
			endereco.setComplemento("Com a Passag. Lauro Martis");
			endereco.setReferencia("Entrada pela Lauro Martins,72");
			System.out.println(endereco);*/
		
		/*Adiciona os atributos para clsse*/
		/*Estado estado = new Estado();
		    estado.setIdUf(1);
		    estado.setUf("PA");
		    estado.setNome("PARÁ");*/
		    

			
		/*Adiciona os atributos para clsse*/
		/*Pessoa persona = new Pessoa();
			persona.setCpf("30640482287");
			persona.setDataNascimento("10/02/1971");
			persona.setIdpessoa(1);
			persona.setNome("Evanildo Gouvea");
			persona.setRg("1842180");
			persona.setLogradouro("Passagem Simeão,177");
			persona.setBairro("Marco");
			persona.setCep("66095620");
			persona.setComplemento("Com a Passag. Lauro Martis");
			persona.setReferencia("Entrada pela Lauro Martins,72");
			persona.setNomeCid("Belém");
			persona.setUf("PA");*/
		
		   /*controle de acesso*/
		    String login = JOptionPane.showInputDialog("Digite o Logim :");
		    String senha = JOptionPane.showInputDialog("Digite o Senha :");
		    
		    Usuario usuario =  new Usuario();
		    usuario.setLogin(login);
		    usuario.setSenha(senha);
		   /*----------------------------------------*/
		    if (usuario.autenticar()) {
		/*Usuario usuario = new Usuario();*/
		    usuario.setIdUsr(1);
		    usuario.setMatricula("9901244003");
		    /*usuario.setLogin("admin");*/
		    /*usuario.setSenha("admin");*/
		    usuario.setCpf("30640482287");
		    usuario.setDataNascimento("10/02/1971");
		    usuario.setIdpessoa(1);
		    usuario.setNome("Evanildo Gouvea");
		    usuario.setRg("1842180");
		    usuario.setLogradouro("Passagem Simeão,177");
		    usuario.setBairro("Marco");
		    usuario.setCep("66095620");
		    usuario.setComplemento("Com a Passag. Lauro Martis");
		    usuario.setReferencia("Entrada pela Lauro Martins,72");
		    usuario.setNomeCid("Belém");
		    usuario.setUf("PA");
		    		
			
		
		/*sem os gets e sets dentro das classes*/ 
		/*
		 * System.out.println(persona.getId()); 
		 * System.out.println(persona.getCpf());
		 * System.out.println(persona.getDataNascimento());
		 * System.out.println(persona.getNome()); 
		 * System.out.println(persona.getRg());
		 */
		
		/*com os gets e sets dentro das classes*/ 
		System.out.println(usuario);

		 
		/*Endereco - referencia de endereco*/
		/*new endereco - instancia*/
		
		/*Endereco endereco = new Endereco();
		System.out.println(endereco);*/

	   } else {
		   JOptionPane.showMessageDialog(null, "Login inválido - ENGouvea Sistemas");
	   }
	}
	 catch (Exception e){
		e.printStackTrace(); /*Imprime o erro*/
		JOptionPane.showMessageDialog(null, "Erro ao processar sistema - ENGouvea Sistemas");
	}
		    
	} 

}
