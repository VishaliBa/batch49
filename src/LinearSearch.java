public class LinearSearch {
    public static boolean linearSearch(int[] table, int value) {
        for(int index = 0; index < table.length ; index++ ) {
            int tableValue = table[index];
            if (tableValue == value) {
                return true;
            }
        }
        return false;
    }
}

