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
//	moveZeros(vec);// ��������class�ﶨ�壬�ʲ�������ֱ�ӵ���
//	Solution a; //ͨ������г�Ա�����ĵ���
//	a.moveZeros(vec);
//	for (vector<int>::iterator iter = vec.begin(); iter != vec.end(); ++iter)
//	{
//		cout << *iter << " ";	
//	}
//	cout << endl;
//	return 0;
//}
