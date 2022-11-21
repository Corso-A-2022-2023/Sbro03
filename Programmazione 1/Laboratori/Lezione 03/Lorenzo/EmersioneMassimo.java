public class EmersioneMassimo {
	public static void main (String[] args){
		
		int x = SIn.readLineInt();
		int y = SIn.readLineInt();
		int w = SIn.readLineInt();
		int z = SIn.readLineInt();
		
		boolean isYBiggerX = y >= x;
		boolean isWBiggerY = w >= y;
		boolean isZBiggerW = z >= w;
		
		if(isZBiggerW && isWBiggerY && isYBiggerX){
			System.out.println("max: " + z);
		}else{
			if(isWBiggerY && isYBiggerX)
				System.out.println("max: " + w);
	
			if(isZBiggerW && isYBiggerX)
				System.out.println("max: " + y);
			
			if((isZBiggerW || isYBiggerX || isWBiggerY)== false)
				System.out.println("max: " + x);
		}
		
	}
}