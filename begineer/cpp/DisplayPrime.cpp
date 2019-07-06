#include<iostream>
class prime{
        public:
                bool DisplayPrime(int n){
                        for(int i=2;i<=n/2;++i){
				if(n%i==0){
                                        return false;
                                }
                        }
                        return true;
                }
};

int main(){
	int a,b;
	std::cin>>a>>b;
	prime *get =new prime;
	for(int i=a+1;i<b;++i){
		if(i%2!=0 && i>2){
			if(get->DisplayPrime(i)){
			std::cout<<i<<" ";
			}
		}
	}
	delete get;
	return 0;
}
	
