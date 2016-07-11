#include <iostream>
#include <string>
#include <vector>
using namespace std;

/*���ں���atoi��
	char *s = "123"; ������char* ������string
	cout << atoi(s) << endl;
	*s = "123"�� ���123
	*s = "123.4"�� ���123
	*s = "123a"�� ���123
	*s = "12a3"�� ���12
	*s = "a123"�� ���0
	*s = "-12a3"�� ���-12
	*s = "+12a3";  ���12
	*s = "12 3"�� ���12
	*s = "   12 3"�� ���12
	*s = "023"�� ���23

	*s = "  +0 123"�� ���0

	*s = "12345678900"�� �����ˣ����INT_MAX (2147483647) 
	*s = "-12345678900"�� �����ˣ����INT_MIN (-2147483648)
*/
// ������Ҫ���ǵ�����ܶ࣬�������������ڣ�������������Ҫ����ͨ��

//http://blog.csdn.net/fly_yr/article/details/45312667 �ķ�������

class Solution {
public:
	int myAtoi(string str) {
		long long int_num=0;	//long�����У���Ҫlong long����64λ��
		int polarflag = 0;	//�Ƿ����ж����Եı�־,������--��++��+-���������ſ�ͷ�����(��Щ���Ӧ����0)
		int flag = 0;	//�ж��Ƿ��Ѿ����ǿո�ͷ�ı�־�����s = "  +0 123"���ж�����
		bool isNega=false;
		for (int i = 0; i != str.size(); ++i){

			if (str[i] == 32 && flag==0 && polarflag==0)		//�ո��ACSII��ֵΪ32
				continue;
			if (str[i] == 45 && polarflag == 0){		//-��ACSII��ֵΪ45
				isNega = true; 
				polarflag = 1;
				continue;
			}

			if (str[i] == 43 && polarflag == 0){		//+��ACSII��ֵΪ43
				isNega = false;						//+�����ҲҪ���ǡ���
				polarflag = 1;
				continue;
			}

			if (str[i] > 47 && str[i] < 58)		//0-9��ACSII��ֵΪ47-58	
			{														//��ʵ����ֱ���� if(str[j]>='0' && str[j]<='9')  
				int_num = int_num * 10 + (int)str[i] - 48;
				if (!isNega && int_num>INT_MAX){
					int_num = INT_MAX;
					break;
				}
				if (isNega && int_num> 2147483648){	//����ֱ�������ֶ�����INT_MIN�ˣ���Ϊabs(INT_MIN)����INT_MIN+1�������
					int_num = 2147483648;
					break;
				}
				flag = 1;
			}
			else break;
		}
		if (isNega)
			return (int)-int_num;
		else return (int)int_num;	
	}
};


//int main()
//{
//	char *s = "+-2";
//	cout << atoi(s) << endl;
//
//	//string s1("012");
//	//cout << (int)s1[1] << endl;
//
//	string s2(" - 3");
//	Solution a;
//	cout << a.myAtoi(s2) << endl;
//	
//
//	return 0;
//}
