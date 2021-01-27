package common;

public class Common {

  public int publicNumber = 10;
  protected int protectedNumber = 20;
  int defaultNumber = 30;
  private int privateNumber = 40;



  public void publicPrint() {
    System.out.println("public");
  }

  protected void protectedPrint() {
    System.out.println("protected");
  }

  void defaultPrint() {//default or package protected does not have an access modifier.
    System.out.println("default");
  }

  private void privatePrint() {
    System.out.println("private");
  }

  public static void main(String[] args) {
    Common common = new Common();
    common.publicPrint();
    common.protectedPrint();
    common.defaultPrint();
    common.privatePrint();//prints all four methods since we are in the same class.

    System.out.println("\npublicNumber = " + common.publicNumber);
    System.out.println("protectedNumber = " + common.protectedNumber);
    System.out.println("defaultNumber = " + common.defaultNumber);
    System.out.println("privateNumber = " + common.privateNumber);//prints all four fields since we
    //are in the same class.
  }
}
