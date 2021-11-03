package classe.java;

import java.util.ArrayList;
import java.util.List;


public class Configuracao {
	private  String Restaurar;
	   
	private List<Formato> formato = new ArrayList<Formato>();
    
    
	 public Configuracao() {
		 
	 }
	 public Configuracao(String restaurarPadrao) {
		 Restaurar = restaurarPadrao;
	 }
	public String getRestaurar() {
		return Restaurar;
	}
	public void setRestaurar(String restaurar) {
		Restaurar = restaurar;
	}
	public List<Formato> getFormato() {
		return formato;
	}
	public void setFormato(List<Formato> formato) {
		this.formato = formato;
	}
	@Override
	public String toString() {
		return "Configuracao [Restaurar=" + Restaurar + ", formato=" + formato + ", getRestaurar()=" + getRestaurar()
				+ ", getFormato()=" + getFormato() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Restaurar == null) ? 0 : Restaurar.hashCode());
		result = prime * result + ((formato == null) ? 0 : formato.hashCode());
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
		Configuracao other = (Configuracao) obj;
		if (Restaurar == null) {
			if (other.Restaurar != null)
				return false;
		} else if (!Restaurar.equals(other.Restaurar))
			return false;
		if (formato == null) {
			if (other.formato != null)
				return false;
		} else if (!formato.equals(other.formato))
			return false;
		return true;
	}
	
	
	 
}
