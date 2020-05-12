package engouvea.endereco;

public class Estado {
	/*Atributos da classe*/
    protected long idUf;
    protected String uf;
    protected String nome;
	public long getIdUf() {
		return idUf;
	}
	public void setIdUf(long idUf) {
		this.idUf = idUf;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idUf ^ (idUf >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (idUf != other.idUf)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Estado [idUf=" + idUf + ", uf=" + uf + ", nome=" + nome + "]";
	}
    
	
       

    
}
