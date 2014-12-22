//Sample from http://stackoverflow.com/questions/14975432/regarding-finding-the-middle-element-of-linked-list

public class Solution1 {

    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        LinkedList.Node head = linkedList.head();
        linkedList.add( new LinkedList.Node("1"));
        linkedList.add( new LinkedList.Node("2"));
        linkedList.add( new LinkedList.Node("3"));
        linkedList.add( new LinkedList.Node("4"));

        //finding middle element of LinkedList in single pass
        LinkedList.Node middleNode = head;
        LinkedList.Node currentNode = head;

        while (middleNode.next() != null ) {
            middleNode = middleNode.next();
            if (middleNode.next() != null) {
                middleNode = middleNode.next();
                currentNode = currentNode.next();

            }
        }

        System.out.println("middle element of LinkedList : " + currentNode);

    }


}
