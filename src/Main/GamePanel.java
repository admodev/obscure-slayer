package Main;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    // Dimensiones
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int SCALE = 2;

    // Hilo del juego
    private Thread thread;
    private boolean running;
    private int FPS = 60;
    private long targetTime = 1000 / FPS;

    // Imagen
    private BufferedImage image;
    private Graphics2D g;

    public GamePanel() {
        super();
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    }
}
