class PharaseOMatic{
	
	public static void main(String[] arf){

		String[] wordList1 = {"Bottle","Pen","Bandar","Pencil","Julu","Solu","24/7"};
		String[] wordList2 = {"5.5ft","GRP","Java","Khajuri","Android Developer"};
		String[] wordList3 = {"Flutter Dev","copy","Notebook","domes","Glass"};

		int len1= wordList1.length;
		int len2= wordList2.length;
		int len3= wordList3.length;

		int random1 = (int)((Math.random())*(len1));
		int random2 = (int)((Math.random())*(len2));
		int random3 = (int)((Math.random())*(len3));

		String phrase = wordList1[random1] +" " + wordList2[random2] + " " +wordList3[random3];

		System.out.println("Your magical pharse is : " + phrase);
	}
}