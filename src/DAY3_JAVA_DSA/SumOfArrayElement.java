package DAY3_JAVA_DSA;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length-1,sum=0;
        while(n>=0)
        {
            sum+=arr[n];
            n--;
        }
        System.out.println("The sum of Element is:"+sum);
    }
}
