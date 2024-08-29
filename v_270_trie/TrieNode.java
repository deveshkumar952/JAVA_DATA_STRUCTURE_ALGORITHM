package v_270_trie;

public class TrieNode {
    Map<Character,TrieNode> children;
    boolean endOfString;

    public TrieNode(){
        children = new HashMap<>();
        endOfString = false;
    }
}
