#include <iostream>
#include <queue>
using namespace std;

/*�ҵķ���
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
}��
*/

class Solution{
public:
	int hammingWeight(unsigned int n) {
		int count = 0;
		while (n > 0) {
			bool a = n & 1;	//&�ǡ�λ�롱��ϵͳ�Զ��� nת����2���ƺ�����һλ �� 1 ���бȽ�
			if (a) {
				count++; 
			}
			n = n >> 1;	//n���б�������1λ������߲�0
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