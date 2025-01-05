/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    //Floyd’s Cycle-Finding Algorithm
    //tortoise and the hare algorithm
    struct ListNode *fast=head;
    struct ListNode *slow=head;
    int c=0;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;

        if(slow==fast)
        {
            return true;
        }
    }
    return false;
}