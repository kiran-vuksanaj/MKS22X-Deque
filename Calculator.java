public class Calculator{
  public static void main(String[] args){
    System.out.println(eval(String.join(" ",args)));
  }
  public static double eval(String s){
    String[] tokens = s.split("\\s+");
    for(String token : tokens){
      System.out.println(token);
    }
    return -1;
  }
}
