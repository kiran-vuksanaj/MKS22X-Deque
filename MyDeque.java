public class MyDeque<E>{
  private E[] data;
  private int size,s,e;
  public MyDeque(){
    data = null; //you can't make a generic array??? why???
    size = 0;
    s = 0;
    e = 0;
  }

}
