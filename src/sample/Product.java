/**
 *
 * Author: James Hood
 * Step 3: Abstract type that will implement the ITem Interface
 *
 */

package sample;

import java.util.Date;

public abstract class Product implements Item, Comparable<Item> {

  private int serialNumber;
  private Date manufacuredOn;
  private String name;
  private String manufacturer;

  private static int currentProductionNumber = 1;

  @Override
  public void setProductionNumber(int productionNumber) {

    currentProductionNumber = productionNumber;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getName() {

    return name;
  }


  @Override
  public Date getManufactureDate() {

    return manufacuredOn;
  }

  @Override
  public int getSerialNumber() {

    return serialNumber;
  }
  public Product(String productName) {

    this.name = productName;

    serialNumber = currentProductionNumber;


    currentProductionNumber++;
    manufacuredOn = new Date(System.currentTimeMillis());
    manufacturer = Item.manufacturer;
  }


  public int compareTo(Item o) {

    return name.compareTo(o.getName());
  }


  @Override
  public String toString() {

    return
        "Manufacturer : " + manufacturer + "\n" + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacuredOn + "\n" + "Name : " + name + "\n";
  }
}
