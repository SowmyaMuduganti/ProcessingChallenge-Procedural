import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    int speedOfBall1 = 0;
    int speedOfBall2 = 0;
    int speedOfBall3 = 0;
    int speedOfBall4 = 0;

    public static void main(String[] args) {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawBall(HEIGHT/5,speedOfBall1);
        speedOfBall1+=1;
        drawBall(2*HEIGHT/5,speedOfBall2);
        speedOfBall2+=2;
        drawBall(3*HEIGHT/5,speedOfBall3);
        speedOfBall3+=3;
        drawBall(4*HEIGHT/5,speedOfBall4);
        speedOfBall4+=4;
    }

    private void drawBall(int height, int speed) {
        ellipse(speed, height, DIAMETER, DIAMETER);
    }

}

