package LL;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		int counter = 0;
		Node temp = this.head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}

		return temp;
	}

	public void addAt(int data, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		return this.getNodeAt(index).data;

	}

	public void removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
	}

	public void removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(this.size() - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
	}

	public void removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			this.removeFirst();
		} else if (index == this.size - 1) {
			this.removeLast();
		} else {
			Node temp = this.getNodeAt(index - 1);
			temp.next = temp.next.next;
			this.size--;
		}
	}

	public void reverseDI() throws Exception {

		for (int i = 0; i < this.size / 2; i++) {
			int swap = this.getNodeAt(this.size - i - 1).data;
			this.getNodeAt(this.size - i - 1).data = this.getNodeAt((i)).data;
			this.getNodeAt(i).data = swap;


			//addAt(temp2,i);
			//addAt(getNodeAt(i).data,this.size-i);
		}

	}

	public void reversePI() throws Exception {
		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public void reverse() throws Exception {

		reversePR(null, head);
	}

	public void reversePR(Node prev, Node curr) throws Exception {

		Node next = null;

		if(curr == null) {
		head=prev;
		return;
		}
			next = curr.next;
			curr.next = prev;
			reversePR(curr,next);

		}
		public void dr(){
		dataRecursively(head,head,0);
		}
		static int i=1;
		public void dataRecursively(Node left,Node right,int level){

		if(right==null){
			return;
		}
		//right=curr.next;
		dataRecursively(left,right.next,level+1);
		//curr.data=head.data;
		if(level>=size/2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			left = left.next;
		}



	}


public void createCycle() throws Exception {
			Node temp=getNodeAt(3);
			tail.next=temp;



}

		public boolean cycleExist() {

			Node slow=head;
			Node fast=head.next;

			while(slow.next!=null&&fast.next!=null&&fast.next.next!=null){
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast){
					return true;
				}

			}
		return false;

	}
	public int kthNode(int k){

			Node curr=head;
			Node curr1=head;
			while(k>=0){
				curr=curr.next;
				k--;
			}
			while(curr!=null&&curr1!=null){
				curr=curr.next;
				curr1=curr1.next;
			}
			return curr1.data;


	}
}
