import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 100);
    }

    @Test
    public void printCopies() {
        assertEquals(180, printer.copiesToPrint(10,2));
    }

    @Test
    public void refillPrinter() {
        printer = new Printer(0, 100);
        assertEquals(200, printer.refill());
    }
    @Test
    public void reduceToner() {
        assertEquals(80, printer.tonePaper(20));
    }
}
