class LRUCache {

    final int capacity;
    final Map<Integer, ListNode> cache;
    final ListNode head;
    final ListNode tail;

    static class ListNode {
        int key, value;
        ListNode prev, next;
        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        // dummy head and tail nodes to avoid null checks
        head = new ListNode(0, 0);
        tail = new ListNode(0, 0);
        head.next = tail;
        tail.prev = head;        
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        
        // move the accessed node to the head
        ListNode node = cache.get(key);
        moveToHead(node);
        return node.value;        
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // update the value and move to head
            ListNode node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            // add a new node
            ListNode newNode = new ListNode(key, value);
            cache.put(key, newNode);
            addNode(newNode);
            
            if (cache.size() > capacity) {
                // remove the least recently used node
                ListNode tailNode = removeTail();
                cache.remove(tailNode.key);
            }
        }        
    }

    private void addNode(ListNode node) {
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(ListNode node) {
        ListNode prev = node.prev;
        ListNode next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    private void moveToHead(ListNode node) {
        removeNode(node);
        addNode(node);
    }
    
    private ListNode removeTail() {
        ListNode res = tail.prev;
        removeNode(res);
        return res;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */