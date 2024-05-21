package PilaresOrientadaAObjetos;

public class Autrodomo {
    public static void main(String[]args) {
    	Carro jeep = new Carro();
    	jeep.setChassi("1234131");
    	jeep.ligar();
    	
    	Moto z400 = new Moto();
    	z400.setChassi("656532");
    	z400.ligar();
    	
    	Veiculo coringa = z400;
    	coringa.ligar();
    }
}
