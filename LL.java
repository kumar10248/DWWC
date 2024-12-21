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
     
    public static void main(String[] args) {
        int[] arr = {3,9,2,96,23};
        node n=toLL(arr);
    

        //   while(temp!=null){
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
        //   }
     

        
           n= insertH(n, 5);
            print(n);
       }
}
