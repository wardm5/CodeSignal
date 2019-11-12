//
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if (t == null) 
        return false;
    return helper(t, s, 0);
}
boolean helper(Tree<Integer> t, int s, int total) {
    if (t == null)
        return false;
    else if (t.left == null && t.right == null && total + t.value == s)
        return true;
    else
        return helper(t.left, s, total + t.value) || helper(t.right, s, total + t.value);
}
