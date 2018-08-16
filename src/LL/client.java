package LL;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);

		list.addLast(40);
		list.addLast(50);
		list.display();
		//list.reverseDI();
		//list.display();
		//list.reversePI();
		//list.display();
		//list.reverse();
		list.dr();
		list.display();
		//list.createCycle();
	//	System.out.println(list.cycleExist());
		System.out.println(list.kthNode(3));
		

	}

}
