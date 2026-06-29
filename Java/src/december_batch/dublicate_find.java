package december_batch;

public class dublicate_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,1,3};

		for(int i=0; i<a.length; i++) {       //0<4 1<4 2<4 3<4 4<4f
			int c=0;
			for(int j=i+1; j<a.length; j++) {    //1<4 2<4 3<4 4<4f
				//2<4 3<4 4<4f
				//3<4 4<4f
				//4<4f
				if(a[i]==a[j]) {    //1=2 1=1 1=3 
					//2=1 2=3
					//1=3
					c++; 
					//1   0 0 0
				}
			}
			if(c==0) {  //F   T  T  T 



				int count=0;
				for(int k=0; k<a.length; k++) {
					if(a[k]==a[i]) {
						count++;
					}

				}
				System.out.println(a[i]+ " count "+ count);
			}
		}
	}

}
