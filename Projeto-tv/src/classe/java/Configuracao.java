package classe.java;

import java.util.ArrayList;
import java.util.List;


public class Configuracao {

	
	private String Restaurar;
	private String nome;
	private String Email;
	private String Senha;
	private List<Formato> formato = new ArrayList<Formato>();
	public Object setEmail;
	public Object setNome;
	public Object setSenha;
    
    
	 public Configuracao() {
		 
	 }


	public String getRestaurar() {
		return Restaurar;
	}


	public void setRestaurar(String restaurar) {
		Restaurar = restaurar;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getSenha() {
		return Senha;
	}


	public void setSenha(String senha) {
		Senha = senha;
	}


	public List<Formato> getFormato() {
		return formato;
	}


	public void setFormato(List<Formato> formato) {
		this.formato = formato;
	}


	@Override
	public String toString() {
		return "Configuracao [Restaurar=" + Restaurar + ", nome=" + nome + ", Email=" + Email + ", Senha=" + Senha
				+ ", formato=" + formato + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Restaurar == null) ? 0 : Restaurar.hashCode());
		result = prime * result + ((Senha == null) ? 0 : Senha.hashCode());
		result = prime * result + ((formato == null) ? 0 : formato.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Restaurar == null) {
			if (other.Restaurar != null)
				return false;
		} else if (!Restaurar.equals(other.Restaurar))
			return false;
		if (Senha == null) {
			if (other.Senha != null)
				return false;
		} else if (!Senha.equals(other.Senha))
			return false;
		if (formato == null) {
			if (other.formato != null)
				return false;
		} else if (!formato.equals(other.formato))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
		
	
	
	 
}
