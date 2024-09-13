import org.code.neighborhood.*;



  /*
 * Background painter is a subclass of PainterPlus and 
 *paints a white background in the neighborhood 
 */
public class BackgroundPainter extends PainterPlus {



/*
 * Paints each row of neighborhood white 
 */


  public void paintBackground (String color , int size) {

    while (canMove("south")) {
      paintLine(color, size);
      turnWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
 * paints a line for each row 
 */
public void paintLine(String color , int spaces) {
  setPaint(spaces);

  while (hasPaint()) {
    paint(color);


    if(canMove()) {
      move();
    }
  }
}

/*
 * turns painter around if facing a different direction 
 */

public void turnWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

public void turnEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }


  public void turnAround() {
    turnLeft();
    turnLeft();
  }



  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

/*
 * moves painter to corner in order to finish the background 
 */

  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

}