package linked_lists_and_hash_tables;

public class CircularlyLinkedList extends SinglyList
{

    SinglyNode rootNode;

    @Override
    public void addToHead(String data)
    {
        super.addToHead(data);
    }

    @Override
    public void addToTail(String data)
    {
        //create new node with data
        SinglyNode singlyNode = new SinglyNode(data);

        //a singly linked list with the last node referencing the root node
        singlyNode.next = rootNode;
    }

    @Override
    public void delete(String data)
    {
        super.delete(data);
    }

    @Override
    public void insertAfter(String prevData, String newData)
    {
        SinglyNode current = head;

        // traverse through list
        while(current != null && !current.data.equals(prevData)) {
            current = current.next;
        }

        if(current != null) {
            // then we know current is pointing to the node after
            // which we add 'newData'
            SinglyNode newNode = new SinglyNode(newData);
            newNode.next = current.next;
            current.next = rootNode;
        }
    }
}
