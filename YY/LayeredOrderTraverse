#define MAX_QUEUE 50

void LayeredOrderTraverse(BTree T) {
    BTree QUEUE[MAX_QUEUE], p;
    int front, rear;

    if(T != NULL) {
        QUEUE[0] = T;
        front = -1;
        rear = 0;
        while (front < rear) {
            p = QUEUE[++ front];
            VISIT(P);
            if(p->lchild != NULL)
                QUEUE[++ rear] = p->lchild;
            if(p->rchild != NULL)
                QUEUE[++ rear] = p->rchild;
        }
    }
}
