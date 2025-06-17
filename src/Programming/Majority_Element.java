package Programming;

import java.util.HashMap;

public class Majority_Element {
    public static void majorityElement(int arr[]){
        HashMap<Integer,Integer> maap=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(maap.containsKey(arr[i])){
                maap.put(arr[i],maap.get(arr[i])+1);
            }else{
                maap.put(arr[i],1);
            }
        }
        for(int key : maap.keySet()){
            if(maap.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        majorityElement(arr);
    }
}
