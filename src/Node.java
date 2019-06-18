

public class Node{
		private int value;
		private Node parent;
		private Node left;
		private Node right;
		public int getValue() {
			return value;
		}
		public Node(int value, Node parent, Node left, Node right) {
			super();
			this.value = value;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		public Node(int value, Node parent) {
			super();
			this.value = value;
			this.parent = parent;
			this.left = null;
			this.right = null;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		
	}
