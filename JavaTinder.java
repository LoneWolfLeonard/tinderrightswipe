package swipe.right;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
public class JavaTinder {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 0;
        int y = 10000;   
        
         TimeUnit.SECONDS.sleep(10);  
         
   Robot robot = new Robot();      
   while(x < y)
   {
   robot.keyPress(KeyEvent.VK_RIGHT);
   robot.keyRelease(KeyEvent.VK_RIGHT);
    x=x+1;
    TimeUnit.SECONDS.sleep(1);    
    }    
}
}