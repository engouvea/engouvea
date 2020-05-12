package engouvea.classes;

import engouvea.interfaces.ControleAcesso;

public class Usuario extends Pessoa implements ControleAcesso{
	
	int idUsr;
	private String Matricula;
	private String Login;
	private String Senha;
	
	@Override
	public String toString() {
		return "Usuario [idUsr=" + idUsr + ", Matricula=" + Matricula + ", Login=" + Login + ", Senha=" + Senha
				+ ", idpessoa=" + idpessoa + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", email=" + email + ", Logradouro=" + Logradouro + ", bairro=" + bairro + ", cep="
				+ cep + ", complemento=" + complemento + ", referencia=" + referencia + ", idCid=" + idCid
				+ ", nomeCid=" + nomeCid + ", idUf=" + idUf + ", uf=" + uf + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Login == null) ? 0 : Login.hashCode());
		result = prime * result + ((Matricula == null) ? 0 : Matricula.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		result = prime * result + idUsr;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Login == null) {
			if (other.Login != null)
				return false;
		} else if (!Login.equals(other.Login))
			return false;
		if (Matricula == null) {
			if (other.Matricula != null)
				return false;
		} else if (!Matricula.equals(other.Matricula))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		if (idUsr != other.idUsr)
			return false;
		return true;
	}
	public int getIdUsr() {
		return idUsr;
	}
	public void setIdUsr(int idUsr) {
		this.idUsr = idUsr;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	/*Metodo do cotrato de controle de acesso - interface*/
	@Override
	public boolean autenticar() {
		/*Retorna true caso login e senha seja admin*/
		return Login.contentEquals("admin") && Senha.contentEquals("admin");
	}

	

	
	

}
