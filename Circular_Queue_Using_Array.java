package DataStructure;

public class Circular_Queue_Using_Array {
	public static void main(String[] args) {
		Queue ob = new Queue(10,10);
		ob.push(50);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.pull();
	}
}
class Queue{
	public int front,rear,size;
	public int arr[];
	
	Queue(int size,int x){
		this.front = -1;
		this.rear = -1;
		this.size = x;
		arr = new int[size];
	}
	
	public boolean isEmpty() {
		if(front == -1) return true;
		return false;
	}
	
	public boolean isFull() {
		if(front ==0 && rear == size-1) return true;
		else if(front == rear+1) return true;
		return false;
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Queue is full");;
		}
		else
		{
			if(front == -1) front = 0;
			rear = (rear+1)%size;
			arr[rear] = element;
		}
	}
	
	public void pull() {
		int data;
		if(isEmpty()) {
			System.out.println("");;
		}
		else
		{
			data = arr[front];
			if(front == rear ) {
				front = -1;
				rear = -1;
			}
			else {
				front = (front+1)%size;
			}
			System.out.println(data);
		}
	}
		
}
