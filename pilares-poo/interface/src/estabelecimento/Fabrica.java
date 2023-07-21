package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {

    public static void main(String[] args) {
        EquipamentoMultiFuncional emf = new EquipamentoMultiFuncional();

        Impressora impressora = emf;
        Digitalizadora digitalizadora = emf;
        Copiadora copiadora = emf;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }

}
