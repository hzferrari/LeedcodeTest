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
//	int BFS(TreeNode *root)	//root是结构体TreeNode的指针
//	{
//		if (!root) //如果root为非0值，！操作返回false
//			return 0;	//即root的值为0时，return 0。
//		else root->val = 1;
//		queue<TreeNode*> q;	//q是存储TreeNode指针的队列
//		q.push(root);
//		while (!q.empty())
//		{
//			TreeNode *curNode = q.front();	//返回q队列头部数据（左右都是TreeNode指针类型）
//			q.pop(); //队列头部数据出列
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