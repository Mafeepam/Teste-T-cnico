import java.util.HashMap;
import java.util.Map;

public class Faturamento {

    public static void calcularPercentual(Map<String, Double> faturamentoPorEstado) {
        double total = 0.0;

        // Calcula o total do faturamento
        for (double valor : faturamentoPorEstado.values()) {
            total += valor;
        }

        // Calcula e imprime o percentual de cada estado
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            double percentual = (valor / total) * 100;
            System.out.printf("%s: %.2f%%%n", estado, percentual);
        }
    }

    public static void main(String[] args) {
        // Dados de exemplo
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Chama o método para calcular o percentual
        calcularPercentual(faturamentoPorEstado);
    }
}
