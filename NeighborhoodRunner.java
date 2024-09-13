import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter bp = new BackgroundPainter();
    StarPainter sp = new StarPainter();
    BowPainter bwp = new BowPainter();

    /*
    * paints mural 
    */
    bp.paintBackground("ivory", 16);
    sp.paintStars("beige");
    bwp.paintBow("pink");
    

    
  }
}