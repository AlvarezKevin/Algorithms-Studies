package DataStructures;

import java.util.LinkedList;

/**
 * Created by Kevin on 6/5/2017.
 */
public class LinkedLists<T extends Comparable> {
    private LinkNode first;

    public LinkedLists() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirstNode(T value) {
        LinkNode newNode = new LinkNode(value);

        newNode.next = first;

        first = newNode;
    }

    public void insert(T value) {
        if(first == null) {
            first = new LinkNode<T>(value);
            return;
        }
        LinkNode newNode = new LinkNode(value);
        newNode.next = null;

        LinkNode last = first;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public LinkNode removeFirst() {

        LinkNode node = first;

        if(!isEmpty()) {
            first = first.next;
        }else {
            System.out.println("Empty");
        }
        return node;
    }

    public void printList() {
        LinkNode temp = first;

        while(temp != null) {
            temp.toString();
            temp = temp.next;
        }
    }

    public LinkNode find(T value) {
        LinkNode temp = first;

        if(!isEmpty()) {
            while(temp != null) {
                if(temp.value == value) {
                    return temp;
                }
                temp = temp.next;
            }
        }else {
            System.out.println("List is empty");
        }
        return temp;
    }

    public LinkNode remove(T value) {
        LinkNode curr = first;
        LinkNode prev = first;

        while(curr.value != value) {
            if(curr.next == null) {
                return null;
            }else {
                prev = curr;

                curr = curr.next;
            }
        }
        if(curr == first) {
            first = first.next;
        }else {
            prev.next = curr.next;
        }
        return curr;
    }

    public void display() {
        LinkNode temp = first;

        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedLists<Integer> list = new LinkedLists<>();

        list.insertFirstNode(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);

        list.display();

        list.remove(400);
        System.out.println();

        list.display();

    }
}
