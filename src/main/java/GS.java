public class GS {

    private static void computeNumberTradesSizes() {
        int booklevels = 3;
        int numCols = 2;
        int totalTradeSizes = 0;
        for (int i = 0; i < booklevels; i++)
            for (int j = 0; j < numCols; j++) ;
        totalTradeSizes++;
        System.out.println("Trade Sizes " + totalTradeSizes);
    }

    private static void getMinValue() {
        int currentMin = 0;
        int[] values = new int[] {8,2,9,200,4,1};
        for (int i = 0; i < values.length; i++)
            currentMin = values[i];
        System.out.println("The minimum value is: " + currentMin);
    }

    public static void main (String[] args) {

        computeNumberTradesSizes();
        getMinValue();
    }
}
