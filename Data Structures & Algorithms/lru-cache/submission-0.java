class LRUCache {

    class Node{
        int key;
        int val;

        Node prev;
        Node next;

        Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    Node head;
    Node tail;

    Node prev;
    Node next;
    int capacity;

    HashMap<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
       map = new HashMap<>();
       head = new Node(0,0);
       tail = new Node(0,0);

       head.next = tail;
       tail.prev = head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            remove(oldNode);
        }
        Node curr = new Node(key,value);
        map.put(key,curr);

        insert(curr);

        if(map.size()>capacity){
            Node node = tail.prev;
            remove(node);
            map.remove(node.key);
        }
    }
    public void insert(Node node){

      Node nextNode = head.next;
      head.next = node;
      node.prev = head;

      node.next = nextNode;
      nextNode.prev = node;

    }
    public void remove(Node node){
         Node prevNode = node.prev;
         Node nextNode = node.next;

         prevNode.next = nextNode;
         nextNode.prev = prevNode;
    }
}
