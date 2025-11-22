import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int personN = sc.nextInt();
		int chickenM = sc.nextInt();
		
		int[][] list = new int[personN][chickenM];
		int letsGoChickenPartyTonightOhYeaaaaaaaah = 0;
		int score;
		
		for (int i = 0; i < personN; i++) {
			for (int j = 0;  j < chickenM; j++) {
				list[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < chickenM; i++) {
			for (int j = i+1; j < chickenM; j++) {
				for (int k = j+1; k < chickenM; k++) {
					score = 0;
					for (int l = 0; l < personN; l++) {
						score += max(max(list[l][i],list[l][j]),list[l][k]);
					}
					letsGoChickenPartyTonightOhYeaaaaaaaah = max(letsGoChickenPartyTonightOhYeaaaaaaaah, score);
				}
			}
		}
		System.out.print(letsGoChickenPartyTonightOhYeaaaaaaaah);
	}
	
	public static int max(int a, int b){
		return a > b? a:b;
	}
}