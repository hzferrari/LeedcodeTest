#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


class solution{
public:
	void sort(int* nums,int length) {
		//if (sizeof(nums) == 0){
		//	return;
		//}
		//int* res = new int[length];
		//int priv = 0;
		//int minOdd = 0;
		//int maxEven = 0;
		//for (int i = 0; i < length; ++i){
		//	int j = 1;
		//	if (nums[i] % 2 != 0){	//ÆæÊý
		//		if (nums[i] < minOdd){
		//			minOdd = nums[i];
		//			res[i] = nums[i];
		//		}
		//	}
		//	else{

		//	}
		//}

		int *p1, *p2, tmp;
		p1 = nums;
		p2 = nums + length - 1;
		while (p1<p2)
		{
			if ((*p1 & 1)) //ÆæÊý  
			{
				p1++;
				continue;
			}
			if (((*p2 & 1) == 0))
			{
				p2--;
				continue;
			}
			tmp = *p1;
			*p1 = *p2;
			*p2 = tmp;
		}
//private:
//	void sort_int(nums)
//		
	}
};

//int main(){
//	solution a;
//	int nums[8] = { 1, 2, 7,6 };
//	a.sort(nums, 8);
//	return 0;
//}

