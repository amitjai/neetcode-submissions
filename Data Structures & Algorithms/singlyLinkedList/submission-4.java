
class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        Node curr = head;
        for(int i=0; i<index; i++) {
            if(curr==null) {
                return -1;
            }
            curr = curr.next;
        }
        if(curr==null) {
            return -1;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public boolean remove(int index) {
        if(head==null) {
            return false;
        }
        if(index==0) {
            head = head.next;
            return true;
        }
        Node curr = head;
        for(int i=0; i<index-1; i++) {
            if(curr.next==null) {
                return false;
            }
            curr = curr.next;
        }
        if(curr.next==null) {
            return false;
        }
        curr.next = curr.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        if(head==null) {
            return res;
        }
        Node curr = head;
        while(curr!=null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
