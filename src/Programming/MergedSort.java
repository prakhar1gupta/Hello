package Programming;

public class MergedSort {
    public static void Conquer(int arr[],int start,int mid,int end){
        int merged[]=new int[end-start+1];
        int x=start;
        int y=mid+1;
        int pdx=0;
        while(x<=mid && y<=end){
            if(arr[x]<=arr[y]){
                merged[pdx++]=arr[x++];
            }
            else{
                merged[pdx++]=arr[y++];
            }
        }
        while(x<=mid){
            merged[pdx++]=arr[x++];
        }
        while(y<=end){
            merged[pdx++]=arr[y++];
        }
        for(int i=0,j=start;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void Divide(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        Divide(arr,start,mid);
        Divide(arr,mid+1,end);
        Conquer(arr,start,mid,end);
    }

    public static void main(String[] args) {
        int arr[]={5,8,99,97,11,2,456};
        int n=arr.length;
        Divide(arr,0,n-1);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
