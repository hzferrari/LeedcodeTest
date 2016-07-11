//#include <iostream>
//#include <string>
//using namespace std;
//
///*看错题目，这个是求是否倒序了
//class Solution {
//public:
//	bool isAnagram(string s, string t) {
//		string s2=s;
//		for (string::size_type i = 0; i != s.size(); ++i)
//			s2[i] = s[s.size() - 1 - i];
//		if (s2 == t)
//			return true;
//		else
//			return false;
//	}
//};
//*/
//
////下面这个手动排序的方法超时了，去百度别人的方法
//class Solution {
//public:
//	bool isAnagram(string s, string t) {
//
//		/*指针冒泡法
//		char* cp=&s[0];
//		int flag;
//		for (string::size_type i = 0; i != s.size(); ++i){
//			flag =0;
//			for (string::size_type j = i + 1; j != s.size(); ++j){
//				if (s[j] < s[i]){
//					cp = &s[j];
//					flag = 1;
//				}
//			}
//			if (flag == 1){
//				tmp = s[i];
//				s[i] = *cp;
//				*cp = tmp;
//			}
//		}
//		cout << s << endl;	*/
//		
//		char tmp;
//		for (string::size_type i = 0; i != s.size(); ++i)
//			for (string::size_type j = i + 1; j != s.size(); ++j){
//				if (s[j] < s[i]){
//					tmp = s[j];
//					s[j] = s[i];
//					s[i] = tmp;
//				}			
//		}
//		//普通冒泡法
//		for (string::size_type i = 0; i != t.size(); ++i)
//		for (string::size_type j = i + 1; j != t.size(); ++j){
//			if (t[j] < t[i]){
//				tmp = t[j];
//				t[j] = t[i];
//				t[i] = tmp;
//			}
//		}
//		if (s == t)
//			return true;
//		else return false;
//
//	}
//};
//
//int main()
//{
//	string str1("cba");
//	string str2("bac");
//
//	Solution a;
//	if (a.isAnagram(str1, str2))
//		cout << "true" << endl;
//	else cout << "false" << endl;
//
//	return 0;
//
//}