package classejava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classe.java.Configuracao;
import classe.java.Formato;
import classeauxiliares.FuncaoAutenticacao;
import interfaces.ConfirmarRestauracao;

public class ClasseExecutavel {
public static void main(String[] args) {            
		
		String confirmar = JOptionPane.showInputDialog("Permitir restauracao");
		String negar = JOptionPane.showInputDialog("Negar restauracao");
		
		
		
				
		//List<Formato> formato = new ArrayList<Formato>();
		
	
              /*   para(int qtd = 1; qtd <= 2; qtd+){
			String marca = JOptionPane.showInputDialog("Qual a marca de sua tv");
	           
		
                 }*/
		/*Metodo passagem de parametros
          Formato formato = new Formato();
          if(formato.confirmacao()) {
        	  JOptionPane.showMessageDialog(null, "Permitiu");
          }else {
        	  JOptionPane.showMessageDialog(null, "negou");
          }*/
          
          //função para permitir a restauracão
         ConfirmarRestauracao confirmarRestauracao = new Formato(confirmar,negar);
		if(new FuncaoAutenticacao (new Formato(confirmar,negar)).autenticarRestauracao()) {
		   JOptionPane.showMessageDialog(null, "Restaurado");
		}else {
			JOptionPane.showMessageDialog(null, "Negou Restauracao");
		}
		
		
        /*                              
        
		System.out.println("Opção");
		System.out.println("1.Restaurar");
		System.out.println("2.Redefinir configuracao");
		
			
		

		Configuracao configuracao = new Configuracao();
		
		String redefinicao = JOptionPane.showInputDialog("Redefinicao da tv");
		
		*/
		
		
}
}


