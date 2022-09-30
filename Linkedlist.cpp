/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    
  ListNode* reverse(ListNode* &head){

    ListNode* prev = NULL;  // previous pointer 
    ListNode* curr = head ;  // current pointer
    ListNode* Next;   //  next pointer

    while(curr != NULL){

        Next = curr->next;
        curr->next = prev;

        prev = curr;
        curr = Next;

    }

    return prev;

}
    ListNode* reverseList(ListNode* head) {
        
        ListNode* ans = reverse(head);
        
        return ans;
        
    }
};
