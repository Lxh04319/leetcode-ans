class listnode{
    int val;
    listnode next;
    listnode(){}
    listnode(int val){
        this.val=val;
    }
}
class MyLinkedList {
    listnode head;
    int size;
    public MyLinkedList() {
        size=0;
        head=new listnode(0);
    }

    public int get(int index) {
        if(index>=size||index<0){
            return -1;
        }
        listnode p=head;
        for(int i=0;i<=index;i++){
            p=p.next;
        }
        return p.val;
    }

    public void addAtHead(int val) {
        listnode add=new listnode(val);
        add.next=head.next;
        head.next=add;
        size++;
    }

    public void addAtTail(int val) {
        listnode temp=new listnode(val);
        listnode p=head;
        for(int i=0;i<size;i++){
            p=p.next;
        }
        p.next=temp;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size) return;
        listnode temp=new listnode(val);
        listnode p=head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        temp.next=p.next;
        p.next=temp;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index>=size) return;
        listnode p=head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        p.next=p.next.next;
        size--;
    }
}
