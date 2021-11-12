package 数据结构与算法.二叉树.前_中_后序遍历_查找_删除;

public class test {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Node a = new Node(1, "a");
		Node b = new Node(2, "b");
		Node c = new Node(3, "c");
		Node d = new Node(4, "d");
		Node e = new Node(5, "e");

		a.left = b;
		a.right = c;
		c.right = d;
		c.left = e;
		binaryTree.setRoot(a);
//遍历
		binaryTree.preOrder();
		System.out.println("----------------");
		binaryTree.infixOrder();
		System.out.println("----------------");
		binaryTree.postOrder();
//查找
		Node node = binaryTree.preOrderSearch(5);
		System.out.println(node);

		Node node1 = binaryTree.infixOrderSearch(5);
		System.out.println(node1);

		Node node2 = binaryTree.postOrderSearch(5);
			System.out.println(node2);

	}

}
//定义BinaryTree
class BinaryTree{
	private Node root;

	public void setRoot(Node root) {
		this.root = root;
	}

	//前序
	public void preOrder(){
		if (this.root != null){
			this.root.preOrder();
		}else{
			System.out.println("kong");
		}
	}
	//中序
	public void infixOrder(){
		if (this.root != null){
			this.root.infixOrder();
		}else{
			System.out.println("kong");
		}
	}
	//后序
	public void postOrder(){
		if (this.root != null){
			this.root.postOrder();
		}else{
			System.out.println("kong");
		}
	}

	//前序查找
	public Node preOrderSearch(int no){
		if (root != null){
			return root.preOrderSearch(no);
		}else {
			return null;
		}
	}

	//中序查找
	public Node infixOrderSearch(int no ){
		if (root != null){
			return root.infixOrderSearch(no);
		}else {
			return null;
		}
	}

	//后序查找
	public Node postOrderSearch(int no){
		if (root != null){
			return root.postOrderSearch(no);
		}else {
			return null;
		}
	}
	//删除结点
	public void delNode(int no){
		if(root != null){
			if (root.no == no){
				root = null;
			} else{
				root.delNode(no);
			}
		}else{
			System.out.println("空树，不能删除~");
		}
	}
}


//节点类
class Node {
	 int no;
	 String name;
	 Node left;
	 Node right;

	public Node(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node{" +
				"no=" + no +
				", name='" + name + '\'' +
				'}';
	}
//	前序 中左右
	public void preOrder(){
		System.out.println(this);//父节点
		if (this.left != null){
			this.left.preOrder();
		}
		if (this.right != null){
			this.right.preOrder();
		}
	}
//	中序 左中右
	public void infixOrder(){
		if (this.left != null){
			this.left.infixOrder();
		}
		System.out.println(this);
		if (this.right != null){
			this.right.infixOrder();
		}
	}
//	后序 左右中
	public void postOrder(){
		if (this.left != null){
			this.left.postOrder();
		}
		if (this.right != null){
			this.right.postOrder();
		}
		System.out.println(this);
	}

	//前序查找
	public Node preOrderSearch(int no){
		System.out.println("次数");
		if (this.no == no){
			return this;
		}
		Node resNode = null;//记录节点
		//左边递归查找
		if (this.left != null){
			resNode = this.left.preOrderSearch(no);
		}
		if (resNode != null){ //左子树找到了
			return resNode;
		}
		//右边递归查找
		if (this.right != null){
			resNode = this.right.preOrderSearch(no);
		}
		return resNode;
	}

	//中序查找
	public Node infixOrderSearch(int no ){
		Node resNode = null;
		if (this.left != null){
			resNode = this.left.infixOrderSearch(no);
		}
		if (resNode != null){
			return resNode;
		}
		System.out.println("次数");
		if (this.no == no){
			return this;
		}
		if (this.right != null){
			resNode = this.right.infixOrderSearch(no);
		}
		return resNode;
	}

	//后序查找
	public Node postOrderSearch(int no){
		Node resNode = null;
		if (this.left != null){
			resNode = this.left.postOrderSearch(no);
		}
		if (resNode != null){
			return resNode;
		}
		if (this.right != null){
			resNode = this.right.postOrderSearch(no);
		}
		if (resNode != null){
			return resNode;
		}
		System.out.println("次数");
		if (this.no == no){
			return this;
		}
		return resNode;
	}
	//递归删除结点

	//1.如果删除的节点是叶子节点，则删除该节点
	//2.如果删除的节点是非叶子节点，则删除该子树
	public void delNode(int no){
		if (this.left != null && this.left.no == no){
			this.left = null;
			return;
		}
		if (this.right != null && this.right.no == no){
			this.right = null;
			return;
		}
		if (this.left != null){
			this.left.delNode(no);
		}
		if (this.right != null){
			this.right.delNode(no);
		}
	}


}
