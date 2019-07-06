#include<iostream>
class prime{
        public:
                bool DisplayPrime(int n){
                        for(int i=2;i<n;++i){
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
		if(get->DisplayPrime(i)){
			std::cout<<i<<" ";
		}
	}
	delete get;
	return 0;
}
	
