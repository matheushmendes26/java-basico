public class SmartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 20;

   public void ligar(){
       ligada = true;
   }
   public void desligar(){
       ligada = false;
   }
   public void aumentarVolume(int num){
       if(volume>=100)
           volume = 100;
       else
            volume++;
   }
   public void diminuirVolume(int num){
       if(volume <= 0)
            volume = 0;
       else
           volume--;
   }

   public void mudarDeCanal(int numero){

       canal = numero;

   }

   public void aumentarCanal(){
       canal++;
   }
   public void diminuirCanal(){
       canal--;
   }


}
