public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // ver melhor sobre tipos primitivos
        // ver melhor sobre classe String que representa texto

        String meuNome = "Lucas Lira";
        double salarioMinimo = 2500;

        // casting é quando se quer converter um valor de uma variavel de um tipo maior para um tipor menor. pois para o contrario o java dfaz de boa. ex.:
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //variaveis e constates:
        int numero = 1;

        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        //so para utilizar essas variaveis 
        System.out.println(meuNome + "\n" + salarioMinimo + "\n" + numeroCurto + "\n" + numeroNormal + "\n" + numeroCurto2 + "\n" + VALOR_DE_PI);
    }
}
