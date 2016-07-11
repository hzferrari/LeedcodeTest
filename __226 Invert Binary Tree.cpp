#include <iostream>
#include <queue>
using namespace std;

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x) :val(x), left(NULL), right(NULL){}
};

//class Solution {
//public:
//	TreeNode* invertTree(TreeNode* root) {
//		if (root == NULL)
//			return NULL;
//		TreeNode *leftTree = NULL;
//		TreeNode *rightTree = NULL;
//		if (root->left)
//			leftTree = invertTree(root->left);
//		if (root->right)
//			rightTree = invertTree(root->right);
//		root->left = rightTree;
//		root->right = leftTree;
//		return root;
//	}
//};
//class Solution {
//public:
//	TreeNode* invertTree(TreeNode* root) {
//		queue<TreeNode*> tbpNode;
//		if (root)
//			tbpNode.push(root);
//		TreeNode *curNode, *temp;
//		while (!tbpNode.empty())
//		{
//			curNode = tbpNode.front();
//			tbpNode.pop();
//			temp = curNode->left;
//			curNode->left = curNode->right;
//			curNode->right = temp;
//			if (curNode->left)
//				tbpNode.push(curNode->left);
//			if (curNode->right)
//				tbpNode.push(curNode->right);
//		}
//		return root;
//	}
//};