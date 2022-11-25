package j36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task13 {

	public static void main(String[] args) {
		// Task ->Verilen bir Stringdeki harfleri sayısını return  eden method create ediniz
		//  Input : Hellooo   output : H=1, e=1, l=2, o=3
		
		
		String input="Helllllloooooooo";

		adetIKelime(input);




		Map<String,Integer> methoddanGelenMap = harfSayisiBul(input);
		
		
		System.out.println(methoddanGelenMap);
		
		
	}

	private static void adetIKelime(String input) {
		Map<String,Integer> mmap = new HashMap<>();
		String [] arr = input.split("");
		for (String w:arr) {
			if(mmap.containsKey(w)){
				mmap.put(w,mmap.get(w)+1);
			}else mmap.put(w,1);

		}
		System.out.println(mmap);


	}













	public static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[] = input.split("");
		System.out.println(Arrays.toString(harfler));
		Map<String,Integer> harfKullanimSayisi=new HashMap<>();
		
		for (String each : harfler) {
			
			if (!harfKullanimSayisi.containsKey(each)) {
				
				harfKullanimSayisi.put(each, 1);
			}else {
				
				harfKullanimSayisi.put(each, harfKullanimSayisi.get(each) + 1 );
				
			}		
		}
		
		return harfKullanimSayisi;
	}

}
