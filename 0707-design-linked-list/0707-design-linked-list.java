class MyLinkedList {
    class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
        }
    }

    int size;
    Node head;
    Node tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {  // Ensure index is valid
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {  // Traverse to the index
            temp = temp.next;
        }
        return temp.val; // Safe to access as null check was done
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            addAtHead(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {  // Ensure valid index
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {  // Move to the correct position
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) { // Ensure valid index
            return;
        }
        if (index == 0) { 
            head = head.next; 
            if (head == null) tail = null; 
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) { // If deleting last element, update tail
                tail = temp;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */