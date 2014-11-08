// Import the browser widget and function.
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

// Extend the browser function.
public class HelloWorld extends BrowserFunction {
    // Class constructor.
    public HelloWorld(Browser browser, String name) {
        // Call parent constructor.
        super (browser, name);
    }

    @Override
    // Function logic.
    public Object function (Object[] arguments) {
        // Print text if there is anything to print.
        if (arguments.length >= 1) {
            System.out.println( "Hello " + arguments[0]);
        } else {
            System.out.println( "Function Hello called without parameters.");
        }
        return null;
    }
}