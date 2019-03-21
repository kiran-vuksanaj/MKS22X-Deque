public class MyDeque<E>{
  private E[] data;
  private int size,s,e;
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity]; //this is SO WEIRD
    size = 0;
    s = 0;
    e = 0;
  }
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    s = 0;
    e = 0;
  }

}
