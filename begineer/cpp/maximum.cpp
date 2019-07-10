#include<iostream>
#include<algorithm>
#include<vector>
int main(){
	int n,t;
	std::cin>>n;
	std::vector<int> list;
	for(int i=0;i<n;i++){
		std::cin>>t;
		list.push_back(t);
	}
	std::cout<<*(std::max_element(list.begin(),list.end()));
	return 0;
}
