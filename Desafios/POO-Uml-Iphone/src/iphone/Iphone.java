package iphone;

import java.util.Random;

public class Iphone implements ReprodutorMusical, NavegadorDeInternet {
    private boolean StatusLigacao = false; // variavel referente as funçoes de AparelhoTelefonico.java

    //Funções referente a interface ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando música");
    }
    
    public void pausar(){
        System.out.println("Música pausada");
    }
    
    public void selecionarMusica(String musica){
        System.out.println("Música selecionado: " + musica);
        tocar();
    }




    //Funções referente a interface AparelhoTelefonico.java
    private void mudaStatusLigacao(){
        this.StatusLigacao = !StatusLigacao;
    }

    public void ligar(String numero){
        int contador = 0; //Para simular o tempo de ligar e entrar na caixa postal

        if (this.StatusLigacao) {
            System.out.println("Não dá para fazer uma ligação enquanto o telefone está fazendo uma ligação");
        }
        else{
            mudaStatusLigacao();//Para sinalizar que agora está ligando
            System.out.println("Ligando para " + numero);
            
            do{
                if(contador > 4){
                    iniciarCorreioVoz();
                    desligar();
                    break;
                }
                System.out.println("Chamando...");
                contador ++;
            }while(tocando());

            if(contador <= 4)
                System.out.println("Ligação antendida!");
            
            desligar();
        }
    }
    
    private boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        return !atendeu;
    }
    
    private void desligar(){
        if(this.StatusLigacao == true){
            System.out.println("Fim da ligação!\n");
            mudaStatusLigacao();//Para sinalizar que agora está não está mais ligando
        }
    }
    
    private void iniciarCorreioVoz(){
        System.out.println("Mensagem entrou no Correio de Voz\n");
    }
    
    public void atender(){
        int tempoLigacao;

        mudaStatusLigacao();
        
        System.out.println("Chamada atendida!");
        
        do{
            System.out.println("Ligação em andamento");
            tempoLigacao = new Random().nextInt(4);
        }while(tempoLigacao != 3);
        
        desligar();
    }




    //Funções referente a interface NavegadorDeInternet.java
    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Recarregando página");
    }
}
