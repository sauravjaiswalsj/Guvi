#include<iostream>
#include<algorithm>
int main(){
	int n;
	std::cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		std::cin>>arr[i];
	}
	std::cout<<*(std::min_element(arr,arr+n));
	return 0;
}
