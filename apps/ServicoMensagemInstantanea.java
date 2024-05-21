package apps;

public abstract class ServicoMensagemInstantanea {
	
   public abstract void enviarMensagem();
   public abstract void receberMensagem();
   
   protected void validarConectadoInternet() {
	   System.out.println("validando se esta conectado a internet");
   }
}
