class Node {  
  
  private int elem; 
  private Node next;
  
  public Node(int elem, Node next)
  {this.elem=elem;this.next=next;}
  
  public int  getElem(){return elem;}
  public Node getNext(){return next;}
  public void setElem(int elem){this.elem=elem;}
  public void setNext(Node next){this.next=next;}}

class List
{
    private Node top=null;
    
    public List(Node top)
    {this.top=top;}
    
    public List rev(List m)
  {
    Node tmp = this.top;
    Node rev = null;
    boolean stop = false;
    while(tmp != null){
        rev = new Node(tmp.getElem(), rev);
        tmp = tmp.getNext();
    }
    tmp = rev;
    while(tmp !=  null && !stop){
        if(tmp.getNext() == null){
            tmp.setNext(m.top);
           stop = true;
        }
        tmp = tmp.getNext();
    }
    return new List(rev);
  }
  
 //p={1,2,3}
 static Node p = new Node(1,new Node(2,new Node(3,null)));
 //q={10,20,30}
 static Node q = new Node(10,new Node(20,new Node(30,null)));
 
 public String toString()
 {
  Node p = this.top;
  String s="";
  while (p!=null) 
   {
       s=s+p.getElem()+" ";
       p=p.getNext();
   }
   
   return s;
 }
  
 public static void check(String msg, String a, String b)
  {if (a.equals(b))
    System.out.println(msg + a + 
     " OK");
   else
    System.out.println(msg + a + 
     " INSTEAD OF " + b);
  }
    
public static void main(String[] args)
 {check(
   "l.rev(m)=", 
   new List(p).rev(new List(q)).toString(), 
   "3 2 1 10 20 30 ");
 }
    
}

