class Main {
  public static void main(String[] args) {
    Queue q=new Queue();
    q.createQueue(7);
    q.isFull();
    q.isEmpty();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    q.isFull();
    q.isEmpty();
    q.dequeue();
    q.dequeue();
    int beg=q.peek();
    System.out.println(beg+" -> is the beginning element in queue.");
    q.enqueue(7);

    beg=q.peek();
    System.out.println(beg+" -> is the beginning element in queue.");

    q.deleteQueue();
  }
}