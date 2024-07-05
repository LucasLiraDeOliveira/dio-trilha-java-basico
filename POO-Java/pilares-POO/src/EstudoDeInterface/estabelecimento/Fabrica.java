package EstudoDeInterface.estabelecimento;

import EstudoDeInterface.equipamentos.impressora.Impressora;
import EstudoDeInterface.equipamentos.copiadora.Copiadora;
import EstudoDeInterface.equipamentos.digitalizadora.Digitalizadora;
import EstudoDeInterface.equipamentos.impressora.Deskjet;
import EstudoDeInterface.equipamentos.impressora.Laserjet;
import EstudoDeInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //Podemos ver agora que tanto as impressoras quanto o equipamento multifuncional podem imprimir na fabrica
        Impressora impressora = new Laserjet();
        Impressora impressora2 = new Deskjet();
        Impressora impressora3 = new EquipamentoMultifuncional();

        impressora.imprimir();
        impressora2.imprimir();
        impressora3.imprimir();
        System.out.println("\n\n");


        //Agora vamos demonstrar a maleabilidade de uma interface:
        //Vamos criar um obj de equipamento multifuncional
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        // Vamos criar um obj de cada tipo de equipamento e atribuir a eles o valor de em
        Impressora impressora4 = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        //Agora podemos ver que por EM ser uma interface e possuir o metodo de cada uma delas, elas poderam usar o metodo "via" EM. Terminadno utilizando a forma do metodo que esta na interface de EM (poliformismo)
        impressora4.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
