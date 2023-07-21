public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado!");
    }

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel!");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P!");
    }

}
