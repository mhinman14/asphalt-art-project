import org.code.neighborhood.*;


public class BowPainter extends PainterPlus {

  public void paintBow (String color) {
   drawRightSide(color);
   drawKnot(color);
   drawLeftSide(color);
   drawRibbons(color);
  }

  /*
 * Draws the right side of the bow and gets ready to paint knot 
 */
public void drawRightSide(String color) {
  turnRight();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
  move();
  move();
  move();
  setPaint(11);
  paint(color);
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);

  turnRight();
  move();
  turnRight();
  move();
  paint(color);
  move();
  paint(color);
 move();
  paint(color);

  turnLeft();
  move();
  setPaint(2);
  paint(color);
  turnLeft();
  move();
  paint(color);

}


  /*
 * draws knot two different colors (purple and violet)
 */
  public void drawKnot (String color) {
    turnRight();
    move();
   setPaint(4);
    paint("violet");
   turnRight();
    move();
    paint("purple");
    turnLeft();
    move();
    paint("violet");
    turnLeft();
    move();
    paint("purple");
  }

  /*
 * draws left side of bow, different amounts on each side 
 */
public void drawLeftSide (String color) {

  turnRight();
  move();
  setPaint(13);
  paint(color);
  turnRight();
  move();
  paint(color);
  turnLeft();
  move();
  turnLeft();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);

  move();
  turnRight();
  move();
  turnRight();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);

  turnLeft();
  move();
  turnLeft();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
}


  /*
 * draws ribbon and finishes bow, returns to ending spot 
 */
  public void drawRibbons (String color) {
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    setPaint(8);
    paint(color);
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);

    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);
    turnRight();
    move();
    turnLeft();
    move();
    paint(color);

    turnLeft();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
  }


}
  