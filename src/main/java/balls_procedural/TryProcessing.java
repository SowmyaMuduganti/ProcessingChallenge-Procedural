package balls_procedural;

import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static final int NUMBER_OF_BALLS = 4;
    private int[] xCoordinates = new int[NUMBER_OF_BALLS+1];

    public static void main(String[] args) {
        PApplet.main( "balls_procedural.TryProcessing", args);
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
        int yCoordinate; //y-coordinate represents height of the ball
        for (int i = 1; i <= NUMBER_OF_BALLS; i++) {
            yCoordinate = i * HEIGHT / (NUMBER_OF_BALLS+1);
            drawBall(xCoordinates[i], yCoordinate);
            moveBall(i);
        }
    }

    private void moveBall(int i) {
        xCoordinates[i] += i; //changing x-coordinate represents speed of the ball
    }

    private void drawBall(int x, int y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }

}

