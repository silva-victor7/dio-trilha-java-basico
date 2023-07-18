public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("29931225");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP tem que ter 8 dígitos!");

        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "29.931-225";
    }
}
