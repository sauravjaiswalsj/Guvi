#include<bits/stdc++.h>
int main(){
	int n;
	std::cin>>n;
	std::vector<int> list;
	for(int i=0;i<n;i++){
		int s;
		std::cin>>s;
		list.push_back(s);
	}
	std::sort(list.begin(),list.end());
	int count=0;
	std::unordered_map<int, int> countV;
	for(auto &i:list){
		countV.insert(i,{++count});
	}
	std::map<int, int>::iterator it;
	for(auto itr=countV.begin();itr!=countV.end();++itr){
		std::cout<<(*itr).first<<"\n";
	}
	return 0;
	//list.clear;
}
