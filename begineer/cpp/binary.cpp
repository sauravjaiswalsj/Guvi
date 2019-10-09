#include<iostream>
long long binary(int n){
	long long sum=0;
	int i=1;
	while(n!=0){
		int r=n%2;
		sum+=(long long)(r*i);
		n/=2;
		i*=10;
	}
	return sum;
}


int main(){
	int n;
	std::cin>>n;
	std::cout<<binary(n);
	return 0;
}
