#define MAX_STACK 50

void PreOrderTraverse(BTree T) {
   BTree STACK[MAX_STACK], p = T;
   int top = -1;

   while (p != NULL || top != -1) {
       while(p != NULL) {
           VOSIT(p);
           STACK[++ top] = p;
           p = p->lchild;
       }
       p = STACK[top --];
       p = p->rchild;
   }
}

void InOrderTraverse(BTree T) {
    BTree STACK[MAX_STACK], p = T;
    int top = -1;

    while (p != NULL || top != -1){
        while (p != NULL) {
            STACK[++ top] = p;
            p = p->lchild;
        }
        p = STACK[top --];
        VISIT(p);
        p = p->rchild;
    }
}

void PostOrderTraverse(BTree T) {
    BTree STACK1[MAX_STACK], p = T;
    int STACK2[MAX_STACK], flag, top = -1;

    while (p != NULL || top != -1) {
        while (p != NULL) {
            STACK1[++ top] = p;
            STACK2[top] = 0;
            p = p->lchild;
        }
        p = STACK1[top];
        flag = STACK2[top --];
        if(flag == 0) {
            STACK1[++ top] = p;
            STACK2[top] = 1;
            p = p->rchild;
        } else {
            VISIT(p);
            p = NULL;
        }
    }
}
