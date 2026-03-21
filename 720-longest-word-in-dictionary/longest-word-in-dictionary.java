class Solution {

    class Node {
        private Node[] children = new Node[26];
        private boolean isTerminal = false;

        public boolean getIsTerminal() {
            return this.isTerminal;
        }

        public void setIsTerminal(boolean isTerminal) {
            this.isTerminal = isTerminal;
        }

        public boolean isChild(char ch) {
            return children[ch - 'a'] != null;
        }

        public void insertChild(char ch) {
            children[ch - 'a'] = new Node();
        }

        public Node getChild(char ch) {
            return children[ch - 'a'];
        }
    }

    private Node constructTrie(String[] words) {
        Node root = new Node();

        for (String word : words) {
            insert(word, root);
        }

        root.setIsTerminal(true);
        return root;
    }

    private void insert(String word, Node ptr) {
        for (int idx = 0; idx < word.length(); idx++) {
            char ch = word.charAt(idx);

            if (!ptr.isChild(ch)) {
                ptr.insertChild(ch);
            }

            ptr = ptr.getChild(ch);
        }

        ptr.setIsTerminal(true);
    }

    private String answer = "";

    private void dfs(Node ptr, String curr) {
        if (ptr == null || !ptr.getIsTerminal()) return;

        if (curr.length() > answer.length()) {
            answer = curr;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            dfs(ptr.getChild(ch), curr + ch);
        }
    }

    public String longestWord(String[] words) {
        Node root = constructTrie(words);
        dfs(root, "");
        return answer;
    }
}