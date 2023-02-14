public class Usuario {
    public static void main(String[] args) {
        //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
        SmartTv smartTv = new SmartTv();
        System.out.println("TV está ligada? "+smartTv.ligada);
        System.out.println("Qual canal? "+smartTv.canal);
        System.out.println("Qual o volume? "+smartTv.volume);
        smartTv.ligar();
        System.out.println("TV está ligada? "+smartTv.ligada);


    }
}
