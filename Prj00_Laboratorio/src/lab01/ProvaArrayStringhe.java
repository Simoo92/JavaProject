package lab01;

import java.util.Arrays;

public class ProvaArrayStringhe {

	public static void main(String[] args) {

		int lung = 7;

//String[] nani = new String[lung];//la lunghezza dell'array deve essere nota a priori

		// nani[0] = "pisolo";
		// nani[1] = "eolo";
		// nani[2] = "mammolo";
		// nani[3] = "gongolo";
		// nani[4] = "cucciolo";
		// nani[5] = "dotto";
		// nani[6] = "brontolo";

		String[] nani = { "pisolo", "gongolo", "cucciolo", "mammolo", "eolo", "dotto", "brontolo", };

		int lunghezza = nani.length;// proprietà

		Arrays.sort(nani);

		for (int i = 0; i < nani.length; i++) {
			if (nani[i].length() > 5)

				System.out.println(nani[i]);
		}

	}

}
