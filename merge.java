public class Merge {
	public static void merge(int[] a,int lo,int mid,int hi ) {
    	int i=lo,j=mid+1;//i和j为遍历变量，分别遍历左右函数
    	for(int k=lo;k<=hi;k++)//复制a[lo...hi]数组，以便储存归并后的数组，其中lo，mid，mid+1，hi为定位变量，为左右数组的头尾
    		aux[k]=a[k];
    	for(int k=lo;k<=hi;k++)//归并函数，从头至尾归并，并比较左右数组的大小，首先要解决左右排序问题，方法在下方sort处， 也就是说k从函数头一直走到尾。
    		if (i>mid) a[k]=aux[j++];//如果i的值大于mid(左边函数的尾)，即代表左边数组全部放入了aux归并函数中，则取右边的元素，因为默认左右数组已经排序（见上方描述），所以不用考虑大小问题，既然左边全部取完已经说明左边全部小于右边剩余的元素。
    		else if(j>hi) a[k]=aux[i++];//与上一条相反推导
    		else if(less(aux[j],aux[i])) a[k]=aux[j++];//比较左右元素大小，小的放入，下方意思就是如此
    		else                         a[k]=aux[i++];
    				
    	
    	
    }
    private static int[] aux;
    public static void sort(int[] a) {//一般主函数会调用这个函数，即可定义相应长度的辅助数组aux(储存数组见merge)
    	aux=new int[a.length ];//定义数组长度
        sort(a,0,a.length -1);//开始排序，三个参数分别为，数组，数组开始，数组末尾
    }
    private static void sort(int[] a,int lo,int hi) {//排序，开始划分左右数组，且不断变化，从2的0次一直到2的n次（0次就是原本数组，n取决于数组的长度。就是一直对半分）
    	if (hi<=lo) return;//如果末尾小于或等于开头就跳出sort函数，如果前面有调用就是代表接着运算那个方法（函数），比如数组长度为15，则不会执行这条语句，但会往下执行，得到mid=7，然后就得到sort(a,0,7)，这时调用自身，lo和hi的值也随之改变(这次只是因为lo是0看不出)，hi变为7，又运算到第三条方法，一直到sort(a,0,1)虽然前面没事但再一次调用第三条sort(a,0,0）发现hi<=lo只能跳出，开始运算sort(a,0,1),第四条也是hi值不满足，只能执行merge(a,0,0,1)；以此类推。
    	int mid=lo+(hi-lo)/2;
    	sort(a,lo,mid);
    	sort(a,mid+1,hi);
    	merge(a,lo,mid, hi);
    }
    
	private static boolean less(int i, int j) {
		// TODO Auto-generated method stub
		return i<j;
	}
        public static void main(String[] args) {
    	int[] a={1,9,5,4,3,5,32,4,3,2,5,2,0};
    	System.out.print(a);
    	sort(a);
    	
    	show(a);
    }
	private static void show(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+ " ");
    	System.out.println();
	}

}