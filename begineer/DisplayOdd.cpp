#include<iostream>
int main(){
	int a,b;
	std::cin>>a>>b;
	for(int i=a+1;i<b;++i){
		if((i&1)==0){
			std::cout<<i<<" ";
		}
	}
	return 0;
}
