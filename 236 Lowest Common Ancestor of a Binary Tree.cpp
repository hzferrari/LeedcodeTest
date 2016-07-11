/*
如果是普通的二叉树，没有了二叉搜索树的特性。就要遍历；于是我们用到DFS遍历树
*/
#include <iostream>
#include <map>
#include <vector>
using namespace std;

struct TreeNode{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x) :val(x), left(NULL), right(NULL){}
};

class Solution{
public:
	TreeNode* lowestCommonAncestor(TreeNode *root, TreeNode *p, TreeNode *q) {
		if (root == NULL || root == p || root == q)
			return root;	//找到p或q节点，或者到达底层叶子节点时返回；
		TreeNode* Left = lowestCommonAncestor(root->left, p, q);
		TreeNode* Right = lowestCommonAncestor(root->right, p, q);

		if (Left != NULL && Right != NULL)
			return root;	//找到了父节点
		return Left != NULL ? Left : Right;	//若没找到，返回NULL
	}
};