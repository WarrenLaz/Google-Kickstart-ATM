import java.util.*;
public class Kickstarter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int T = input.nextInt();

		for(int i = 0; i < T; i++) {
			ArrayList<Integer> Q = new ArrayList<>();
			ArrayList<Integer> sorted = new ArrayList<>();
			ArrayList<Integer> numofWith = new ArrayList<>();
			int numP = input.nextInt();
			Integer withLim = input.nextInt();

			for(int j = 1; j <= numP; j++) {
				Q.add(j);
			}

			for(int k = 0; k < Q.size(); k++) {
				numofWith.add(input.nextInt());
			}
			while(Q.size() != 0) {
				for(int l = 0; l < Q.size(); l++) {

					numofWith.add(l, numofWith.get(l) - withLim); 

					if(numofWith.get(l) <= 0) {
						sorted.add(Q.get(l));	
						Q.remove(l);

					}
				}
			}
			System.out.println(sorted);
		}

	}


}

