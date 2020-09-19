public class geo
{
    static double calRad = 57.29577951;
    static double forKms = 6371;
    //static double forMil = 3956;
    public static double distance(double latA, double lonA,double latB,double lonB){
        latA = latA / calRad;
        lonA = lonA / calRad;
        latB = latB / calRad;
        lonB = lonB / calRad;
        double dlon = lonB - lonA;
        double dlat = latB - latA;
        double cal1 = Math.pow(Math.sin(dlat/2),2) + Math.cos(latA) * Math.cos(latB) * Math.pow(Math.sin(dlon/2),2);
        double cal2 = 2 * Math.asin(Math.sqrt(cal1));
        return forKms * cal2;
    }

	public static void main(String[] args) {
		System.out.println(distance(1,2,3,4));
	}
}
