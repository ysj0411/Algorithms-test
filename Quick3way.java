public class Quick3way {
	private static void sort(int[] a,int lo,int hi) {
	    if(hi<=lo) return;//末尾和开头应该存在且不相同。
		int v=a[lo];//定义一个切分元素v
		int lt=lo,i=lo+1,gt=hi;//lt代表左边数组，i代表中间也是遍历指针，相当于gt和i在右边拉出两块范围，而开头lt则只在获得新的元素，即与i交换后才增加，也可以视作划出左边范围，就可以得到三块区域，小于v等于v和大于v。
		while(i<=gt) {//i和gt 不能相遇。
			if(a[i]<v) exch(a,lt++,i++);//如果当前的a[i]小于于切分元素则放在前方，并且lt增加来扩大左边区域
			else if(a[i]>v) exch(a,i++,gt--);//如果a[i]大于v，则放到gt的范围内,就类似于i是一个分配员，小的给lt，大的给gt，其他两者只要等着就行。
			else i++;
				
			
		}//从上已经得到a[lo...lt-1]<v=a[lt,gt]<a[gt+1,hi]
		sort(a,lo,lt-1);// 排序左边即lt看管的元素
		sort(a,gt+1,hi);//排序右边即gt保管的元素
		 assert isSorted(a, lo, hi);
	}
	private static void show(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+ " ");
    	System.out.println();
	}
	 private static void exch(int[] a,int i,int j) {
	    	int t=a[i];a[i]=a[j];a[j]=t;
}
	 public static void sort(int[] a) {
			
				
			sort(a,0,a.length-1);
		}
	 public static void main(String[] args) {
	    	int[] a={6,9,67,5,5,4,7,9};
	    	show(a);
	    	sort(a);
	        show(a);
	    }
	 private static boolean less(int i, int j) {
			
			return i<j;
		}
	    private static boolean isSorted(int[] a, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }
	    private static boolean isSorted(int[] a) {
	        return isSorted(a, 0, a.length - 1);
	    }

}
