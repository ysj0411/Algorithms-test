

public class Quick {
	
    public static int partition(int[] a,int lo,int hi) {
		int i=lo,j=hi+1;
		int v=a[lo];//随机取切分值，现在先取数组首项，算法改进目标为随机取。
		while(true) {//循环开始，因为条件是TRUE所以要在方法中设定终止循环，不然会陷入死循环。
			while(less(a[++i],v)) { if(i==hi) break;}//i为左遍历指针，++i为先增加1后运算，所以就是i+1与v比较，如果所遍历数小于v，就说明这是属于左半边的数，所以接着循环，也就是一直比较到a[++1]>v(大于的话说明应该在右)，或者遍历到末尾，然后开始循环下方方法。
			while(less(v,a[--j])) {if(j==lo) break;}//与上面同理，不过是从a[hi]开始从右往左遍历。
			if(i>=j) break;
			exch(a,i,j);//a[i]与a[j]交换，上方一直循环，直到遇到a[++1]>v并且a[--j]<v时，交换当前满足的a[i]和a[j]，也就是把左边的放到右边，右边，右边放到左边，以满足切分的左右元素分配。
		}
		exch(a,lo,j);//因为要把切分元素放到中间就要放置在左边的末尾，因为++i和--j的特点。可以直到j正好遍历到左边的末尾，而i则遍历到右边的开头。
    	        assert isSorted(a,lo,hi);
               return j ;
 }
	private static boolean less(int i, int j) {
		// TODO Auto-generated method stub
		return i<j;
	}
	 public static void main(String[] args) {
	    	int[] a={6,9,67,5,5,4,7,9};
	    	show(a);
	    	sort(a);
	    	
	    	show(a);
	    }
		public static void sort(int[] a) {
		// TODO Auto-generated method stub
			
		sort(a,0,a.length-1);
	}
		private static void sort(int[] a,int lo,int hi) {
			if(hi<=lo) return;
			int j=partition(a,lo,hi);
			sort(a,lo,j-1);//排序j左边的元素，不能排序到j不然会死循环 ,下方同理。
			sort(a,j+1,hi);
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
	 private static boolean isSorted(int[] a, int lo, int hi) {
		        for (int i = lo + 1; i <= hi; i++)
		            if (less(a[i], a[i-1])) return false;
		        return true;
		    }
		    private static boolean isSorted(int[] a) {
		        return isSorted(a, 0, a.length - 1);
		    }	 
}
