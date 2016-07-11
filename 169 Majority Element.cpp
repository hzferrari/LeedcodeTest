#include <iostream>
#include <map>
#include <vector>
using namespace std;

class Solution{
public:
	int majorityElement(vector<int> &nums){
		map<int, int> int_map;
		for (int i = 0; i != nums.size(); ++i){
			map<int, int>::iterator it = int_map.find(nums[i]);
			if (it == int_map.end())
				int_map[nums[i]] = 1;	//map里面没有时，创建新元素，键值为nums[i]，值为1
			else
				int_map[nums[i]]++;		//map里面存在时，键值为nums[i]的值+1
			if (int_map[nums[i]] > nums.size() / 2)
				return nums[i];
		}
		return false;
	}
};
/* 更快捷的方法
class Solution {
public:
	int majorityElement(vector<int>& nums) {
		int candidate = 0;
		int count = 0;
		for (int i = 0; i < nums.size(); i++)
		{
			if (count == 0)
			{
				candidate = nums[i];
				count = 1;
			}
			else
			{
				if (nums[i] == candidate)
					count++;
				else
					count--;
			}
		}
		return candidate;
	}
};
*/
//int main()
//{
//	vector<int> a;
//	for (vector<int>::size_type i = 0; i != 3; ++i){
//		if (i < 10)
//			a.push_back(i);
//		else
//			a.push_back(9);
//	}
//	for (vector<int>::iterator j = a.begin(); j != a.end(); ++j)
//		cout << *j;
//	cout << endl;
//	cout <<"size/2= "<< a.size()/2 << endl;
//	Solution B;
//	cout<<B.majorityElement(a)<<endl;
//	return 0;
//}

