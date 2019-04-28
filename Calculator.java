public class Calculator{
  public static void main(String[] args){
    System.out.println(eval(String.join(" ",args)));
  }
  public static double eval(String s){
    String[] tokens = s.split("\\s+");
    MyDeque<Double> operands = new MyDeque<Double>();
    for(String token : tokens){
      try{
        //will stay here when numberformatexception doesn't come up, meaning its an operand
        Double d = Double.valueOf(token);
        operands.addLast(d);
      }catch(NumberFormatException e){
        //catches for when its an operator, carries out operate and adds to stack
        operands.addLast( operate(token,operands) );
      }
    }
    return operands.removeLast();
  }
  private static Double operate(String operator,MyDeque<Double> operands){
    double operandA = operands.removeLast();
    double operandB = operands.removeLast();
    switch (operator){
      case "*":
        return operandB * operandA;
      case "/":
        return operandB / operandA;
      case "+":
        return operandB + operandA;
      case "-":
        return operandB - operandA;
      case "%":
        return operandB % operandA;
    }
    throw new IllegalArgumentException("bad operator "+operator);
  }
}
