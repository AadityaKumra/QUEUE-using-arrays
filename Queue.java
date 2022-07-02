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

  public void isFull(){
    if(top==queue.length-1){
      System.out.println("Queue is Full! :)");
    }
    else{
      System.out.println("Not full. I repeat not full.");
    }
  }
  // public void enqueue(int value){
    
  // }
 
}