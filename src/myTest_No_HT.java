// Name: Tyler Stroud
// Class: CS 3305/section W01
// Term: Spring 2025
// Instructor: Emin Mary Abraham
// Assignment: 3
import java.util.Scanner;

public class myTest_No_HT
{
    public static void main (String[] args) throws Exception
    {
        LinkedList_No_HT myList = new LinkedList_No_HT(); //create a list object
        Scanner s = new Scanner(System.in); // scanner object
        int input = 0; // menu input


        try{
            // MAIN MENU
           while(input != 10){
               System.out.print("\n\n---------MAIN MENU--------\n" +
                       "1 – Add First Node\n" +
                       "2 – Add Last Node\n" +
                       "3 – Add At Index\n" +
                       "4 – Remove First Node\n" +
                       "5 – Remove Last Node\n" +
                       "6 – Remove At Index\n" +
                       "7 – Print List Size\n" +
                       "8 – Print List Forward\n" +
                       "9 – Print List In Reverse\n" +
                       "10- Exit program\n\n" +
                       "Enter option number:");
               input = Integer.parseInt(s.nextLine());

               // Menu functions
               switch(input){
                   /* addFirstNode */
                   case 1:
                       System.out.print("\nEnter the node data you want to add: ");
                       int firstNode = Integer.parseInt(s.nextLine());
                       System.out.println("\nMethod addFirstNode()");
                       System.out.print("List content before adding "+firstNode+" is:\t");
                       myList.printList();
                       myList.addFirstNode(firstNode);
                       System.out.print("\nList content after adding "+firstNode+" is:\t\t");
                       myList.printList();
                       System.out.println();
                       break;

                   /* addLastNode */
                   case 2:
                       System.out.print("\nEnter the node data you want to add: ");
                       int lastNode = Integer.parseInt(s.nextLine());
                       System.out.println("\nMethod addLastNode()");
                       System.out.print("List content before adding "+lastNode+" is:\t");
                       myList.printList();
                       myList.addLastNode(lastNode);
                       System.out.print("\nList content after adding "+lastNode+" is:\t");
                       myList.printList();
                       System.out.println();
                       break;

                   /* addAtIndex */
                   case 3:
                       System.out.print("\nWhat index would you like your new node?: ");
                       int index = Integer.parseInt(s.nextLine());

                       // invalid index catch
                       while(index < 0 || index >= myList.countNodes())
                       {
                           System.out.print("\nInvalid index, try again.\nWhat index would you like your new node: ");
                           index = Integer.parseInt(s.nextLine());
                       }

                       System.out.print("\nEnter the node data you want to add: ");
                       int indexNode = Integer.parseInt(s.nextLine());
                       System.out.println("\nMethod addAtIndex()");
                       System.out.print("List content before adding "+indexNode+" is:\t");
                       myList.printList();
                       myList.addAtIndex(index,indexNode);
                       System.out.print("\nList content after adding "+indexNode+" is:\t");
                       myList.printList();
                       System.out.println();
                       break;

                   /* removeFirstNode */
                   case 4:
                       // empty list catch
                       if(myList.countNodes() == 0) {
                           System.out.println("List is Empty.");
                           break;
                       }

                       System.out.println("\nMethod removeFirstNode()");
                       System.out.print("List content before removing first node is:\t\t");
                       myList.printList();
                       myList.removeFirstNode();
                       System.out.print("\nList content after removing first node is:\t\t");
                       myList.printList();
                       break;

                   /* removeLastNode */
                   case 5:
                       // empty list catch
                       if(myList.countNodes() == 0) {
                           System.out.println("List is Empty.");
                           break;
                       }

                       System.out.println("\nMethod removeLastNode()");
                       System.out.print("List content before removing last node is:\t");
                       myList.printList();
                       myList.removeLastNode();
                       System.out.print("\nList content after removing last node is:\t");
                       myList.printList();
                       break;
                       
                   /* removeAtIndex */
                   case 6:
                       // empty list catch
                       if(myList.countNodes() == 0) {
                           System.out.println("List is Empty.");
                           break;
                       }
                       System.out.print("Which index do you want to remove?: ");
                       int removeIndex = Integer.parseInt(s.nextLine());
                       
                       // invalid index catch
                       while(removeIndex < 0 || removeIndex >= myList.countNodes()){
                           System.out.print("\nInvalid index, try again.\nWhat index would you to remove?: ");
                           removeIndex = Integer.parseInt(s.nextLine());
                       }
                       
                       System.out.println("\nMethod removeAtIndex()");
                       System.out.print("List content before removing node at index "+removeIndex+" is:\t");
                       myList.printList();
                       myList.removeAtIndex(removeIndex);
                       System.out.print("\nList content after removing node at index "+removeIndex+" is:\t\t");
                       myList.printList();
                       break;
                       
                   /* print list size */
                   case 7:
                       System.out.println("\nMethod countNodes()" +
                               "\nThere are "+myList.countNodes()+" nodes in your list.");
                       break;

                   /* print list forward */
                   case 8: 
                       System.out.println("\nMethod printList()");
                       System.out.print("Here is your list:\t");
                       myList.printList();
                       break;

                   /* print list in reverse */
                   case 9:
                       System.out.println("\nMethod printInReverseRecursive()");
                       System.out.print("Here is your list:\t");
                       myList.printInReverseRecursive(myList.ListName);
                       break;
               }
           }
           System.out.println("\nExiting...");
        }catch(NumberFormatException e){
            System.out.println("\nInvalid menu option, please choose between options 1-10");
        }

    }
}
