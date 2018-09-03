package algo.sorting;

public class CircularQueue {

	int arr[];
	int front;
	int rear;
	int size = 5;
	
	CircularQueue(){
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
		
	}
	
	public static void main(String[] args) {
		
		CircularQueue c = new CircularQueue();
		c.insert(10);
		c.insert(20);
		c.insert(30);
		c.insert(40);
		c.insert(50);
		c.insert(60);
		c.print();
		
		c.delete();
		int element = c.delete();
		System.out.println("**"+element);
		c.insert(60);
		c.print();
	}
	
	public void insert(int val) {
		if(front == 0 && rear == size-1 || rear == (front-1)%(size-1)) {
			System.out.println("Queue is full");
			return;
		}
		
		else if(front == -1) {
			front = rear = 0;
			arr[rear] = val;
		}
		
		else if(rear != size-1 && front != 0) {
			rear = 0;
			arr[rear] = val;
		}
		
		else {
			rear++;
			arr[rear] = val;
		}
	}
	
	public void print() {
		for(int i : this.arr) {
			System.out.println(i);
		}
	}
	
	public int delete() {
		
//		Queue is empty
		if(rear == -1 && front == -1) {
			System.out.println("Queue is empty");
			return 0;
		}
		
//		Single element
		if(front == rear) {
			this.arr[front] = 0;
			front = rear = -1;
		}
		

	    int data = arr[front];
	    arr[front] = -1;
	    if (front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	    else if (front == size-1)
	        front = 0;
	    else
	        front++;
	 
	    return data;
	}

}
