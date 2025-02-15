import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentArray studArray = new StudentArray();
        SinglyLinkedList studLinkedList = new SinglyLinkedList();

        while(true) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();

            System.out.println("Operations: ");
            System.out.println("1. Insert to Array: ");
            System.out.println("2. Insert to Linked List: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                studArray.insert(num);
                System.out.println("After insertion: " + studArray);
            } else if (choice == 2) {
                System.out.println("Options: ");
                System.out.println("1. Insert at Beginning");
                System.out.println("2. Insert at End");
                int insertChoice = scanner.nextInt();

            if (insertChoice == 1) {
                studLinkedList.insertAtBeginning(num);
            } else {
                studLinkedList.insertAtEnd(num);
            }
            System.out.println("After insertion: ");
            studLinkedList.display();
            } 

            System.out.println("Options: ");
            System.out.println("1. Enter a new value");
            System.out.println("2. End");
            int nextChoice = scanner.nextInt();

            if (nextChoice == 2) break;
        }
        
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StudentArray {
    private ArrayList<Integer> studentList;

    public StudentArray() {
        studentList = new ArrayList<>();
    }
    public void insert(int num) {
        studentList.add(num);
    }
    @Override
    public String toString() {
        return studentList.toString();
    }
}

class SinglyLinkedList {
    private Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    } 
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}