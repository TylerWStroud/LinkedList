// Name: Tyler Stroud
// Class: CS 3305/section W01
// Term: Spring 2025
// Instructor: Emin Mary Abraham
// Assignment: 3
public class LinkedList_No_HT
{
    public Node ListName;

    //constructor method to create a list object with a specifc name.
    public LinkedList_No_HT()
    {
        ListName = null;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (ListName == null)
            ListName = new Node(data); //one node list
        else
        {
            Node temp = ListName;
            while (temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = new Node(data); //link new node as last node
        }
    }

    //======== Your part to complete for this assignment =========

    //method #1: add first node
    public void addFirstNode(int data)
    {
        // swaps new data node with the ListName 'header' node index
        Node firstNode = new Node(data);
        firstNode.next = ListName;
        ListName = firstNode;
    }


    //method #2: add node at index
    public void addAtIndex(int index, int data)
    {
        // in case requested index is 0
        if(index == 0)
            addFirstNode(data);
        else
        {
            Node indexNode = new Node(data);

            // list traversal to specified index
            Node temp = ListName;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }

            // node swap
            indexNode.next = temp.next;
            temp.next=indexNode;
        }
    }


    //method #3: remove first node
    public void removeFirstNode() {
            ListName = ListName.next;
    }


    //method #4: remove last node
    public void removeLastNode()
    {
            Node temp = ListName;
            // traversal to second-to-last node
            while(temp.next.next != null){
                temp = temp.next;
            }
            // makes last node null
            temp.next = null;
    }


    //method #5: remove node at index
    public void removeAtIndex(int index)
    {
        if(index == 0 )
            removeFirstNode();
        else
        {
            Node temp = ListName;
            // node traversal
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            // sets next node's data its next node's data
            temp.next = temp.next.next;
        }
    }

    //method #6: countNodes
    public int countNodes()
    {
        int listSize= 0;
        // checks nullity
        if(ListName == null)
            return listSize;
        else
        {
            Node temp = ListName;
            // initial element count
            listSize++;
            // traversal count
            while (temp.next != null) {
                listSize++;
                temp = temp.next;
            }
        }
        return listSize;
    }


    //method #7: printInReverse (must be a Recursive method)
    public void printInReverseRecursive(Node L)
    {
        if(L != null){
            // recursive traversal to end of list
            printInReverseRecursive(L.next);
            // print node data
            System.out.print(L.data+"   ");
        }
    }

    //================= end of your part ==============

    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = ListName;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}


