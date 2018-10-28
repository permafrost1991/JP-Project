/**
*
* Author : James Hood
* Step 1: Create an interface called Item that will force all classes to implement functions
*
 */

package sample;


import java.util.Date;

public interface Item {
  String manufacturer = "OracleProduction";

  //setter ProductionNumber
  void setProductionNumber(int productionNumber);

  //setter setName
  void setName(String name);

  //Getter getName
  String getName();

  //Getter getManufactureDate
  Date getManufactureDate();

  //getter getSerialNumber
  int getSerialNumber();

}

