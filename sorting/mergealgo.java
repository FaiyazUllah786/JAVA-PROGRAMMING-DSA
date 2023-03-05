package sorting;
class mergealgo{
    public static void mergeSort(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr,left,mid,right);
    }
    public static void merge(int arr[],int left,int mid,int right){
        int size=right-left+1;
        int temp[]=new int[size];
        int i=left,j=mid+1,k=0;
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
        for(k=0,i=left;k<size;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8,2,4,6};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}