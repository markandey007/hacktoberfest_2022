#include<iostream>
using namespace std;
struct node
{
           int data;
           node *next;
};
node* addNode(node *start,int x)
{
           node *temp=new node;
           temp->data=x;
           temp->next=NULL;
           if(start==NULL)
                      return temp;
           node *ptr;
           ptr=start;
           while(ptr->next!=NULL)
           {
                      ptr=ptr->next;
           }
           ptr->next=temp;
           return start;
}
void split(node *head,node **head1,node **head2)
{
          node *slow=head;
          node *fast=slow->next;
          while(head!=fast && fast->next!=head)
          {
                     slow=slow->next;
                     fast=fast->next->next;
          }
          *head1=head;
          *head2=slow->next;
          slow->next=*head1;
          node *temp=*head2;
          while(temp->next!=NULL)
          {
                     temp=temp->next;
          }
          temp->next=*head2;
}
void printList(node *temp)
{
           while(temp!=NULL)
           {
                      cout<<temp->data<<" ";
                      temp=temp->next;
           }
}
int main()
{
           node *sample=NULL,*head1=NULL,*head2=NULL;
           sample=addNode(sample,10);
           sample=addNode(sample,20);
           sample=addNode(sample,30);
           sample=addNode(sample,40);
           sample=addNode(sample,50);
           cout<<"List:";
           printList(sample);
           cout<<endl;
           split(sample,&head1,&head2);
           cout<<"First:";
           printList(head1);
           cout<<endl<<"Second:";
           printList(head2);
           return 0;
}
