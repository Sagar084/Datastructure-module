class LinkedList{
	static Node head;
static class Node{
	int data;
	Node next;
	Node(int d)
	{
	data = d;
	next = null;
	}
}
Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;

	while(current != null){
		next = current.next;
		current.next=prev;
		prev= current;
		current= next;
	}
	node = prev;
	return node;
}

void printList(Node node){

	while(node!=null){
		System.out.print(node.data +"");
		node =node.next;
	}
}
	
public static void main(String args[]){
	LinkedList l1 = new LinkedList();
	l1.head = new Node(4);
	l1.head.next=new Node(6);
	l1.head.next.next=new Node(9);
	l1.head.next.next.next=new Node(11);
System.out.println("given Linked List");
l1.printList(head);
head= l1.reverse(head);
System.out.println("");
System.out.println("Reversed list");
l1.printList(head);
}
}