public class Queue{
int SIZE=5;
int items[]=new int[SIZE];
int front,rear;
Queue(){
front=-1;
rear=-1;
}
Boolean isFull(){
if(front==0 && rear==SIZE-1){
return true;
}
return false:
}

if(front==-1)
return true;
else
return false;
}
if(isfull()){
System.out.orintln("Queue is full");
}
else{
 if(front==-1){
front=0;
rear++;
items[rear]=element;
   System.out.println("Inserrt"+element);
}
}
int deQueue(){
int element;
if(isEmpty()){
System.out.println("Queue is empty");
return(-1);
}
else{
element=items[front];
if(front>=rear){
  front=-1;
  rear=-1;
}
else{
front++;
}
System.out.println(element+deleted);
return (element);
}
void display(){
int i;
if(is Empty()){
System.out.println("Empty Queue");}
else{
System.out.println("\n front intex->"+front);
System.out.println("items->");
for(i=front; i<=rear ;i++)
System.out.print(items[i]+"");
System.out.println("\n rear index->"+rear);
}
}
Queue q=new Queue();
q.deQueue();
for (int i=1; i<6; i++){
q.enQueue(i);
}
q.enQueue(6);
q.display();
q.deQueue();
q.display();
}
}