public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    // Métodos para controlar o ligar/desligar da tv:
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    // Método para controlar mudar o volume da tv:
    public void ajustaVolume(int valorVolume){
        if(valorVolume == 1){
            volume --;
            System.out.println("Diminuindo o volume para : " + volume);
        }
        else{
            volume ++;
            System.out.println("Aumentando o volume para : " + volume);
        }
    }


    // Método para controlar mudar o canal da tv:
    public void ajustaCanal(int valorCanal){
        if(valorCanal == 1){
            if (canal == 1) {
                canal = 26;
                System.out.println("Mudando o canal para o : " + canal);
            }
            else{
                canal --;
                System.out.println("Mudando o canal para o : " + canal);
            }
        }
        else{
            if (canal == 26) {
                canal = 1;
                System.out.println("Mudando o canal para o : " + canal);
            }
            else{
                canal ++;
                System.out.println("Mudando o canal para o : " + canal);
            }
        }
    }
}
