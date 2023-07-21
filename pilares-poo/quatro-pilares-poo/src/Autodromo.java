public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("845967");

        Moto xj6 = new Moto();
        xj6.setChassi("547968");
        xj6.ligar();
        System.out.println(xj6.getChassi());
        

        Veiculo coringa = jeep;

        coringa.ligar();

        
    }
}
