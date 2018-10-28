/**
 *
 * Author: James Hood
 * Step 5: Concrete class that will allow us to capture the details of an audio player
 *
 */

package sample;


public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;


  public AudioPlayer(String name, String audioSpecification) {

    super(name);

    this.audioSpecification = audioSpecification;

    mediaType = ItemType.AUDIO;
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
        +
        "Audio Specification : "
        +
        audioSpecification
        +
        "\n"
        +
        "Media Type : "
        +
        mediaType;
  }
}
