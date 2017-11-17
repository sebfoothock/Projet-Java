package Model;

public class ArrayCase extends Case{
	/**
	 * The constructor of the differents caracteristics of a case 
	 * @param num the number of the case
	 * @param parity the parity (odd or even)
	 * @param color the color (red or black)
	 * @param intervals the interval where the case is
	 */
	public ArrayCase(int num, String parity, String color, int intervals) {
		super(num, parity, color, intervals);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Case [] arrayCase = new Case[43];
		// case -> num, parity, color, interval
		
		//First intervals
		arrayCase[0] = new Case(0, "N", "V", 0);
		arrayCase[1] = new Case(1, "I", "R", 1);
		arrayCase[2] = new Case(2, "P", "N", 1);
		arrayCase[3] = new Case(3, "I", "R", 1);
		arrayCase[4] = new Case(4, "P", "N", 1);
		arrayCase[5] = new Case(5, "I", "R", 1);
		arrayCase[6] = new Case(6, "P", "N", 1);
		arrayCase[7] = new Case(7, "I", "R", 1);
		arrayCase[8] = new Case(8, "P", "N", 1);
		arrayCase[9] = new Case(9, "I", "R", 1);
		arrayCase[10] = new Case(10, "P", "N", 1);
		arrayCase[11] = new Case(11, "I", "N", 1);
		arrayCase[12] = new Case(12, "P", "R", 1);
		//Second intervals
		arrayCase[13] = new Case(13, "I", "N", 2);
		arrayCase[14] = new Case(14, "P", "R", 2);
		arrayCase[15] = new Case(15, "I", "N", 2);
		arrayCase[16] = new Case(16, "P", "R", 2);
		arrayCase[17] = new Case(17, "I", "N", 2);
		arrayCase[18] = new Case(18, "P", "R", 2);
		arrayCase[19] = new Case(19, "I", "R", 2);
		arrayCase[20] = new Case(20, "P", "N", 2);
		arrayCase[21] = new Case(21, "I", "R", 2);
		arrayCase[22] = new Case(22, "P", "N", 2);
		arrayCase[23] = new Case(23, "I", "R", 2);
		arrayCase[24] = new Case(24, "P", "N", 2);
		//Third intervals
		arrayCase[25] = new Case(25, "I", "R", 3);
		arrayCase[26] = new Case(26, "P", "N", 3);
		arrayCase[27] = new Case(27, "I", "R", 3);
		arrayCase[28] = new Case(28, "P", "N", 3);
		arrayCase[29] = new Case(29, "I", "N", 3);
		arrayCase[30] = new Case(30, "P", "R", 3);
		arrayCase[31] = new Case(31, "I", "N", 3);
		arrayCase[32] = new Case(32, "P", "R", 3);
		arrayCase[33] = new Case(33, "I", "N", 3);
		arrayCase[34] = new Case(34, "P", "R", 3);
		arrayCase[35] = new Case(35, "I", "N", 3);
		arrayCase[36] = new Case(36, "P", "R", 3);
		// SPECIAL CASE
		//color : red(37)-black(38)
		arrayCase[37] = new Case(37, null, "R", 4);
		arrayCase[38] = new Case(38, null, "N", 4);
		//parity : even(39) - odd(40)
		arrayCase[39] = new Case(39, "P", null, 4);
		arrayCase[40] = new Case(40, "I", null, 4);
		//intervals 1-12(41) 13-24(42) 25-36(43)
		arrayCase[41] = new Case(41, null, null, 1);
		arrayCase[42] = new Case(42, null, null, 2);
		arrayCase[43] = new Case(43, null, null, 3);
	}
		
		
}
