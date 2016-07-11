#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


class Solution {
public:
	void nextPermutation(vector<int>& nums) {
		if (nums.size() <= 1)  return;
		int i = 0;
		for (i = nums.size() - 1; i>0; i--){
			if (nums[i]>nums[i - 1]){
				int j = nums.size() - 1;
				while (nums[j] <= nums[i - 1]) j--;
				swap(nums[i - 1], nums[j]);
				sort(nums.begin() + i, nums.end());
				return;
			}
		}
		if (i == 0){
			reverse(nums.begin(), nums.end());
			return;
		}
	}
};

//int main(){
//	solution a;
//	vector<int> nums = { 1, 2, 7, 6, 4, 8, 5, 3 };
//	a.nextpermutation(nums);
//	return 0;
//}