// code using recursion 

class Solution{
        public int fibo(int n){
            // code here
            if(n<=1) return n;
            return fibo(n-1) + fibo(n-2);
        }
        public int nthFibonacci(int n){
            return fibo(n);
        }
        
    }