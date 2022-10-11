/* PROBLEM STATEMENT 

        Given the head of a linked list, return the list after sorting it in ascending order.
                        Input: head = [4,2,1,3]
                        Output: [1,2,3,4]
*/
/*EXPLANATION/ALGO

          1 . FIND MID USING FAST AND SLOW POINTER .
          2.DIVIDE LINKEDLIST ITNO TWO HALFS.
          3.THEN SORT THEM AND THEN AGAING MERGE THEM.               
                                      *MERGE SORT*
              -CREATE DUMMY LIST POINT IT TO CURR , THEN CHECK TWO DIVIDED LINKED LIST (L1 L2)
              -IF L1 <= L2 THEN CURR->NEXT=L1     ,CURR->NEXT=L1 AND L1=L1->NEXT
              -ELSE  L1>=L2 THEN CURR->NEXT=L2  
          4.IF THERE IS ANY ELEMENT IS LEFT EITHER ON RIGHT OR LEFT THEN :-
          IF (L1 != NULL)    CURR->NEXT =L1  AND L1=L1->NEXT
*/

/*CODE*/


        class Solution {
    private:
    ListNode*mergeSort(ListNode*l1 , ListNode*l2){
          ListNode*a=new ListNode(0);   //to store final sorted ans
          ListNode*curr=a;
        while(l1!=nullptr and l2!=nullptr){
         //cond 1
        if(l1->val <= l2->val){
             curr->next =l1;
            l1=l1->next;
        }
        else if(l1->val >= l2->val){
            curr->next=l2;
            l2=l2->next;
        }
            curr=curr->next; //traversing
        }
    // case if there is any element left or when linked list is of odd no
        if(l1!=nullptr){
            curr->next=l1;
            l1=l1->next;
        }
        else if(l2!=nullptr){
            curr->next=l2;
            l2=l2->next;
        }
        return a->next; //because a was 0 
    }
public:
    ListNode* sortList(ListNode* head) {
        if(head==nullptr || head->next==nullptr){
            return head;
        }
        ListNode*temp=nullptr;
        ListNode*slow=head;
        ListNode*fast=head;
    while(fast!=nullptr and fast->next!=nullptr){
        temp=slow;  //because we want mid and using this we will get mid
        slow=slow->next;
        fast=fast->next->next;

    }
    temp->next=nullptr;   //so that we divide linked list from mid

    //two half of linkedlist 
    ListNode*l1=sortList(head);
    ListNode*l2=sortList(slow);
    //recursive call  for merger sort
       return mergeSort(l1, l2);

    }
};
