package Nodes;

public class Node {

    private String todoText;
    private Node next;

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
