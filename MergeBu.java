public class mergeBU {
	private static int[] aux;
	public static void merge(int[] a,int lo,int mid,int hi ) {
    	int i=lo,j=mid+1;
    	for(int k=lo;k<=hi;k++)
    		aux[k]=a[k];
    	for(int k=lo;k<=hi;k++)
    		if (i>mid) a[k]=aux[j++];
    		else if(j>hi) a[k]=aux[i++];
    		else if(less(aux[j],aux[i])) a[k]=aux[j++];
    		else                         a[k]=aux[i++];} 
    				
	public static void sort(int[] a) {
		int N=a.length;
		aux=new int[N];
		for(int size=1;size<N;size=size+size)//size代表子数组大小；即size+size为归并子数组的范围，如第一次为两两归并，范围就为2，第二次是四四归并，范围就为4
			for(int lo=0;lo<N-size;lo+=size+size) // lo还是遍历用，不过由归并大小决定递增，
				merge(a,lo,lo+size-1,Math.min(lo+size+size-1, N-1));//归并，第一次是0,1；2,3；。。。。。这些数归并，减1就是为了归并。且因为每次范围不同，所以不是单纯的加1.而是下一组开头减1，而后一个是为了防止溢出，或者说是遇到奇数是使用，比如取15长度的数组，如果还按前面算，就应该是16，但这就会导致数组溢出。
		       /* System.out.print("a["+lo+"]"+a[lo]+ " ");
		        System.out.println();
		        System.out.print("a["+Math.min(lo+1, N-1)+"]"+a[Math.min(lo+1, N-1)]+ " ");
		        System.out.println();*/
				//由 merge 可得只要取得和开始，中间和末尾即可，而开头加范围（2size）再减去本身就是末尾，也就是lo+size+size-1，中间值也是如此，不过是开头加一半的范围减去他的本身 ，即 lo+size-1。	}
	}
    		private static void show(int[] a) {
    			// TODO Auto-generated method stub
    			for(int i=0;i<a.length;i++)
    	    		System.out.print(a[i]+ " ");
    	    	System.out.println();
    		}
	private static boolean less(int i, int j) {
		// TODO Auto-generated method stub
		return i<j;
	}
	public static void main(String[] args) {
    	int[] a={1,9,5,4,3,5,32,4,3,2,5,2,0};
    	show(a);
    	sort(a);
    	
    	show(a);
    }
 
}