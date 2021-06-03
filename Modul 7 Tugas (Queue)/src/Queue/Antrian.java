package Queue;

public class Antrian {
	private int size;
    private long[] queue;
    private int back;
    private int AllItem;
    private int front;
    
    public Antrian (int n){
        size = n;
        queue = new long[size];
        front = 0;
        back = -1;
        AllItem = 0;
    }
    
    public void enqueue(long j){
        if(!isFull()){
            queue[++back] = j;
            AllItem++;
        }
    }
    
    public long dequeue(){
        long temp = queue[0];
        if(!isEmpty()){
            for(int i = 0; i < AllItem; i++)
                queue[i] = queue[i+1];
                AllItem--;
                back--;
        }
        return temp;
    }
    
    public long peek(){
        return queue[front];
    }
    
    public boolean isEmpty(){
        return(AllItem == 0);
    }
    
    public boolean isFull(){
        return(back == size - 1);
    }
    
    public int ukuran(){
        return AllItem;
    }
    
    public void display(){
        for(int i = 0; i < AllItem; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println("");
    }
    
    public void address() {
		System.out.println("===========================");
		System.out.println("Nama : Widies Ade Priyanto" + "\n" + "NIM  : 20090126");
		System.out.println("===========================" + "\n");
	}
}
