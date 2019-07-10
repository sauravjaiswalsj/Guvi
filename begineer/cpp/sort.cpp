#include<iostream>
#include<vector>
void sort(std::vector<int> &list){
	for(int i=0;i<list.size();i++){
		for(int j=0;j<list.size()-i-1;++j){
			if(list.at(j)>list.at(j+1)){
				int temp=list.at(j);
				list.at(j)=list.at(j+1);
				list.at(j+1)=temp;
			}
		}
	}
}
int main(){
	int n;
	std::cin>>n;
	std::vector<int> list;
	int t;
	for(int i=0;i<n;++i){
		std::cin>>t;
		list.push_back(t);
	}
	sort(list);
	std::vector<int>::iterator it;
	for(auto it=list.begin();it!=list.end();++it){
		std::cout<<*it<<" ";
	}
}
