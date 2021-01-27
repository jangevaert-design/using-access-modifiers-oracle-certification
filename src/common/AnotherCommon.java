package common;

public class AnotherCommon {

  public static void main(String[] args) {
    Common common = new Common();
    common.publicPrint();
    common.protectedPrint();
    common.defaultPrint();
//  common.privatePrint();does not print this line because the private access modifier only allows
//  access within its own class

    System.out.println("\npublicNumber = " + common.publicNumber);
    System.out.println("protectedNumber = " + common.protectedNumber);
    System.out.println("defaultNumber = " + common.defaultNumber);
//  System.out.println("privateNumber = " + common.privateNumber);does not print this field because
//  the private access modifier only allows access within its own class
  }

}
