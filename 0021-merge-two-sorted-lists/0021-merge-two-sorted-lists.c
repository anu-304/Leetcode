struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    // Handle edge cases where one or both lists are NULL
    if (list1 == NULL) return list2;
    if (list2 == NULL) return list1;

    // Initialize the merged list's head and tail
    struct ListNode* mergedHead = NULL;
    struct ListNode* mergedTail = NULL;

    // Determine the initial head of the merged list
    if (list1->val <= list2->val) {
        mergedHead = list1;
        list1 = list1->next;
    } else {
        mergedHead = list2;
        list2 = list2->next;
    }
    mergedTail = mergedHead;

    // Merge the two lists by iterating through both
    while (list1 != NULL && list2 != NULL) {
        if (list1->val <= list2->val) {
            mergedTail->next = list1;
            list1 = list1->next;
        } else {
            mergedTail->next = list2;
            list2 = list2->next;
        }
        mergedTail = mergedTail->next;
    }

    // Attach any remaining nodes from list1 or list2
    if (list1 != NULL) {
        mergedTail->next = list1;
    } else if (list2 != NULL) {
        mergedTail->next = list2;
    }

    return mergedHead;
}
