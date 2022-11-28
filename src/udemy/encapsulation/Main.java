package udemy.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(25, false);
        System.out.println("Initial page count : " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was : " + pagesPrinted + " new total print count of printed pages : " + printer.getPagesPrinted());
         pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was : " + pagesPrinted + " new total print count of printed pages : " + printer.getPagesPrinted());
    }
}
