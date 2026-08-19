class Solution {
    public int celebrity(int arr[][]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n;i++){
            st.push(i);
        }
        while(st.size()>1)
        {
            int a = st.pop();
            int b = st.pop();
            boolean aflag =true , bflag =true;
            if(arr[a][b]==1) // a cele nhi hua
            {
                aflag =false;
            }
            else // [a][b]=0 cele hain
            {
                bflag = false;
            }
            if(arr[b][a]==1){ // b cele nhi hain
                bflag = false;
            }
            else{  // [b][a] =0 cele hain
                aflag = false;
            }
            if(aflag) st.push(a);
            if(bflag) st.push(b);
        }
        if(st.size()==0) return -1;
        int celeb = st.pop();
        for(int j =0; j<n;j++){
            if(j ==celeb) continue ;
            if(arr[celeb][j]==1) return -1;
        }
        for(int j =0; j<n;j++){
            if(j ==celeb) continue ;
            if(arr[j][celeb]==0) return -1;
        }
        return celeb ;
    }
}