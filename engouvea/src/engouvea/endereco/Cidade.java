package engouvea.endereco;




public class Cidade extends Estado{
	/*Atributos da classe*/
	protected long idCid;
	protected String nomeCid;
	
	public long getIdCid() {
		return idCid;
	}
	public void setIdCid(long idCid) {
		this.idCid = idCid;
	}
	public String getNomeCid() {
		return nomeCid;
	}
	public void setNomeCid(String nomeCid) {
		this.nomeCid = nomeCid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (idCid ^ (idCid >>> 32));
		result = prime * result + ((nomeCid == null) ? 0 : nomeCid.hashCode());
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
		Cidade other = (Cidade) obj;
		if (idCid != other.idCid)
			return false;
		if (nomeCid == null) {
			if (other.nomeCid != null)
				return false;
		} else if (!nomeCid.equals(other.nomeCid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cidade [idCid=" + idCid + ", nomeCid=" + nomeCid + "]";
	}
	


	

    
	    

}
