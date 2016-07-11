//#include <iostream>
//#include <queue>
//using namespace std;
//
//struct TreeNode{
//	int val;
//	TreeNode *left;
//	TreeNode *right;
//	TreeNode(int x) :val(x), left(NULL), right(NULL){}
//};
//
//class Solution{
//public:
//	int BFS(TreeNode *root)	//root�ǽṹ��TreeNode��ָ��
//	{
//		if (!root) //���rootΪ��0ֵ������������false
//			return 0;	//��root��ֵΪ0ʱ��return 0��
//		else root->val = 1;
//		queue<TreeNode*> q;	//q�Ǵ洢TreeNodeָ��Ķ���
//		q.push(root);
//		while (!q.empty())
//		{
//			TreeNode *curNode = q.front();	//����q����ͷ�����ݣ����Ҷ���TreeNodeָ�����ͣ�
//			q.pop(); //����ͷ�����ݳ���
//			if (q.empty() && !curNode->left && !curNode->right)
//				return curNode->val;
//			if (curNode->left)
//			{
//				curNode->left->val = curNode->val + 1;
//				q.push(curNode->left);
//			}
//			if (curNode->right)
//			{
//				curNode->right->val = curNode->val + 1;
//				q.push(curNode->right);
//			}
//		}
//	}
//	int maxDepth(TreeNode *root)
//	{
//		return BFS(root);
//	}
//};