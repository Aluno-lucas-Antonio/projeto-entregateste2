package classeauxiliares;

import interfaces.ConfirmarRestauracao;

public class FuncaoAutenticacao {
	
    	private ConfirmarRestauracao confirmarRestauracao ;
		
		public FuncaoAutenticacao( ConfirmarRestauracao  confirmar) {
			this.confirmarRestauracao = confirmar;
			
		}
		
		public boolean autenticarRestauracao() {
			
			return confirmarRestauracao.confirmacao();
		}
		
		//public boolean  autenticarRestauracao( ConfirmarRestauracao confirmar) {
		//	return acesso,confirmacao();
		//}

	}

