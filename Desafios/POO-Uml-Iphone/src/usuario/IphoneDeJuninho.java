package usuario;

import iphone.Iphone;

public class IphoneDeJuninho {
    public static void main(String[] args) {
        Iphone iphoneJuninho = new Iphone();

        //Chamadas referentes ao app de música:
        iphoneJuninho.selecionarMusica("Farol das estrelas");
        iphoneJuninho.pausar();

        System.out.println("\n");

        //Chamadas referentes ao app de telefone:
        iphoneJuninho.ligar("071983353466");
        iphoneJuninho.atender();

        System.out.println("\n");

        //Chamadas referentes ao app de navegador:
        iphoneJuninho.exibirPagina("www.linkedin.com/in/lucas-lira-de-oliveira-9361b2148");
        iphoneJuninho.atualizarPagina();
        iphoneJuninho.adicionarNovaAba();

        System.out.println("\n");
    }
}
