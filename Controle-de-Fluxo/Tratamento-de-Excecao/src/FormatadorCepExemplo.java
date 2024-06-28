// Exemplo para testar criar uma nova exceção

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try { // Sempre que usarmos um método que for uma exceção, devemos envelopar ele em um try/catch:
            String cepFormatado = formatarCep("2376506"); // Retirei o ultimo numero do cep para causar a exceção!
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócios!\n");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
