import javax.swing.*;
import java.awt.*;

public class Frame implements Subscriber{
    private JFrame serverFrame;
    private JTextArea buffer;
    private JScrollPane scrollBuffer;

    public Frame(String frame, Dimension dimension){
        serverFrame = new JFrame();
        buffer = new JTextArea();
        scrollBuffer = new JScrollPane(buffer);
        serverFrame.setTitle(frame);
        serverFrame.setSize(dimension);
        serverFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        serverFrame.setLayout(new BorderLayout());
        scrollBuffer.setPreferredSize(new Dimension(((int)dimension.getWidth()), ((int)dimension.getHeight())-200));
        buffer.setFont(new Font("buffer", Font.ITALIC, 20));
        serverFrame.add(scrollBuffer, BorderLayout.NORTH);
        serverFrame.setVisible(true);
    }

    @Override
    public void update(String str) {
        buffer.append(str);
    }
}
