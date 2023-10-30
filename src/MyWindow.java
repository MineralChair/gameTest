import java.awt.*;
import javax.swing.*;
public class MyWindow extends JFrame {
    public MyWindow() {
        stuff();
    }

    private void stuff() {
        //create image object (replace "src/cat.jpg" with the path of desired file)
        ImageIcon icon = new ImageIcon("src/cat.jpg");

        //use to display image on window
        JLabel label = new JLabel(icon);

        createLayout(label);
    }


    private void createLayout(JComponent... arg) {
        //get the content pane of the JFrame
        Container pane = getContentPane();

        //create a new GroupLayout and set it as the layout manager for the content pane
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        //sets auto creation of container gaps (creates gaps between the components and
        //the edges of the container to provide a margin)
        gl.setAutoCreateContainerGaps(true);

        //set up horizontal and vertical group for the GroupLayout,
        //adding the passed component (the JLabel with the image) to both horizontal and
        //vertical group, which means the image will be positioned in the top-left
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));

        //call pack(), which sizes the frame so that all its contents are
        //at or above their preferred sizes
        pack();
    }
}

