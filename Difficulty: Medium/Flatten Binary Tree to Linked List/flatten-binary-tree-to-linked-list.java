/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
        public static void flatten(Node root) {
            ArrayList<Node> arr = new ArrayList<>();
            dfs(root, arr);
            for (int i = 0; i < arr.size() - 1; i++) {
                Node a = arr.get(i);
                Node b = arr.get(i + 1);
                a.right = b;
                a.left = null;
            }
            Node last = arr.get(arr.size() - 1);
            last.left = null;
            last.right = null;
        }

        private static void dfs(Node root, ArrayList<Node> arr) {
            if (root == null) return;
            // preorder traversal
            arr.add(root);
            dfs(root.left, arr);
            dfs(root.right, arr);
        }
    }