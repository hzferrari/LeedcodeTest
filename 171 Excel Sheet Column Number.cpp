#include <iostream>
#include <vector>
#include <string>
#include <math.h>
using namespace std;

/*相反的从数字到字母的对应法
class Solution {
public:
	string convertToTitle(int n) {
		string ret = "";
		while (n)
		{
			ret = (char)((n - 1) % 26 + 'A') + ret;
			n = (n - 1) / 26;
		}
		return ret;
	}
};
*/

//class Solution {
//public:
//	int titleToNumber(string s){
//		int x,y,ret=0;
//		//int s_size = s.size();
//		for (int j = 0; j != s.size();++j)
//		{
//			x = pow(26, (s.size() - j - 1));
//			y=int(s[j]) - (65 - 1);
//			ret = x*y+ret;
//		}
//		return ret;
//	}
//};
//int main()
//{
//	Solution a;
//	//cout << a.convertToTitle(28) << endl;
//	cout << a.titleToNumber("BC") << endl;
//	return 0;
//}