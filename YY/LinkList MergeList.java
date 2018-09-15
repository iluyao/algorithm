LinkList MergeList (LinkList lista, LinkList listb) {
    LinkList listc, p = lista, q = listb, r;

    if(lista->data <= listb->data) {
        listc = lista;
        r = lista;
        p = liata->next;
    } else {
        listc = listb;
        r = listb;
        q = listb->next;
    }

    while(p != NULL && q != NULL) {
        if(p->data <= q->data) {
            r->next = p;
            r = p;
            p = p->next;
        } else {
            r->next = q;
            r = q;
            q = q->next;
        }
    }

    r->next = (p != NULL) ? p : q;
    return listc;
}
