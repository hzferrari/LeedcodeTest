/*
�������ͨ�Ķ�������û���˶��������������ԡ���Ҫ���������������õ�DFS������
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
			return root;	//�ҵ�p��q�ڵ㣬���ߵ���ײ�Ҷ�ӽڵ�ʱ���أ�
		TreeNode* Left = lowestCommonAncestor(root->left, p, q);
		TreeNode* Right = lowestCommonAncestor(root->right, p, q);

		if (Left != NULL && Right != NULL)
			return root;	//�ҵ��˸��ڵ�
		return Left != NULL ? Left : Right;	//��û�ҵ�������NULL
	}
};