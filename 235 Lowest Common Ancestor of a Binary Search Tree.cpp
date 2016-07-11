/*
˼·�����ж�����Ƿ��зǷ����롣

1 ���ĳһ��root==p || root == q����ôLCA�϶���root����Ϊ��top down��LCA�϶���root�����������ϣ���root����p q����һ���ڵ��ˣ���ô����һ���ڵ�϶���root֮�£���ôroot����LCA������ô����root

2 ���root<min(p, q)����ôLCA�϶����������ϣ���ô�ݹ�

3 ���max(p, q)<root����ôLCA�϶����������ϣ���ô�ݹ�

4 ���p<root<q����ôroot�϶�ΪLCA

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