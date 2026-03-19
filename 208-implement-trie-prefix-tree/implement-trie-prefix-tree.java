class Node {
    Node []children = new Node[26];
    boolean isTerminal = false;
}

class Trie {

    
    Node root = new Node();
    public void insert(String word) {
        Node ptr = root;
        for(int idx = 0; idx<word.length(); idx++){
            char ch = word.charAt(idx);
            if(ptr.children[ch - 'a'] == null){
                ptr.children[ch - 'a'] = new Node();
            }
            ptr = ptr.children[ch - 'a'];
        }
        ptr.isTerminal = true;
        
        
    }
    
    public boolean search(String word) {
        Node ptr= root;
        for(int idx = 0; idx<word.length(); idx++){
            char ch = word.charAt(idx);
            if(ptr.children[ch - 'a'] == null){
                return false;
            }
            ptr = ptr.children[ch - 'a'];
            
            
        }
        return ptr.isTerminal;
        
    }
    
    public boolean startsWith(String prefix) {
        Node ptr = root;
        for(int idx = 0; idx< prefix.length(); idx++){
            char ch = prefix.charAt(idx);
            if(ptr.children[ch - 'a'] == null){
                return false;
            }
            ptr = ptr.children[ch - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */