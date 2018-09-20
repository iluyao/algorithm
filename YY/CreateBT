BTree CreateBT() {
    char ch;
    BTree T;

    scanf("%c", &ch);
    if(ch == ' ')
        return NULL;
    else {
        T = (BTree)malloc(sizeof(BTNode));
        T->data = ch;
        T->lchild = CreateBT();
        T->rchild = CreateBT();
        return T;
    }
}
