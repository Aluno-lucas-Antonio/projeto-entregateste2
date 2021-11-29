package classejava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classe.java.Configuracao;
import classe.java.Formato;
import classeauxiliares.FuncaoAutenticacao;
import interfaces.ConfirmarRestauracao;

public class ClasseExecutavel {
@SuppressWarnings({ "unused", "unused" })
public static void main(String[] args, Object marca) {            
		
		//String confirmar = JOptionPane.showInputDialog("Permitir restauracao");
		//String negar = JOptionPane.showInputDialog("Negar restauracao");
		
		
	
	       
	
	List<Configuracao> configuracao = new ArrayList<Configuracao>();
	for(int qtd = 1; qtd <= 2; qtd++){
		String Email = JOptionPane.showInputDialog("Gmail de acesso Para redefinir tv");
		String nome = JOptionPane.showInputDialog("Nome de usuario para acessar redefinir tv");
		String Senha = JOptionPane.showInputDialog("Informar senha de letras para redefinir sua tv");
		
	}
	Configuracao acesso = new Configuracao();
	      if(acesso.setEmail != null) {
	    	  JOptionPane.showInputDialog("Acesso negado");
	      }else {
	    	  JOptionPane.showInputDialog("Acesso permitido");
	      }
	      if(acesso.setNome != null) {
	    	  JOptionPane.showInputDialog("Acesso negado");
	      }else {
	    	  JOptionPane.showInputDialog("Acesso permitido");
	      }
	      if(acesso.setSenha != null) {
	    	   JOptionPane.showInputDialog("Acesso negado");
	    	      }else {
	    	    JOptionPane.showInputDialog("Acesso permitido");
	    	      }
			
	    
		//List<Formato> formato = new ArrayList<Formato>();
		
	
              /*   for(int qtd = 1; qtd <= 2; qtd+){
			String marca = JOptionPane.showInputDialog("Qual a marca de sua tv");
	           
		
                 }*/
		/*Metodo passagem de parametros
          Formato formato = new Formato();
          if(formato.confirmacao()) {
        	  JOptionPane.showMessageDialog(null, "Permitiu");
          }else {
        	  JOptionPane.showMessageDialog(null, "negou");
          }*/
          
		
		/*Formato formato = new Formato();
		if(marca != null) {
			JOptionPane.showMessageDialog(null, "Não possui marca");
		}else {
			JOptionPane.showMessageDialog(null,"Marca existe");
			
		}
		
		Formato formato = new Formato();
		
		if(formato == null) {
			JOptionPane.showMessageDialog(null, "Formato Não existente");
			
		}else {
			JOptionPane.showMessageDialog(null, "Formato Existente");
		}
		
		
          função para permitir a restauracão
        ConfirmarRestauracao confirmarRestauracao = new Formato(confirmar,negar);
		if(new FuncaoAutenticacao (new Formato(confirmar,negar)).autenticarRestauracao()) {
		   JOptionPane.showMessageDialog(null, "Restaurado");
		}else {
			JOptionPane.showMessageDialog(null, "Restauração negada");
		}
		
		
                                      
        
		System.out.println("Opção");
		System.out.println("1.Restaurar");
		System.out.println("2.Redefinir configuracao");
		
			
		

		Configuracao configuracao = new Configuracao();
		
		String redefinicao = JOptionPane.showInputDialog("Redefinicao da tv");
		
		*/
		
		
}
}


