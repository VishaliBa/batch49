import java.text.SimpleDateFormat;
import java.util.Date;

public class Pen {

    public static void main(String[] args) {

       greet();
       greet2();
       greet3();
    }

    public static void greet() {

        System.out.println(getDateInMyFormat(DateFormat.FORMAT_ONE));
    }

    public static void greet2() {
        System.out.println(getDateInMyFormat(DateFormat.FORMAT_TWO));
    }

    public static void greet3() {
        System.out.println(getDateInMyFormat(DateFormat.FORMAT_THREE));
    }

    public static String getDateInMyFormat(DateFormat dateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat.toString());
        Date date = new Date();
        return formatter.format(date);
    }

    enum DateFormat {
        FORMAT_ONE("dd/MM/yyyy HH:mm:ss"),
        FORMAT_TWO("HH:mm:ss"),
        FORMAT_THREE("dd-MM-yyyy")
        ;

        private final String text;

        /**
         * @param text
         */
        DateFormat(final String text) {
            this.text = text;
        }

        /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return text;
        }
    }
}


