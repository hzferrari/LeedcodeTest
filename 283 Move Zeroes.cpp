//#include <iostream>
//#include <vector>
//using namespace std;
//
//class Solution{
//public:
//	void moveZeros(vector<int> &nums){
//		int numsize = nums.size();
//		int pos = 0;
//		for (int i = 0; i < numsize;++i){
//			if (nums[i] != 0){
//				nums[pos] = nums[i];
//				++pos;
//			}
//		}
//		for (; pos < numsize; ++pos){
//			nums[pos] = 0;
//		}
//	}
//};
//
//int main()
//{
//	vector<int> vec;
//	int text;
//	while (cin >> text)
//		vec.push_back(text);
//	for (vector<int>::iterator iter = vec.begin(); iter != vec.end(); ++iter)
//	{
//		cout << *iter << " ";
//	}	
//	cout<<endl;
//
//	moveZeros(vec);// 函数是在class里定义，故不能这样直接调用
//	Solution a; //通过类进行成员函数的调用
//	a.moveZeros(vec);
//	for (vector<int>::iterator iter = vec.begin(); iter != vec.end(); ++iter)
//	{
//		cout << *iter << " ";	
//	}
//	cout << endl;
//	return 0;
//}
