import org.code.neighborhood.*;

public class PainterPlus extends Painter {


  // Turn Right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }


  //Takes all paint in bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }

  }

//Paints donut

  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
     
    }
  }

  // Paints until empty
   public void paintToEmpty (String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }
}