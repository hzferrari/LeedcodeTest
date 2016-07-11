#include <iostream>
#include <string>
#include <vector>
using namespace std;

//http://blog.csdn.net/feliciafay/article/details/17109135
/*
32λint�Ͻ�Ϊ2147483647(2^31-1), �½�Ϊ-2147483648(-2^31)
*/
class Solution {
public:
	int reverse(int x) {

		if (isoverflow(x))	//����������������򷵻�0
			return 0;	

		bool pos = x > 0;	//������ֱ���������岼��ֵ����
		x = abs(x);
		int result = 0;
		while (x >= 1){
			result = result * 10 + x % 10;	//�Ӹ�λ��ʼ����
			x = x / 10;		//��ȥ�����һλ
		}
		
		if (pos)
			return result;
		else return -result;
	}
private:						//http://blog.csdn.net/stephen_wong/article/details/28779481
	bool isoverflow(int x){		
		if (x / 1000000000 == 0)	//98/100==0, ������xλ���Ƿ񳬹�9λ��û�����Ͳ�Խ��
			return false;
		else if (x == INT_MIN)	//����߽������x=-2147483648ʱ��ȡx=abs��x��ʱ�����
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