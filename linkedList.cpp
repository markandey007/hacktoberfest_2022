#include<iostream>
using namespace std;
class Node{
    public:
        int data;
        Node * next;

        //constructor
        Node( int val){
            data=val;
            next=NULL;
        }
        //member function
        void InsertAtEnd(Node * &head, int val);
        void display(Node *head);
};

main(){
    
}
void Node::InsertAtEnd(Node * &head, int val){
    Node * n=new Node(val);
    if(head==NULL)
        head=n;
    else{
        Node *temp=head;
        while(temp->next!=NULL)
            temp=temp->next;
        temp->next=n;
    }
}

void Node::display(Node *head){
    Node *temp=head;
    while(temp->next!=NULL){
        cout<<temp->data<<"->";
        temp=temp->next;
    }
}