import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*int x  = sc.nextInt();

        //Exercicio 1
        verificarNegativo(x);

        //Exercicio 2
        verificarParOuImpar(x);

         */
        //Exercicio 3
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //double c = sc.nextDouble();
        double d = sc.nextDouble();
        //verificarMultiplos(a, b);

        //Exercicio 4
        //verificarDuracaoJogo(a, b);

        //Exercicio 5
        //verificarPreco(a, b);

        //Exercicio 6
        //verificarIntervalo(c);

        //Exercicio 7
        //verificarQuagrante(c, d);

        //Exercicio 8
        verificarIR(d);
        sc.close();
    }

    public static void verificarNegativo(int numero) {

        if (numero < 0)
            System.out.println("NEGATIVO");
        else
            System.out.println("NAO NEGATIVO");
    }

    public static void verificarParOuImpar(int numero) {
        if (numero % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }

    public static void verificarMultiplos(int numero1, int numero2) {
        if (numero1 > numero2) {
            if (numero1 % numero2 == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        } else {
            if (numero2 % numero1 == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        }
    }

    public static void verificarDuracaoJogo(int comeco, int _final) {
        int duracao = 0;
        if (_final > comeco) {

            duracao = _final - comeco;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            if (_final == comeco)
                System.out.println("O JOGO DUROU 24 HORAS(S)");
            else {
                _final = _final + 24;
                duracao = _final - comeco;
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
        }
    }

    public static void verificarPreco(int codigo, int quantidade) {
        if (codigo == 1) {
            double total = (double) quantidade * 4;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 2) {
            double total = (double) quantidade * 4.5;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 3) {
            double total = (double) quantidade * 5;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 4) {
            double total = (double) quantidade * 2;
            System.out.printf("Total: R$ %.2f%n", total);
        } else if (codigo == 5) {
            double total = (double) quantidade * 1.5;
            System.out.printf("Total: R$ %.2f%n", total);
        }
    }

    public static void verificarIntervalo(double numero) {
        if (numero >= 0 && numero <= 100) {
            if (numero <= 25)
                System.out.println("Intervalo [0,25]");
            else if (numero <= 50)
                System.out.println("Intervalo (25,50]");
            else if (numero <= 75)
                System.out.println("Intervalo (50,75]");
            else
                System.out.println("Intevalo (75, 100]");
        } else
            System.out.println("Fora de Intervalo");
    }

    public static void verificarQuagrante(double x, double y) {
        if (x == y && x == 0)
            System.out.println("Origem");
        else{
            if(x==0)
                System.out.println("Eixo Y");
            else if(y==0)
                System.out.println("Eixo X");
            else {
                if (x > 0 && y > 0)
                    System.out.println("Q1");
                else if(x<0 && y>0)
                    System.out.println("Q2");
                else if(x<0 && y < 0)
                    System.out.println("Q3");
                else
                    System.out.println("Q4");
            }
        }
    }
    public static void verificarIR(double salario){
        if(salario<=2000)
            System.out.println("Isento");
        else{
            if(salario<=3000){
                double auxilar = salario - 2000;
                double impostoDeRenda = auxilar * 0.08;
                System.out.printf("R$ %.2f%n",impostoDeRenda);
            }else if(salario<=4500){
                double impostoDeRenda = (1000 * 0.08) + (salario - 3000) * 0.18;
                System.out.printf("R$ %.2f%n",impostoDeRenda);
            }else{
                double impostoDeRenda = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500) * 0.28;
                System.out.printf("R$ %.2f%n",impostoDeRenda);
            }
        }
    }
}
