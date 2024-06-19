public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Alto : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);



        smartTv.ajustaVolume(1);

        smartTv.ajustaVolume(1);

        smartTv.ajustaVolume(2);



        smartTv.ajustaCanal(1);

        smartTv.ajustaCanal(1);

        smartTv.ajustaCanal(2);
    }
}
