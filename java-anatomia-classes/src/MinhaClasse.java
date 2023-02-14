public class MinhaClasse {
    public static void main(String[] args) {
        final String BR = "Brasil"; //variavel que não modifica seu valor

        //formas aceitáveis de nomes de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int _numeroum = 1;
        int longo =1;

        String nomeCompleto = nomeCompleto("Matheus","Mendes");

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
