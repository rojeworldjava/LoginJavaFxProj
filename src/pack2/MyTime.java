package pack2;
import java.util.Timer;
import java.util.TimerTask;

public class MyTime {
    
     int secondsPassed=0;
     int minutesPassed=0;
    
    Timer t=new Timer();
    TimerTask tt=new TimerTask(){
    
    public void run(){
        secondsPassed++;
        System.out.println("Seconds: "+secondsPassed);
        if(secondsPassed==60){
            minutesPassed++;
            secondsPassed=0;
        }
      
    }
    };
    public void start(){
        
        t.scheduleAtFixedRate(tt,1000 , 1000);
    
    
    }
   public static void main(String args[]) {
    
        new MyTime().start();
        
      //  KeyBoard k=new KeyBoard();
        
        
    
   }  
}
