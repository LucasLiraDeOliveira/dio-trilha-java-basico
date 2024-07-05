package EstudoDeInterface.equipamentos.multifuncional;

import EstudoDeInterface.equipamentos.copiadora.Copiadora;
import EstudoDeInterface.equipamentos.digitalizadora.Digitalizadora;
import EstudoDeInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

}
