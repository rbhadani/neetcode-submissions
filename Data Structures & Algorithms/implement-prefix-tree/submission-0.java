class PrefixTree {

    class Node{
        Node[] children;
        boolean isEnd;

        Node(){
            children = new Node[26];
            isEnd = false;
        } 
    }
    Node root;

    public PrefixTree() {
          root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        
        for(char c : word.toCharArray()){

            int index = c-'a';

            if(curr.children[index]==null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
        
    }

    public boolean search(String word) {
        Node curr = root;

        for(char c : word.toCharArray()){
            if(curr.children[c-'a']!=null){
            curr = curr.children[c-'a'];
            }
            else return false;
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;

        for(char c : prefix.toCharArray()){
            if(curr.children[c-'a']!=null){
                curr = curr.children[c-'a'];
            }
            else{
                return false;
            }
        }
return true;
    }
}
