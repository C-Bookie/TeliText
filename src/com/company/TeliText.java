package com.company;

/**
 * Created by duck- on 18/04/2017.
 */
public class TeliText {
	
	public static String graph(long[] t1, long[] t2, float max, int height) {
		String result = "";
		for (int y=0; y<height; y++) {
			for (int x=0; x<t1.length; x++) {
				switch (((height - y > (t1[x] / max) * height)?0:1) + ((height - y > (t2[x] / max) * height)?0:2)) {
					case 3:
						result+="#";
						break;
					case 2:
						result+="!";
						break;
					case 1:
						result+="|";
						break;
					case 0:
						result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
}
