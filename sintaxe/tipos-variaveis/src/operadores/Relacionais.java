package operadores;

public class Relacionais {

    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 6;

        boolean compararNumeros = (numero1 > numero2);
        System.out.println(compararNumeros);
        compararNumeros = numero2 >= numero1;
        System.out.println(compararNumeros);
        compararNumeros = numero1 == numero2;
        System.out.println(!compararNumeros);
    }

}
