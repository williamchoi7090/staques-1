import java.util.*;
  
class Main{
  Queue<Integer>a= new LinkedList<>(), b= new LinkedList<>();
  int curr_size;
  public Main(){
    curr_size= 0;
  }
  void remove(){
    if (a.isEmpty())
    return;
    while (a.size()!= 1){
      b.add(a.peek());
      a.remove();
    }
    a.remove();
    curr_size--;
    Queue<Integer>c= a;
    a= b;
    b= c;
  }
  void add(int x){
    a.add(x);
    curr_size++;
  }
  int top(){
    if (a.isEmpty())
    return -1;
    while (a.size()!= 1){
      b.add(a.peek());
      a.remove();
    }
    int temp= a.peek();
    a.remove();
    b.add(temp);
    Queue<Integer>c= a;
    a= b;
    b= c;
    return temp;
  }
  int size(){
    return curr_size;
  }
  public static void main(String[] args){
    Stack s= new Stack();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
    System.out.println("current size: "+ s.size());
    System.out.println(s.top());
    s.remove();
    System.out.println(s.top());
    s.remove();
    System.out.println(s.top());
     s.remove();
    System.out.println(s.top());
    System.out.println("current size: "+ s.size());
  }
}