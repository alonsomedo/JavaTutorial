public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        System.out.println(kilometersPerHour + " kilometersPerHour equals to " + milesPerHour + " milesperHour");
        return milesPerHour;
    }

}
