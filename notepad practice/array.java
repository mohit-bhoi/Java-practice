class array{
	public static void main(String[] args){
		int []a = {1,2,3,4,5};
		int []b=new int[5];
		
		System.out.println("element of A: ");
		for(int m:a){
		System.out.println(m);
		}
		System.out.println("Coping data A to B\n++++++++\n Element of B: ");
		
		for(int i =0; i<a.length; i++){
			b[i]=a[i];
		}
		
		for(int m:b){
		System.out.println(m);
		}
		
	}
}