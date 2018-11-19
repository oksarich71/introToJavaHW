public class Printer {
    private int numberOfSheets;
    private int toner;

    public Printer(int numberOfSheets, int toner) {
        this.numberOfSheets = 200;
        this.toner = 100;
    }

    public int copiesToPrint(int num, int copies) {
        int sheets = num * copies;
        if (this.numberOfSheets >= sheets) {

            return this.numberOfSheets - sheets;
        }
        return 0;
    }

    public int refill() {
        if (this.numberOfSheets <= 0) {
            return this.numberOfSheets + 200;
        }
        return this.numberOfSheets;
    }

    public int tonePaper(int numOfSheetsPrinted) {
        return this.toner - numOfSheetsPrinted;
    }
}




