   class Solution{
     public static int xor(int n) {
        if(n%4 ==1) return 1;
              else if(n%4 ==2) return n+1;
                 else if(n%4 ==3) return 0;
                    else return n;
                    
     }
    public static int findXOR(int l, int r) {
        // code here
        //1^2^3^4^5^6^7^8^1^2^3 = 4^5^6^7^8
        return xor (l-1)^xor(r);
    }
}


// time complexity ->o(1)