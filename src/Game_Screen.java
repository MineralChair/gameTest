import java.awt.*;
import javax.swing.*;

//define a class Game_Screen that extends the JFrame
public class Game_Screen extends JFrame {
    public void RenderScreen(){
        System.out.println("Test Message from Game_Screen.RenderScreen()");

        //set properties of the JFrame
        this.setTitle("New Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(900, 600);
        this.setResizable(false);

        //create a new JPanel with BorderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.add(panel);

        //create a new JLabel for the title and set its properties
        JLabel title = new JLabel("Welcome to new game");
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        //create a newJMenuBar and add a root pane to it
        JMenuBar menu = new JMenuBar();
        menu.add(createRootPane());
        this.setJMenuBar(menu);

        //create a new ImageIcon and JLabel for the background image
        ImageIcon img = new ImageIcon("src/MenuBG.png");
        JLabel bgimg = new JLabel(img);
        //add the background image to the center region of the panel
        panel.add(bgimg, BorderLayout.CENTER);

        //create a new JPanel with FlowLayout (respects preferred size) for the button
        JPanel buttonPanel = new JPanel(new FlowLayout());
        //create a new JButton for the start button and set its properties
        JButton start = new JButton("START");
        start.setPreferredSize(new Dimension(100,50));
        start.setFont(new Font("Arial", Font.PLAIN, 12));
        //add the start button to the button panel
        buttonPanel.add(start);
        //add the button panel to the south region of the panel
        panel.add(buttonPanel, BorderLayout.SOUTH);

        //make the JFrame visible
        this.setVisible(true);
    }
}
