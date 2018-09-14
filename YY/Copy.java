LinkList Copy(LinkList lista) {
  LinkList listb;
  
  if(lista == NULL)
    return NULL;
  else {
    listb = (LinkList)malloc(sizeof(LNode));
    listb->data = lista->data;
    listb->next = Copy(lista->next);
    return listb;
  }
}
