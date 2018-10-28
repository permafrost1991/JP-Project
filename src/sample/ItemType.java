package sample;

/**
 *
 * Author: James Hood
 * Step 2: enum that will store 4 types of pre-set types.
 *
 *******************************************/


public enum ItemType {

  /**
   * pre-set types.
   */
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  final String code;

  ItemType(String newCode) {

    code = newCode;
  }

}