public class MyDeque<E>{
  private E[] data;
  private int size,s,e;
  public MyDeque(){
    data = new E[10];
    size = 0;
    s = 0;
    e = 0;
  }
}
