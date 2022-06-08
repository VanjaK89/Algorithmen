package Nodes;

public class LinkedList {

    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }


    public Node getLast() {
        return last;
    }

   public void insertToDoText(String todoText) {
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        Node currentNode = first;               //currentNode zeigt auf ALD lernen
        currentNode = currentNode.getNext();    //currentNode zeigt auf Einkauf
       

        currentNode.setNext(newNode);
        newNode.setNext(last);
   }
}
