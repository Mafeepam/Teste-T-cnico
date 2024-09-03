public class SomaIndice {

    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

       
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("Valor da Soma: " + soma);
    }
}
