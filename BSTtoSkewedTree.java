package com.greatlearning.Q2;
  
 import java.io.*;

 public class BSTtoSkewedTree {
	 
 }
	class Node
	{
		int val;
		Node left, right;
		
		Node(int item)
		{
			val = item;
			left = right = null;
		}
	}
	class GFG
	{
		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;

		static void BSTToSkewed(Node root,
									int order)
		{
		
			// Base Case
			if(root == null)
			{
				return;
			}

			if(order > 0)
			{
				BSTToSkewed(root.right, order);
			}
			else
			{
				BSTToSkewed(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
		
			if(headNode == null)
			{
				headNode = root;
				root.left = null;
				prevNode = root;
			}
			else
			{
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
		
			if (order > 0)
			{
				BSTToSkewed(leftNode, order);
			}
			else
			{
				BSTToSkewed(rightNode, order);
			}
		}

		static void traverseRightSkewed(Node root)
		{
			if(root == null)
			{
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);	
		}
        
		
		//Driver class
		
		
		public static void main (String[] args)
		{
		   GFG tree = new GFG();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left = new Node(55);
		
			int order = 0;
			BSTToSkewed(node, order);
			traverseRightSkewed(headNode);
		}
	}

