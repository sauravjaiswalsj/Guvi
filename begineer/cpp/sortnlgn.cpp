#include<bits/stdc++.h>
int main(){
	        int n;
        std::cin>>n;
        std::vector<int> list;
        int t;
        for(int i=0;i<n;++i){
                std::cin>>t;
                list.push_back(t);
        }
	std::sort(list.begin(),list.end());
        std::vector<int>::iterator it;
        for(auto it=list.begin();it!=list.end();++it){
                std::cout<<*it<<" ";
        }
}

