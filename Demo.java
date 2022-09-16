//1.6 Write a program to demonstrate static variables, methods, and blocks.

package practiceProblem;

public class Demo {
  static String carBrand="maruti";
  int year;
  Demo(int year,String brand){
    this.year=year;
    carBrand=brand;
  }
  public void displayYear(){
      System.out.println(this.year);
  }

  public static void main(String[] args) {
    Demo demo1=new Demo(2014,"maruti");
    System.out.println(demo1.carBrand);   
    demo1.displayYear();
   
    
    Demo demo2=new Demo(2018,"mercedes");
    System.out.println(demo2.carBrand);
    demo2.displayYear();
    
    System.out.println(demo1.carBrand);
    demo1.displayYear();
  }
}
