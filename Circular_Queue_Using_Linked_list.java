package DataStructure;

public class Circular_Queue_Using_Linked_list {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next = null;
		}
	}
	static class Queue {
        Node front, rear;
    }
  
    static void push(Queue q, int data)
    {
        Node temp = new Node(data);
        if (q.front == null)
            q.front = temp;
        else
            q.rear.next = temp;
  
        q.rear = temp;
        q.rear.next = q.front;
    }
    
    static int pull(Queue q)
    {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int value; 
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else
        {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
  
        return value;
    }

    static void print(Queue q)
    {
        Node temp = q.front;
        while (temp.next != q.front) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
    
    public static void main(String[] args) {
		Queue q = new Queue();
        q.front = q.rear = null;
        push(q, 10);
        push(q, 20);
        push(q, 30);
        print(q);
        pull(q);
        print(q);
	}
}
