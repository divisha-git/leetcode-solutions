class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null; 
        int carry = 0;       

      
        while (l1 != null || l2 != null || carry != 0) {
            
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;  
            carry = sum / 10;      

            
            ListNode newNode = new ListNode(digit);

            
            if (head == null) {
                head = newNode;
            } else {
            
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }

           
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

       
        return head;
    }
}