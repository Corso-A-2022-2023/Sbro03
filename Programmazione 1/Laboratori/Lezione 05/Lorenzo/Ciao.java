public class Ciao{
	public static void main(String[] args){
		
		int i = 0;
		boolean flag = false;
		while(i < 5){
			String ciao = "ciao";
			String x = SIn.readWord();
			if(ciao.equals(x))
				flag = true;
			else
				flag = false;
			i++;
		}
		System.out.print(flag);
	}
}