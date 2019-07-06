#include<bits/stdc++.h>
class Amstrong{
	public:
		void AmstrongNum(int a,int b){
			int c=0,sum=0;
			for(int i=a+1;i<b;i++){
				int x=i;
				while(x!=0){
					c++;
					x/=10;
				}
				x=i;
				while(x!=0){
					int r=x%10;
					sum=sum+(pow(r,c));
					x/=10;
				}
				if(sum == i){
					std::cout<<sum<<" ";
				}
			}

		}
};
int main(){
	int a,b;
	std::cin>>a>>b;
	Amstrong get;
	get.AmstrongNum(a,b);
	return 0;
}
