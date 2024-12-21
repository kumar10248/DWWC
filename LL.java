public class LL {
   static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
        node(int data, node next){
            this.data=data;
            this.next=next;
        }


        
    } 
    private static int count(node head){
        int c=0;
        node temp=head;
        while(temp!=null){
            
            temp=temp.next;
            c++;
        }
        return c;
    }
      
     private static node toLL(int[] arr){
        node head = new node(arr[0]);
        node move=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            move.next=temp;
            move=temp;
        }
        return head;
     }

     private static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
     }


     private static node removeHead(node head){
        if(head==null){
            return null;
        }
        node temp=head;
        head=head.next;
        temp.next=null;
        return head;
     }

     private static node removetail(node head){
        if(head==null||head.next==null){
            return null;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
     }

     private static node removeK(node head , int k){
        if(head==null){
            return null;
        }
        if(k==1){
            node tmep=head;
            head=head.next;
            return head;
        }
        int c=0;
        node temp=head;
        node prev=null;
        while(temp!=null){
            c++;
            if(c==k){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
     }

     private static node removeE(node head , int k){
        if(head==null){
            return null;
        }
        if(head.data==k){
            node tmep=head;
            head=head.next;
            return head;
        }
  
        node temp=head;
        node prev=null;
        while(temp!=null){
  
            if(temp.data==k){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
     }

     private static node insertH(node head, int val){
        return new node(val,head);
        
     }
     
     private static node insertT(node head, int val){
        if(head==null){
            node temp=new node(val,null);
            return temp;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node t=new node(val,null);
        temp.next=t;
        return head;
        
     }

     private static node insertK(node head,int val, int k){
        if(head==null){
            if(k==1){
                return new node(val);
            }
        }
        if(k==1){
            return new node(val,head);
        }
        int c=0;
        node temp=head;
        while(temp!=null){
            c++;
            if(c==k-1){
                node t=new node(val);
                t.next=temp.next;
                temp.next=t;
                break;
            }
            temp=temp.next;
        }
        return head;
     }
     
    public static void main(String[] args) {
        int[] arr = {3,9,2,96,23};
        node n=toLL(arr);
    node s=null;

        //   while(temp!=null){
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
        //   }
     

        
           n= insertK(n, 48,3);
            print(n);

       }
}
