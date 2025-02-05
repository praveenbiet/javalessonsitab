package src;

public class Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a = 5;
		int b = 10;
		
		int result = a + b;
		System.out.println(result);
		
		result = a - b;
		System.out.println(result);
		
		result = a * b;
		System.out.println(result);
		
		result = a / b;
		System.out.println(result);
		
		
		int i  = 10;
		long l = i;
		
		System.out.println(l);
		
		i = (int)l;
		System.out.println(i);
		
		float f = 1.5f;
		System.out.println(f);
		i = (int)f;
		System.out.println(i);
		
		char c = 'a';
		
		i = c;
		
		System.out.println(i);
		
		result = a % b;
		System.out.println(result);
		
		int inc = 10;
		
		System.out.println(inc);
		
		System.out.println(++inc);
		System.out.println(inc++);
		System.out.println(inc);

		int dec = 10;
		
		System.out.println(dec);
		
		System.out.println(--dec);
		System.out.println(dec--);
		System.out.println(dec);

		//relation operators
		
		
		// < > <= >= != == 
		
		int x = 15;
		int y = 8;
		System.out.println(x > y);
		boolean bool = x > y;
		System.out.println(bool);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		
		int j,k,z;
		
		j = 15;
		k = 20;
		z = 56;
		
		if(j>k)
		{
			if(k>z) {
				System.out.println("k is big");
			}
				else {
					System.out.println("z is big");
					
				}
		}
		
		if(j>k&&j>z) {
			System.out.println("j is big");
			
		}
		if(k>j&&k>z) {
			System.out.println("k is big");
			
		}
		if(z>k&&z>j) {
			System.out.println("z is big");
			
		}
		
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		//bitwise operators
		
		//& | ^ ~ << >> >>>
		
		
		int h = 10;
		int o = 7;
		
		
		System.out.println(h&o);
		
	//	5 --- 101 
	//  4 --- 100
	// & 100
		
	// 10 --- 1010 
	// 7  --- 0111
	//  &     0010
		
		System.out.println(h|o);
		// 10 --- 1010 
		// 7  --- 0111
		//  |     1111
		
		
		System.out.println(h^o);
		// 10 --- 1010 
		// 7  --- 0111
		// ^      1101 
		
		System.out.println(~o);
		
		o = 15;
		System.out.println(~o);
		
		int ls = 5;
		System.out.println(5<<2);
		// 5  101
		// << 2
		// 10100

		System.out.println(40>>2);

		System.out.println(5>>2);
		System.out.println(5>>>2);
		a = 5;
		b = 4;
		String str = a>b?"a is bigger":"b is bigger";

		System.out.println(str);

		if(false){
			System.out.println("wont work");
		}
		if(true){
			System.out.println("will work");
		}

		if(true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

		if(false){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
				
			
		switch(10){
			case 10:System.out.println("ten");break;
			default:System.out.println("no cases");break;
		}

		String name = "ram";

		switch(name){
			case "ram":System.out.println("ram");break;
			default:System.out.println("no cases");break;
		}
		name = "rani";

		switch(name){
			case "ram":System.out.println("ram");break;
			default:System.out.println("no cases");break;
		}
		
		
		int m = 0;
		while(m<=100){
			System.out.println(m);
			m++;
		}

		do{
			System.out.println(m);
			m++;
		}while(m<=100);
		
		for(int fi = 1 ; fi<=100;fi++){
			System.out.println(fi);

		}
		
		
		int array[] = {1,2,3,4,5};
		for(int fai = 0; fai < 5 ; fai++){
			System.out.println(array[fai]);
		}
		for(int ai : array){
			System.out.println(ai);
		}

		String strnames[] = {"ram","raj","rani"};

		for(String sn : strnames){
			System.out.println(sn);
		}







































	}

}
