package mytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.RootPaneContainer;

public class BTree<T extends Comparable<T>> {
	BTree<T> rightNode;
	BTree<T> leftNode;
	public T data;

	// 用于构建结点
	public BTree(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	// 初始化空树
	public BTree() {
		// TODO Auto-generated constructor stub
	}

	// 寻找更好的方法????
	public void createBTreesec(@SuppressWarnings("unchecked") T... ts) {
		if (ts == null) {
			return;
		}
		ArrayList<BTree<T>> temp = new ArrayList<>();
		this.data = ts[0];
		temp.add(this);
		int l = ts.length;
		int length = l / 2;

		for (int i = 0; i < length; i++) {
			BTree<T> nodeTemp = new BTree<T>(ts[i * 2 + 1]);
			temp.get(i).leftNode = nodeTemp;
			if (i * 2 + 1 < length)
				temp.add(nodeTemp);
			if (i * 2 + 2 < l) {
				nodeTemp = new BTree<T>(ts[i * 2 + 2]);
				temp.get(i).rightNode = nodeTemp;
				if (i * 2 + 2 < length)
					temp.add(nodeTemp);
			}
		}

	}

	// 建立树
	public void createBTree(@SuppressWarnings("unchecked") T... ts) {
		this.data = ts[0];
		int length = ts.length;
//		@SuppressWarnings("unchecked")
//		BTree<T> temp[] = new BTree[length];
//		for (int i = 0; i < length; i++) {
//			temp[i] = new BTree<T>(ts[i]);
//		}
//		
//		
//		for (int i = 0; i < length; i++) {
////			temp.get(i).leftNode = temp.get(i * 2 + 1);
//			temp[i].leftNode = temp[i * 2 + 1];
//			if (i * 2 + 2 < length)
////			temp.get(i).rightNode = temp.get(i * 2 + 2);
//			temp[i].rightNode = temp[i * 2 + 2];
//		}
//		
//		this.leftNode = temp[0].leftNode;
//		this.rightNode = temp[0].rightNode;

		ArrayList<BTree<T>> temp = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			temp.add(new BTree<T>(ts[i]));
		}

		for (int i = 0; i < length / 2; i++) {
			temp.get(i).leftNode = temp.get(i * 2 + 1);
			if (i * 2 + 2 < length)
				temp.get(i).rightNode = temp.get(i * 2 + 2);
		}

		this.leftNode = temp.get(0).leftNode;
		this.rightNode = temp.get(0).rightNode;

	}

	// 清空树
	public void clearBTree() {
		data = null;
		leftNode = null;
		rightNode = null;
	}

	public BTree<T> getLeftNode() {
		return leftNode;
	}

	// 插入结点
	// p是指向该树中的某个结点（如何判断）， LoR为0左或1右的插入， 插入结点node非空且右子树为空
	// p指向结点的原有左或右结点则成为node的右结点。
	public void insertChild(BTree<T> p, boolean LoR, BTree<T> node) {
		if (LoR) {
			node.rightNode = p.rightNode;
			p.rightNode = node;
		} else {
			node.rightNode = p.leftNode;
			p.leftNode = node;
		}
	}

	// 删除结点
	// p是指向该树中的某个结点（如何判断）
	public void deleteChild(BTree<T> p, boolean LoR) {
		if (LoR) {
			p.rightNode = null;
		} else {
			p.leftNode = null;
		}
	}

	// 先序遍历
	public void preOrderTraverse() {
		System.out.println(data);
		if (leftNode != null)
			leftNode.preOrderTraverse();
		if (rightNode != null)
			rightNode.preOrderTraverse();
	}

	// 中序遍历
	public void inOrderTraverse() {
		if (leftNode != null)
			leftNode.inOrderTraverse();
		System.out.println(data);
		if (rightNode != null)
			rightNode.inOrderTraverse();
	}

	// 后序遍历
	public void postOrderTraverse() {
		if (leftNode != null)
			leftNode.postOrderTraverse();
		if (rightNode != null)
			rightNode.postOrderTraverse();
		System.out.println(data);
	}

	// 层序遍历 ???
	public void levelOrderTraverse() {

	}
}
