import java.util.*;
public class InsertionSort{
	public static void insertionIntoSorted(int[] ar){
		int length= ar.length;
		int elementNeedToBeInserted = ar[length-1];
	for(int i=length-2;i>=0;i--){
		if(ar[i]>elementNeedToBeInserted){
			ar[i+1]=ar[i];
			printArray(ar);
			}
		else{
			ar[i+1]=elementNeedToBeInserted;
			printArray(ar);
			break;
		}
		if((i==0)&&(ar[i]>elementNeedToBeInserted)){
			ar[i]=elementNeedToBeInserted;
			printArray(ar);
		}
		}
	}
	public static void main(String[] args){
		Scanner n= new Scanner(System.in);
		int s =n.nextInt();
		int[] ar =new int[s];
	for(int i=0;i<s;i++){
		ar[i]=n.nextInt();
		}
	insertionIntoSorted(ar);
	n.close();
	}
	private static void printArray(int[]ar){
		for(int n:ar){
		System.out.print(n+"");
		}
		System.out.println("");
	}
}