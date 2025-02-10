package Java_Code;

public class Trie_CountUnqueSubStrings {
    static class Node {
        Node children[];
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    public static Node root = new Node();

    public static void Insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean Search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && curr.children[idx].endOfWord == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
public static int countNode(Node root){
int count=0;
if(root==null){
    return 0;
}
for(int i=0;i<26;i++){
    if(root.children[i]!=null){
        count+=countNode(root.children[i]);
    }
}
return count+1;
}
    public static void main(String[] args) {
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            System.out.println(suffix);
            Insert(suffix);
        }
        System.out.println("Total unique count= "+countNode(root));
    }
}
