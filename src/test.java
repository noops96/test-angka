public class test {

	public static void main(String[] args) {
		
		/* Soal 1
		 * String str = "2345678912";
		 * 
		 * if(str.length() % 2 == 0) {
		 * 
		 * System.out.println(Integer.parseInt(str.substring(str.length()/2-1,str.length
		 * ()/2)) + Integer.parseInt(str.substring(str.length()/2,str.length()/2+1)) );
		 * 
		 * }else {
		 * System.out.println(Integer.parseInt(str.substring(str.length()/2-1,str.length
		 * ()/2)) + Integer.parseInt(str.substring(str.length()/2+1,str.length()/2+2))
		 * );
		 * 
		 * }
		 */	
		//Soal2
		test a = new test();
		a.checkAngka(new Double(50000));
		
	}
	
public void checkAngka(Double angka){
		String result = "";
		
		if(angka >= 50000 ) {
			result = " positif Chatbanking ToBe, You challenge in Mandiri";
		}else if(angka <50000 && angka > 0 ){
			result = " positif small";
		}else if(angka == 0)
		{
			result = " nol small";
		}else{
			result = " negatif small";
		}
	
		System.out.println(angka + result);
	}
}
