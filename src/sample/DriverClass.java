package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverClass {


  public static void getFunction() {


    ArrayList<Product> sortedList = new ArrayList<Product>();

    sortedList.add(new AudioPlayer("WalkMan", "MP3"));

    sortedList.add(new MoviePlayer("62 inch Plasma",
        new Screen("1080x920", 100, 20), MonitorType.LED));

    sortedList.add(new AudioPlayer("Blueman", "BlueTooth"));

    sortedList.add(new MoviePlayer("Vizio",
        new Screen("100x1000", 60, 1), MonitorType.LCD));

    sortedList.add(new AudioPlayer("Old Ladies Pride",
        "Loudest Audio on the market"));

    sortedList.add(new MoviePlayer("Over 9000",
        new Screen("9001x9001", 9001, 9001), MonitorType.LCD));

    Collections.sort(sortedList);
    printList(sortedList);
  }

  private static void printList(List<Product> sortedList) {

    for (Product product : sortedList) {

      System.out.println(product + "\n");
    }
  }
}
