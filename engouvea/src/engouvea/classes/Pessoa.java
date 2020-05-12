package engouvea.classes;



import engouvea.endereco.Endereco;

/*import engouvea.endereco.Estado;*/
/*abstract - protege  superclasse de estanciamento*/
public abstract class Pessoa extends Endereco {
	/*Atributos da classe pessoa*/
	int idpessoa;
	String nome;
	String rg;
	String cpf;
	String dataNascimento;
	String email;
	
	public int getIdpessoa() {
		return idpessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdpessoa(int idpessoa) {
		this.idpessoa = idpessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + idpessoa;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idpessoa != other.idpessoa)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [idpessoa=" + idpessoa + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", email=" + email + ", Logradouro=" + Logradouro + ", bairro=" + bairro + ", cep="
				+ cep + ", complemento=" + complemento + ", referencia=" + referencia + ", idCid=" + idCid
				+ ", nomeCid=" + nomeCid + ", idUf=" + idUf + ", uf=" + uf + "]";
	}


	


	

}
