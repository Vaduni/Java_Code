package Java_Code;

public class Trie_WordBreakProblem {
    public static class Trie {
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

        public static boolean wordBreak(String key) {
            if (key.length() == 0) {
                return true;
            }
            for (int i = 1; i <= key.length(); i++) {
                String firstPart = key.substring(0, i);
                String secondPart = key.substring(i);
                if (Search(firstPart) && wordBreak(secondPart)) {
                    return true;
                }
            }
            return false;
        }

    }
    
    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key = "ilikesamsung";
        for (int i = 0; i < words.length; i++) {
            Trie.Insert(words[i]);
        }
        System.out.println(Trie.wordBreak(key));
    }
}
