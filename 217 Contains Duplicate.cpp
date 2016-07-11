//#include <iostream>
//#include <vector>
//#include <set>
//using namespace std;
//
//class Solution {
//public:
//	bool containsDuplicate(vector<int>& nums) {
//		set<int> s;
//		for (int i = 0; i != nums.size(); ++i){
//			if (s.find(nums[i]) == s.end())
//				s.insert(nums[i]);
//			else
//				return true;
//		}
//	}
//};
//int main()
//{
//	vector<int> ivec;
//	for (vector<int>::size_type ix = 0; ix <= 10; ++ix)
//		ivec.push_back(ix);
//	//ivec.push_back(9);
//	for (vector<int>::iterator iter = ivec.begin(); iter != ivec.end(); ++iter)
//		cout << *iter << endl;
//	Solution a;
//	if (a.containsDuplicate(ivec))
//		cout << true<<endl;
//
//	return 0;
//}