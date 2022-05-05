import java.utill.*;
class Q
{
 int[] arr;
 int size;
 int top1,top2;
 Q(int n)
 {
 size=n;
 arr = new int[n];
 top1 = n/2 + 1;
 top2 = n/2;
 }
 void push1(int x)
 {
 if(top>1)
 {
 top1--;
 arr[top1] = x;
 }
 else
 {
 System.out.print("Stack overflow");
 return;
 }
 }
 void push2(int x)
 {
 if(top2<size-1)
 {
 top2++;
 arr[top2] = x;
 }
 else
 {
 System.out.print("Stack overflow"+"by element:"+x+"\n");
 return;
 }
 }
 int pop1()
 {
 if(top1<=size/2)
 {
 int x=arr[top1];
 top1++;
 return x;
 }
  else
 {
 System.out.print("Stack underflow");
 System.exit(1);
 }
 return 0;
 }
 int pop()
 {
 if (top2>=size/2 +1)
 {
 int x=arr[top2];
 top2--;
 return x;
 }
 else
 {
 System.out.print("Stack underflow");
 System.exit(1);
 }
 return 1;
 }
 }
 class A
 {
 public static void main(String args[]){
 Q s=new Q(5);
 s.push1(5);
 s.push2(22);
 s.push3(34);
 s.push4(38);
 s.push5(89);
 System.out.print("popped element from stack is"+s.pop1());
 s.push2(40);
 System.out.print("popped element from stack is"+s.pop2());
 }
 }