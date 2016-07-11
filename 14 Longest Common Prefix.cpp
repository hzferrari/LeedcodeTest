#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
	string longestCommonPrefix(vector<string> &strs) {
		int nvec = strs.size();
		if (nvec<1) return "";
		if (nvec<2) return strs[0];
		int nmin = strs[0].length(), len = 0;
		bool flag = true;
		for (int i = 1; i<nvec; i++){
			if (nmin>strs[i].length())   
				nmin = strs[i].length();
		}
		while (len<nmin){
			for (int i = 1; i<nvec&&flag; i++){
				cout << strs[i][len] << endl;
				if (strs[i][len] == strs[0][len])  
					continue;
				flag = false;
			}
			if (!flag)   break;
			len++;
		}
		return strs[0].substr(0, len);
	}
};

int main()
{
	vector<string> strs = { "289", "25324", "22434", "232", "234" };
	Solution sol;
	cout << sol.longestCommonPrefix(strs) << endl;
	return 0;
}
