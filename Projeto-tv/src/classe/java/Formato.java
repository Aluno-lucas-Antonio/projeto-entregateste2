package classe.java;

import interfaces.ConfirmarRestauracao;

public class Formato extends Configuracao implements ConfirmarRestauracao{
	private String marca;
    
    private String confirmar, negar;
    
    
    
    
	public String getConfirmar() {
		return confirmar;
	}
	public void setConfirmar(String confirmar) {
		this.confirmar = confirmar;
	}
	public String getNegar() {
		return negar;
	}
	public void setNegar(String negar) {
		this.negar = negar;
	}
	public Formato(String permitir, String negar) {
		this.confirmar = confirmar;
		this.negar = negar;
	}
	public Formato() {
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Formato [marca=" + marca + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
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
		Formato other = (Formato) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		return true;
	}
	@Override
	public boolean confirmacao() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public   boolean Confirmacao(String confirmar, String negar) {
		// TODO Auto-generated method stub
		return false;
	}
}
