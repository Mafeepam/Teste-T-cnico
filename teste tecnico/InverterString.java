public class InverterString {

    public static String inverterString(String str) {
        String novaString = "";
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            novaString += str.charAt(i);
        }
        
        return novaString;
    }

    public static void main(String[] args) {
       
        String string = "Bom dia, como vai?";
        String stringInvertida = inverterString(string);
        
        
        System.out.println(stringInvertida);
    }
}
