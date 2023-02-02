class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public void insertion_at_end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        System.out.println("Linked List: ");
        list.printList();

        int choice = 0;
        Scanner in = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("\n1. Insert node at the end of the list");
            System.out.println("2. Insert node at the start of the list");
            System.out.println("3. Insert node at a specific position");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data for new node: ");
                    int data = in.nextInt();
                    list.insertion_at_end(data);
                    System.out.println("Linked List after inserting node at end: ");
                    list.printList();
                    break;
                case 2:
                    System.out.println("Inserting node at start is already implemented.");
                    break;
                case 3:
                    System.out.println("Inserting node at a specific position is not implemented yet.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        in.close();
    }
}
