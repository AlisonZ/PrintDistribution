public class Main {
    public static int[] distribution = {0,1,8,59,215,703,1848,3975,8077,13937,22195,31628,
            41711,51099,57142,59959,59670,55756,48850,40931,32583,
            24995,18217,12794,8623,5577,3601,2272,1259,764,464,246,
            153,80,39,22,12,6,3,0};

    public static String yAxisCounter = "| ";
    public static int starNumber(int count) {
        return count/1000;
    }

    public static int getArrayMax() {
        int maxNum = distribution[0];
        for(int i = 0; i < distribution.length; i++) {
            if(distribution[i] > maxNum) {
                maxNum = distribution[i];
            }
        }
        return maxNum;
    }
    
    public static void main(String[] args) {
        int arrayMax = getArrayMax();
        int xAxisNumberOfMarkers = arrayMax/10000 + 1;
        System.out.print(" ".repeat(4));
        for(int i = 0; i < xAxisNumberOfMarkers + 1; i++) {
            if ( i == 0 ) {
                System.out.printf(i * 10000 + " ".repeat(8));
            } else {
                System.out.printf(i * 10000 + " ".repeat(4));
            }
        }
        System.out.println();

        System.out.print(" ".repeat(4));
        for(int i = 0; i < xAxisNumberOfMarkers + 1; i++) {
            System.out.printf("|" + " ".repeat(8));
        }
        System.out.println();

        System.out.print(" ".repeat(4));
        for(int i = 0; i < xAxisNumberOfMarkers; i++) {
            System.out.printf("-".repeat(10));
        }
        System.out.println();


        for ( int i = 0; i < distribution.length; i++)
            if( i % 10 == 0 ) {
                if (i == 0) {
                    System.out.printf( i + " ".repeat(3) + yAxisCounter);
                    System.out.println( "*" +  "*".repeat(starNumber(distribution[i])));
                } else {
                    System.out.printf( i + "  " + yAxisCounter);
                    System.out.println( "*" +  "*".repeat(starNumber(distribution[i])));
                }

            } else {
                System.out.printf(" ".repeat(4) + yAxisCounter);
                System.out.println( "*" +  "*".repeat(starNumber(distribution[i])));
            }
    }
}
