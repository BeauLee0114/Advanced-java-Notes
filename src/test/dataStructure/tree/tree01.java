package test.dataStructure.tree;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : 李博
 * @Description
 * @create 2023/3/20 15:50
 * @Modified By
 */
public class tree01 {
    public static class TreeNode<E> {
        public E element;
        public TreeNode<E> left;
        public TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }

        private static <T> void preOrder(TreeNode<T> root){
            if (root == null) {
                return;
            }
            System.out.println(root.element);
            preOrder(root.left);
            preOrder(root.right);
        }

        private static <T> void inOrder(TreeNode<T> root){
            if (root == null) {
                return;
            }
            preOrder(root.left);
            System.out.println(root.element);
            preOrder(root.right);
        }

        private static <T> void postOrder(TreeNode<T> root){
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.element);  //时机延迟到最后
        }

        public static void main(String[] args) {
            TreeNode<Character> a = new TreeNode<>('A');
            TreeNode<Character> b = new TreeNode<>('B');
            TreeNode<Character> c = new TreeNode<>('C');
            TreeNode<Character> d = new TreeNode<>('D');
            TreeNode<Character> e = new TreeNode<>('E');
            TreeNode<Character> f = new TreeNode<>('F');
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            System.out.println(a.left.left.element);

        }
    }


}
