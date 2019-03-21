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

  private int correctIndex(int i){
    if(i < 0 || i >= data.length) return (i + data.length)%data.length;
    return i;
  }

  public void addFirst(E element){
    s = correctIndex(s-1);
    data[s] = element;
  }
  public static void main(String[] args){
    MyDeque<String> m = new MyDeque<String>();
    System.out.println(m.correctIndex(-1));
    System.out.println(m.correctIndex(10));
    System.out.println(m.correctIndex(11));
  }
}
