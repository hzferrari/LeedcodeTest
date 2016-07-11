#include <iostream>
#include <queue>
using namespace std;

/*我的方法
class Solution{
public:
	int hammingWeight(int n){
		int a, num=0;
		while (n != 0){
			if( n % 2==1)
				++num;
			n = n / 2;
		}
		return num;
	}
}；
*/

class Solution{
public:
	int hammingWeight(unsigned int n) {
		int count = 0;
		while (n > 0) {
			bool a = n & 1;	//&是“位与”，系统自动将 n转换成2进制后的最后一位 与 1 进行比较
			if (a) {
				count++; 
			}
			n = n >> 1;	//n所有比特右移1位，最左边补0
		}
		return count;
	}
};
//int main()
//{
//	Solution a;
//	cout << a.hammingWeight(10) << endl;
//	return 0;
//}