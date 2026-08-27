class Solution {
   public ArrayList<Integer> nextLargerElement(int[] arr) {
   
               int n = arr.length;
               int[] nge = new int[n];
   
               nge[n - 1] = -1;
   
               Stack<Integer> st = new Stack<>();
               st.push(arr[n - 1]);
   
               for (int i = n - 2; i >= 0; i--) {
   
                   while (st.size() > 0 && arr[i] >= st.peek())
                       st.pop();
   
                   if (st.size() == 0)
                       nge[i] = -1;
                   else
                       nge[i] = st.peek();
   
                   st.push(arr[i]);
               }
   
               ArrayList<Integer> ans = new ArrayList<>(n);
   
               for (int i = 0; i < n; i++) {
                   ans.add(nge[i]);
               }
   
               return ans;
           }
   
           // MAIN METHOD FOR TESTING
           public static void main(String[] args) {
   
               Solution obj = new Solution();
   
               int[] arr = {6, 8, 0, 1, 3};
   
               ArrayList<Integer> result = obj.nextLargerElement(arr);
   
               System.out.println(result);
           }
}