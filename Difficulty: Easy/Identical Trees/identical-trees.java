

class Solution {
    public boolean isIdentical(Node p, Node q) {
    if(p==null && q==null) return true;
    if(p==null || q ==null) return false;
    if(p.data != q.data) return false;
    if(!isIdentical(p.left,q.left)) return false;
     if(!isIdentical(p.right,q.right)) return false;
    return true;
        
    }
}