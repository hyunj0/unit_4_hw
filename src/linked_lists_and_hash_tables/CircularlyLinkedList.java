package linked_lists_and_hash_tables;

public class CircularlyLinkedList {

    CircularlyNode head;

    public void addToHead(String data) {
        CircularlyNode newNode = new CircularlyNode(data);
        newNode.next = head;
        head = newNode;

        CircularlyNode currentNode = head.next;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = head;
    }

    public void addToTail(String data) {
        CircularlyNode newNode = new CircularlyNode(data);
        CircularlyNode currentNode = head.next;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void delete(String data) {
        if(head == null) {
            return;
        }
        if(head.data.equals(data)) {
            head = head.next;
        }
        CircularlyNode prevNode = head;
        while (prevNode.next != null) {
            if (prevNode.next.data.equals(data)) {
                if (prevNode.next.next != null){
                    prevNode.next = prevNode.next.next;
                }
                prevNode.next = head;
            }
            prevNode = prevNode.next;
        }
    }

    public void insertAfter(String prevData, String newData) {
        CircularlyNode current = head;

        while(current != null && !current.data.equals(prevData)) {
            current = current.next;
        }

        if(current != null) {
            CircularlyNode newNode = new CircularlyNode(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}
