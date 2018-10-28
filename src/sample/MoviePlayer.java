/**
 *
 * Author: James Hood
 * Step 11: MoviePlayer class that extends Proudct and implements MultimediaControl
 *
 */

package sample;

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;


  public MoviePlayer(String productName, Screen screen, MonitorType monitorType) {

    super(productName);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  @Override
  public void play() {

    System.out.println("Playing");
  }

  @Override
  public void stop() {

    System.out.println("Stopped");
  }

  @Override
  public void previous() {

    System.out.println("Previous");
  }

  @Override
  public void next() {

    System.out.println("Next");
  }

  @Override
  public String toString() {

    return super.toString()
        + "Monitor Type : " + monitorType + "\n"
        + "Screen Details : " + screen;
  }
}
