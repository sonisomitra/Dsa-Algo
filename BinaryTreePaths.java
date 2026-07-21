class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }
    private void dfs(TreeNode node, StringBuilder path) {

        if (node == null)
            return;

        int len = path.length();

        if (len != 0)
            path.append("->");

        path.append(node.val);

        if (node.left == null && node.right == null) {
            ans.add(path.toString());
        } else {
            dfs(node.left, path);
            dfs(node.right, path);
        }
        path.setLength(len);
    }
}
