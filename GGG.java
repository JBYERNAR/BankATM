package PotokiMnogopotochnost.Task2;

import javax.swing.*;

public class GGG extends Thread{
    public void run(){
        try{
            for(int i = 150;i<300;i++){
                Main.frame.resh.setLocation(i,i-10);
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}