package classe.java;

import interfaces.ConfirmarRestauracao;

public class Formato extends Configuracao implements ConfirmarRestauracao{
	private String marca;
    private String brilho;
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
	public Formato(String permitir, String negar, String confirmar) {
		this.confirmar = confirmar;
		this.negar = negar;
	}
	public Formato(String confirmar2, String negar2, Object object) {
		// TODO Auto-generated constructor stub
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
	public String getBrilho() {
		return brilho;
	}
	public void setBrilho(String brilho) {
		this.brilho = brilho;
	}
	@Override
	public String toString() {
		return "Formato [marca=" + marca + ", brilho=" + brilho + ", confirmar=" + confirmar + ", negar=" + negar + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brilho == null) ? 0 : brilho.hashCode());
		result = prime * result + ((confirmar == null) ? 0 : confirmar.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((negar == null) ? 0 : negar.hashCode());
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
		if (brilho == null) {
			if (other.brilho != null)
				return false;
		} else if (!brilho.equals(other.brilho))
			return false;
		if (confirmar == null) {
			if (other.confirmar != null)
				return false;
		} else if (!confirmar.equals(other.confirmar))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (negar == null) {
			if (other.negar != null)
				return false;
		} else if (!negar.equals(other.negar))
			return false;
		return true;
	}
	@Override
	public boolean confirmacao() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean Confirmacao(String confirmar, String negar) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
	
}
