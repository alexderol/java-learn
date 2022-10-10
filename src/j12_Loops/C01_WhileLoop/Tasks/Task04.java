package j12_Loops.C01_WhileLoop.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		for (int i = 1000; i > 100; i--) {
			if(i%4==0 && i%6==0){
				System.out.print(i+" ");
			}

		}
		

		
		
			
	}

}
