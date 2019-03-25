public class Calculator{
  public static void main(String[] args){

  }
  public static double eval(String s){
    String[] tokens = s.split("\\s+");
    for(String s : tokens){
      System.out.println(s);
    }
  }
}
