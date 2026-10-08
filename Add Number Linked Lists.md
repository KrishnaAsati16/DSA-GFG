## 01. Add Number Linked Lists

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1)

### Problem Description

**Task:** You are given the head of two singly linked lists head1 and head2 representing two non-negative integers. You need to return the head of the linked list representing the sum of these two numbers.Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.Examples:Input: Output: 1 - > 1 - > 2 - > 2

#### Examples

##### Example 1

- **Explanation:** Given numbers are 123 and 999. There sum is 1122. Input: Output: 7 - > 0 Explanation: Given numbers are 63 and 7. There sum is 70.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n + m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-08 22:20:31
- **Status:** Correct
- **Marks:** 4

```java
/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

//  class Solution {
//         public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//             ListNode dummy = new ListNode(0);
//             ListNode curr = dummy;
//             int carry = 0;

//             while (l1 != null || l2 != null || carry != 0) {
//                 int sum = carry;

//                 if (l1 != null) {
//                     sum += l1.val;
//                     l1 = l1.next;
//                 }

// //                 if (l2 != null) {
// //                     sum += l2.val;
// //                     l2 = l2.next;
// //                 }

// //                 carry = sum / 10;
// //                 curr.next = new ListNode(sum % 10);
// //                 curr = curr.next;
// //             }

// //             return dummy.next;
// //         }
// //   }
// //
  
//   // -----------------------------------------------------------------------------------
// //   class Solution {
//     //   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//     //       ListNode dummy = new ListNode(0);
//     //       ListNode curr = dummy;
//     //       int carry = 0;

//     //       while (l1 != null || l2 != null || carry != 0) {

//     //           int sum = carry;

//     //           if (l1 != null) {
//     //               sum += l1.val;
//     //               l1 = l1.next;
//     //           }

//     //           if (l2 != null) {
//     //               sum += l2.val;
//     //               l2 = l2.next;
//     //           }

//     //           carry = sum / 10;

//     //           curr.next = new ListNode(sum % 10);
//     //           curr = curr.next;
//     //       }

//     //       return dummy.next;
//     //   }
// //   }




// // class ListNode {
// //     int val;
// //     ListNode next;

// //     ListNode(int val) {
// //         this.val = val;
// //         this.next = null;
// //     }
// // }

// // class Solution {

// //     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

// //         ListNode dummy = new ListNode(0);
// //         ListNode curr = dummy;
// //         int carry = 0;

// //         while (l1 != null || l2 != null || carry != 0) {

// //             int sum = carry;

// //             if (l1 != null) {
// //                 sum += l1.val;
// //                 l1 = l1.next;
// //             }

// //             if (l2 != null) {
// //                 sum += l2.val;
// //                 l2 = l2.next;
// //             }

// //             carry = sum / 10;

// //             curr.next = new ListNode(sum % 10);
// //             curr = curr.next;
// //         }

// //         return dummy.next;
// //     }
// // }




// // class Solution {

// //     static Node addTwoLists(Node num1, Node num2) {

// //         Node dummy = new Node(0);
// //         Node curr = dummy;

// //         int carry = 0;

// //         while (num1 != null || num2 != null || carry != 0) {

// //             int sum = carry;

// //             if (num1 != null) {
// //                 sum += num1.data;
// //                 num1 = num1.next;
// //             }

// //             if (num2 != null) {
// //                 sum += num2.data;
// //                 num2 = num2.next;
// //             }

// //             carry = sum / 10;

// //             curr.next = new Node(sum % 10);
// //             curr = curr.next;
// //         }

// //         return dummy.next;
// //     }
// // }

// // wrong answer  -----------------------------------------------

// class Solution {

//     Node reverse(Node head) {
//         Node prev = null;
//         Node curr = head;

//         while (curr != null) {
//             Node next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         return prev;
//     }

    // Node removeLeadingZeros(Node head) {
//         while (head != null && head.data == 0) {
//             head = head.next;
//         }

//         return head;
//     }

//     static Node addTwoLists(Node num1, Node num2) {

//         Solution obj = new Solution();

//         // Remove leading zeros
//         num1 = obj.removeLeadingZeros(num1);
//         num2 = obj.removeLeadingZeros(num2);

//         // Reverse both lists
//         num1 = obj.reverse(num1);
//         num2 = obj.reverse(num2);

//         Node dummy = new Node(0);
//         Node curr = dummy;

//         int carry = 0;

//         while (num1 != null || num2 != null || carry != 0) {

//             int sum = carry;

//             if (num1 != null) {
//                 sum += num1.data;
//                 num1 = num1.next;
//             }

//             if (num2 != null) {
//                 sum += num2.data;
//                 num2 = num2.next;
//             }

//             carry = sum / 10;

//             curr.next = new Node(sum % 10);
//             curr = curr.next;
//         }

//         // Reverse answer to get original order
//         return obj.reverse(dummy.next);
//     }
// }


class Solution {

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static Node removeLeadingZeros(Node head) {

        while (head != null && head.data == 0 && head.next != null) {
            head = head.next;
        }

        return head;
    }

    static Node addTwoLists(Node num1, Node num2) {

        // Reverse both lists
        num1 = reverse(num1);
        num2 = reverse(num2);

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {

            int sum = carry;

            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        // Reverse result
        Node ans = reverse(dummy.next);

        // Remove leading zeros, but keep one zero
        ans = removeLeadingZeros(ans);

        return ans;
    }
}
```

*Generated on: 08/10/2026, 22:21:03*