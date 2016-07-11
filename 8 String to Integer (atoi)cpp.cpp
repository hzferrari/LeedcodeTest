#include <iostream>
#include <string>
#include <vector>
using namespace std;

/*关于函数atoi：
	char *s = "123"; 类型是char* 不能用string
	cout << atoi(s) << endl;
	*s = "123"； 输出123
	*s = "123.4"； 输出123
	*s = "123a"； 输出123
	*s = "12a3"； 输出12
	*s = "a123"； 输出0
	*s = "-12a3"； 输出-12
	*s = "+12a3";  输出12
	*s = "12 3"； 输出12
	*s = "   12 3"； 输出12
	*s = "023"； 输出23

	*s = "  +0 123"； 输出0

	*s = "12345678900"； 过界了，输出INT_MAX (2147483647) 
	*s = "-12345678900"； 过界了，输出INT_MIN (-2147483648)
*/
// 这套题要考虑的情况很多，包括（但不限于）上面各种情况都要测试通过

//http://blog.csdn.net/fly_yr/article/details/45312667 的方法更好

class Solution {
public:
	int myAtoi(string str) {
		long long int_num=0;	//long还不行，需要long long才是64位的
		int polarflag = 0;	//是否已判定极性的标志,过滤以--，++，+-等两个符号开头的情况(这些情况应返回0)
		int flag = 0;	//判断是否已经不是空格开头的标志，解决s = "  +0 123"的判断问题
		bool isNega=false;
		for (int i = 0; i != str.size(); ++i){

			if (str[i] == 32 && flag==0 && polarflag==0)		//空格的ACSII码值为32
				continue;
			if (str[i] == 45 && polarflag == 0){		//-的ACSII码值为45
				isNega = true; 
				polarflag = 1;
				continue;
			}

			if (str[i] == 43 && polarflag == 0){		//+的ACSII码值为43
				isNega = false;						//+的情况也要考虑。。
				polarflag = 1;
				continue;
			}

			if (str[i] > 47 && str[i] < 58)		//0-9的ACSII码值为47-58	
			{														//其实可以直接用 if(str[j]>='0' && str[j]<='9')  
				int_num = int_num * 10 + (int)str[i] - 48;
				if (!isNega && int_num>INT_MAX){
					int_num = INT_MAX;
					break;
				}
				if (isNega && int_num> 2147483648){	//这里直接用数字而不用INT_MIN了，因为abs(INT_MIN)或者INT_MIN+1都会溢出
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
