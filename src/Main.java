/**
 * Game test
 */

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //EventQueue.invokeLater schedules the specified Runnable to be executed on the
        //Event Dispatch Thread (EDT). This is necessary because all GUI-related tasks
        //in Swing must be performed on the EDT to ensure thread safety
        EventQueue.invokeLater(() -> {
            //create a new instance of ImageExample
            MyWindow ex = new MyWindow();

            //make the instance visible
            ex.setVisible(true);
        });
    }
}