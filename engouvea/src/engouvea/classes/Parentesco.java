package engouvea.classes;

public class Parentesco {
	/*Atributos da classe parentesco*/	
	int idParenteco;
	String tipoParentesco;
	
	public int getIdParenteco() {
		return idParenteco;
	}
	public void setIdParenteco(int idParenteco) {
		this.idParenteco = idParenteco;
	}
	public String getTipoParentesco() {
		return tipoParentesco;
	}
	public void setTipoParentesco(String tipoParentesco) {
		this.tipoParentesco = tipoParentesco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idParenteco;
		result = prime * result + ((tipoParentesco == null) ? 0 : tipoParentesco.hashCode());
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
		Parentesco other = (Parentesco) obj;
		if (idParenteco != other.idParenteco)
			return false;
		if (tipoParentesco == null) {
			if (other.tipoParentesco != null)
				return false;
		} else if (!tipoParentesco.equals(other.tipoParentesco))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Parentesco [idParenteco=" + idParenteco + ", tipoParentesco=" + tipoParentesco + "]";
	}
	





}
