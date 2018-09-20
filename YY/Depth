int Depth(BTree T) {
    int ldepth, rdepth;

    if(T == NULL) {
        return 0;
    }
    else {
        ldepth = Depth(T->lchild);
        rdepth = Depth(T->rchild);
        if(ldepth > rdepth)
            return ldepth + 1;
        else
            return rdepth + 1;
    }
}
