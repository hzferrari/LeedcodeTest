#include <iostream>
#include <string>
#include <vector>
using namespace std;

//http://blog.csdn.net/feliciafay/article/details/17109135
/*
32位int上界为2147483647(2^31-1), 下界为-2147483648(-2^31)
*/
class Solution {
public:
	int reverse(int x) {

		if (isoverflow(x))	//测试溢出，如果溢出则返回0
			return 0;	

		bool pos = x > 0;	//还可以直接这样定义布尔值！！
		x = abs(x);
		int result = 0;
		while (x >= 1){
			result = result * 10 + x % 10;	//从个位开始处理
			x = x / 10;		//逐渐去掉最后一位
		}
		
		if (pos)
			return result;
		else return -result;
	}
private:						//http://blog.csdn.net/stephen_wong/article/details/28779481
	bool isoverflow(int x){		
		if (x / 1000000000 == 0)	//98/100==0, 即测试x位数是否超过9位，没超过就不越界
			return false;
		else if (x == INT_MIN)	//特殊边界情况：x=-2147483648时，取x=abs（x）时会溢出
			return true;	
		x = abs(x);

		for (int cmp = 463847412; cmp != 0; cmp /= 10, x /= 10){
			if (x % 10 > cmp % 10)
				return true;
			else if (x % 10 < cmp % 10)
				return false;
		}	
		return false;
	}
};

//int main()
//{
//	int x = 1463847412;
//	int y = INT_MIN;
//	Solution a;
//	cout <<  a.reverse(x)<< endl;
//	cout << y << endl;
//	return 0;
//}