import java.util.Arrays;
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
    if(data.length <= size()) resize();
    s = correctIndex(s-1);
    data[s] = element;
    size++;
  }
  public void addLast(E element){
    if(data.length <= size()) resize();
    data[e] = element;
    e = correctIndex(e+1);
    size++;
  }
  public E removeFirst(){
    E out = data[s];
    s = correctIndex(s+1);
    size--;
    return out;
  }
  public E removeLast(){
    e = correctIndex(e-1);
    E out = data[e];
    size--;
    return out;
  }
  public E getFirst(){
    return data[s];
  }
  public E getLast(){
    return data[correctIndex(e-1)];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String out = "{";
    for(int i=s;i!=e; i=correctIndex(i+1)){
      out += data[i] + " ";
    }
    return out + "}";
  }
  private void resize(){
    //System.out.println(Arrays.toString(data));
    E[] replace = (E[])new Object[data.length*2+1];
    int i = s;
    int newI = 0;
    while(newI < size()){
      replace[newI++] = data[i];
      i = correctIndex(i+1);
    }
    data = replace;
    //System.out.println(Arrays.toString(data));
    s = 0;
    e = size();
  }
  public static void main(String[] args){
    MyDeque<String> m = new MyDeque<String>();
    /*
    System.out.println(m.correctIndex(-1));
    System.out.println(m.correctIndex(10));
    System.out.println(m.correctIndex(11));
    m.addFirst("woah");
    m.addFirst("hi there");
    m.addLast("whats up");
    m.addLast("howdy");
    System.out.println(m+" "+m.size());
    System.out.println(m.getFirst());
    System.out.println(m.removeFirst());
    System.out.println(m.getFirst());
    System.out.println(m.getLast());
    System.out.println(m.removeLast());
    System.out.println(m.getLast());
    System.out.println(m+" "+m.size());
    */
    for(int i=0;i<20;i++){
      m.addFirst("j");
      m.addLast("h");
    }
    System.out.println(m);
    while(m.size()>0){
      System.out.println(m.removeFirst());
      System.out.println(m.removeLast());
    }
    System.out.println(m);
  }
}
