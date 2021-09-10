public class GreatestCommonDivisor {

    //Version 1 using for loops:
  
    /*
    public static int getGreatestCommonDivisor(int first, int second) {


        if ((first < 1) || (second < 1)) {
            return -1;
        } else if (first == second) {
            return first;
        } else if (first < second) {
            for (int i = second / 2; i >= 1; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        } else {
            for (int i = first / 2; i >= 1; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;

                }
            }
        }
        return -1;
    }
     */

  
    //Version 2 using while loops:

    public static int getGreatestCommonDivisor(int first, int second) {


        if ((first < 1) || (second < 1)) {
            return -1;
        } else if (first <= second){
            int divisor1 = first;
            while (divisor1 >= 1){
                if ((first % divisor1 == 0) && (second % divisor1 == 0)){
                    return divisor1;
                }
                divisor1--;
            }

        } else if (second <= first){
            int divisor2 = second;
            while (divisor2 >= 1){
                if((first % divisor2 == 0) && (second % divisor2 == 0)){
                    return divisor2;
                }
                divisor2--;
            }
        }
        return -1;
    }
}
