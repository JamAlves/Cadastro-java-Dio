package Estabelecimento;

import ImprimirProjetocopiadora.Copiadora;
import ImprimirProjetodigitalizadora.Digitalizadora;
import ImprimirProjetomultfuncional.EquipamentoMultifuncional;
public class Fabrica {
   public static void main(String[] args) {
	    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
	    //ImprimirProjetoimpressora.Impressora impressora = new EquipamentoMultifuncional();
	    EquipamentoMultifuncional impressora = em;
	    Digitalizadora digitalizadora = em;
	    Copiadora copiadora = em;
	    
	    impressora.imprimir();
	    digitalizadora.digitalizar();
	    copiadora.copiar();
    }
}
