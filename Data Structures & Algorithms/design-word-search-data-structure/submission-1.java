class WordDictionary {

    class Node{
        char c ;
        Node[] children;
        boolean isEnd;

         Node(char c){
            this.c = c;
            children = new Node[26];
            isEnd = false;
        }
    }
    Node root;

    public WordDictionary() {
        root = new Node('\0');
    }

    public void addWord(String word) {
        Node curr = root;

        for(char c : word.toCharArray()){
            int index = c-'a';
            if(curr.children[index]==null){
                curr.children[index] = new Node(c);
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Node curr = root;
        return dfs(word,0, curr);
    }

    public boolean dfs(String word,int index,Node curr){
        if(index==word.length())return curr.isEnd;

        char ch = word.charAt(index);

        if(ch=='.'){

            for(Node child : curr.children){

                if(child!=null && dfs(word,index+1,child))return true;
                
            }
            return false;
        }

        if(curr.children[ch-'a']==null){
            return false;
        }
        return dfs(word,index+1,curr.children[ch-'a']);
    }
}
