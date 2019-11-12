boolean isTreeSymmetric(Tree<Integer> t) {
    return helper(t, t);
}
boolean helper(Tree<Integer> leftNode, Tree<Integer> rightNode) {
    if (leftNode == null || rightNode == null)
        return leftNode == rightNode;
    boolean outerCheck =  helper(leftNode.left, rightNode.right);
    boolean innerCheck = helper(leftNode.right, rightNode.left);
    return outerCheck && innerCheck && (leftNode.value).equals(rightNode.value);   
}
