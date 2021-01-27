package edu.cnm.deepdive;

import common.Common;

public class UsingAccessModifiers {

  public static void main(String[] args) {
    Common common = new Common();
    common.publicPrint();
//    common.protectedPrint();we are in a different package so only methods with the public access
//    common.defaultPrint(); modifier can be reached.
//    common.privatePrint();

    System.out.println("\npublicNumber = " + common.publicNumber);
//    System.out.println("protectedNumber = " + common.protectedNumber);
//    System.out.println("defaultNumber = " + common.defaultNumber);
//    System.out.println("privateNumber = " + common.privateNumber);
//    we are in a different package so only fields with the public access modifier can be reached.
  }

}
