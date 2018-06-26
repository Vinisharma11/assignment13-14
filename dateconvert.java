import java.util.*;

 class dateconvert{

	public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> yr1 = new HashMap<String, String>();
	public static HashMap<String, String> yr2 = new HashMap<String, String>();

	public static void datesinfo() {
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Nineth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Tweleveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twent Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Nineth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		yr1.put("16", "Sixteen hundred");
		yr1.put("17", "Seventeen hundred");
		yr1.put("18", "Eighteen hundred");
		yr1.put("19", "Nineteen hundred");
		yr1.put("20", "Two thousand");
		
		yr2.put("00"," ");
		yr2.put("10", "Ten");
		yr2.put("20", "Twenty");
		yr2.put("30", "Thirty");
		yr2.put("40", "Forty");
		yr2.put("50", "Fifty");
		yr2.put("60", "Sixty");
		yr2.put("70", "Seventy");
		yr2.put("80", "Eighty");
		yr2.put("90", "Ninety");
		yr2.put("98", "Ninety Eight");
		yr2.put("92", "Ninety two");
		yr2.put("95", "Ninety five");
		yr2.put("97", "Ninety Seven");
	}

	public static String convertdate(String dt) {
		String d = dt.substring(0, 2);
		String m = dt.substring(3, 5);
		String yL = dt.substring(6, 8);
		String yR = dt.substring(8, 10);
		return date.get(d) + " " + month.get(m) + " " + yr1.get(yL) + " " + yr2.get(yR);
	}

	public static void main(String args[]) {

		datesinfo();

		System.out.println("Enter date in dd-mm-yy format");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(str);
		System.out.println(convertdate(str));


	}
}
