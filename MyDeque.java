public class MyDeque<E>{
  private E[] data;
  private int size,s,e;
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10]; //this is SO WEIRD
    size = 0;
    s = 0;
    e = 0;
  }

}
