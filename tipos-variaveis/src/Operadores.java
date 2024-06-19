public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // Teste sobre concatenacao: qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);






        // Operadores unarios:
        int numero = 5;
        System.out.println(-numero);

        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero);
        numero = -numero; // ou numero = numero * -1;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel); // a ! mostrará o valor booleano oposto ao que a variável possui. Essa ! não
                                       // alterará o valor da variável, apenas o valor que foi mostrado
        System.out.println(variavel); // Para mostrar que o valor não foi alterado

        variavel = !variavel; // Para atribuir o valor oposto
        System.out.println(variavel);
        variavel = !variavel; // Para mudar o valor de volta
        System.out.println(variavel);




        
        // Operadores unarios de incremento e decremento:
        int novoNumero = 5;
        System.out.println(novoNumero);

        novoNumero++; // que é a mesma coisa de novoNumero + 1;
        System.out.println(novoNumero);

        System.out.println(novoNumero++); // o print não ocorrerá com o acrescimo pois ao por o ++ ao final, primeiro
                                          // ele fará o print e depois adicionará +1 à variável. Para que ele adicione
                                          // antes de imprimir, precisa-se por o ++ antes. Essa mesma regra serve para o
                                          // --
        System.out.println(++novoNumero); // vai somar +2 porque foi +1 que foi somado após o print anterior e o +1 que
                                          // foi somado antes do print atual







        // Operador ternário:
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);






        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;


        boolean simNao = numero1 == numero2;
        System.out.println(simNao);


        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2\n");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2\n");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2\n");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2\n");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2\n");



        String nomeUm = "Lucas";
        String nomeDois = "Lucas";
        System.out.println(nomeUm == nomeDois);

        //Vamos testar comparar os nomes de novo mas agora criando um novo objeto:
        String nomeTres = new String("Lucas");
        System.out.println(nomeUm == nomeTres); // Quando s ecompara uma string com um objeto, pelo modo padrão,dá false. 

        //Para comparar objetos ou textos usamos o método chamado "equals", que serve para comparar o conteúdo entre dois objetos. Para java, por mais que o conteúdo dos dois objetos sejam iguais, eles em sim não são. Por isso utilizamos esse método quando queremos comparar o conteúdo entre eles:
        System.out.println(nomeUm.equals(nomeTres));





        
        //Operadores lógicos:
        boolean condicao1=true;
        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
