public class Queue{
  int top;
  int beg;
  int[] queue;
  
  public void createQueue(int size){
    queue=new int[size];
    top=-1;
    beg=-1;
    System.out.println("Queue created of size "+size);
  }

  public boolean isFull(){
    if(top==queue.length-1){
      
      System.out.println("Queue is Full! :)");
      return true;
    }
    else{
      
      return false;
    }
  }

  public boolean isEmpty(){
    if(beg==-1){
      System.out.println("Alas! the queue is empty. :(");
      return true;
    }
    else{
      return false;
    }
  }
  public void enqueue(int value){
    if(isEmpty()){
      top++;
      beg++;
      queue[top]=value;
    }
    else if(isFull()){
      System.out.println("LOL. QUEUE already full.");
    }
    else {
      top++;
      queue[top]=value;
      System.out.println("Value enqueued successfully.");
    }
  }

  public void dequeue(){
    if(isEmpty()){
      System.out.println("HOLD UP. Queue already empty man. chill out.");
    }
    else{
      int result=queue[beg];
      beg++;
      System.out.println(result+ " -> Dequeued successfully from the queue.");
    }
  }

  
  public int peek(){
    if(isEmpty()){
      System.out.println("HOLD UP. Queue already empty man. chill out.");
      return -1;
    }
    else{
      return queue[beg];
    }
  }

  public void deleteQueue(){
    queue=null;
    System.out.println(" (Evil Laughter). Queue terminated successfully!");
  }
}
