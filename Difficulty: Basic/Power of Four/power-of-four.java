// class Solution {
//     boolean isPowerTwo(long n){
//         return ((n & (n-1))==0);
//     }
//     boolean isSquare(long n) {
//         long root = (long)(Math.sqrt(n));
//         return (root*root ==n);
//     }
//     int isPowerOfFour(long n){
//         return(isPowerTwo(n) && isSquare(n)) ? 1 : 0 ;
//     } 
// }

// class Solution {
//     boolean isPowerTwo(long n){
//         return (n > 0) && ((n & (n-1)) == 0);   // n>0 check add kiya
//     }
//     boolean isSquare(long n) {
//         long root = (long)(Math.sqrt(n));
//         return (root*root == n);
//     }
//     int isPowerOfFour(long n){
//         return (isPowerTwo(n) && isSquare(n)) ? 1 : 0;
//     } 
// }


class Solution {
    boolean isPowerTwo(long n){
        return (n > 0) && ((n & (n-1)) == 0);
    }
    boolean isSquare(long n) {
        long root = (long)(Math.sqrt(n));
        return (root*root == n);
    }
    boolean isPowerOfFour(long n){
        return (isPowerTwo(n) && isSquare(n));
    }
}