/*
思路，先判断入口是否有非法输入。

1 如果某一个root==p || root == q，那么LCA肯定是root（因为是top down，LCA肯定在root所囊括的树上，而root又是p q其中一个节点了，那么另外一个节点肯定在root之下，那么root就是LCA），那么返回root

2 如果root<min(p, q)，那么LCA肯定在右子树上，那么递归

3 如果max(p, q)<root，那么LCA肯定在左子树上，那么递归

4 如果p<root<q，那么root肯定为LCA

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
	TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q){
		if (!root || !p || !q)
			return NULL;
		if (root->val < p->val && root->val < q->val)
			return lowestCommonAncestor(root->right, p, q);
		if (root->val > p->val && root->val > q->val)
			return lowestCommonAncestor(root->left, p, q);

		return root;
	}
};