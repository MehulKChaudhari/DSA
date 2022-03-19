class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    class TrieNode {
        public char c;
        public boolean isWord;
        public TrieNode[] childNodes;

        public TrieNode(char c) {
            this.c = c;
            isWord = false;
            childNodes = new TrieNode[26];
        }
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (currentNode.childNodes[c - 'a'] == null) {
                currentNode.childNodes[c - 'a'] = new TrieNode(c);
            }
            currentNode = currentNode.childNodes[c - 'a'];
        }
        currentNode.isWord = true;
    }

    private TrieNode getNode(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (currentNode.childNodes[c - 'a'] == null) {
                return null;
            }
            currentNode = currentNode.childNodes[c - 'a'];
        }
        return currentNode;

    }

    public boolean search(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("cats");
        trie.insert("cate");

        System.out.println(trie.search("cats"));
    }
}
