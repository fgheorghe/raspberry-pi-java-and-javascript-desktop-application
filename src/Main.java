// Import SWT.
import org.eclipse.swt.SWT;

// Import UI components.
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

// Import the browser component.
import org.eclipse.swt.browser.Browser;

// Create a class for instantiating the encapsulating Java application.
public final class Main {
    // Holds the Java window and its properties.
    private Display display;
    private Shell shell;
    private FillLayout layout;

    // Holds the browser widget.
    private Browser browser;

    // Application title and settings.
    private static final String title = "Sample JJR Application";
    private static final int height = 800;
    private static final int width = 600;

    // RIA location.
    private static final String URL = "http://localhost/";

    // Class constructor used for creating the basic Java UI, including the browser.
    public Main() {
        // Prepare window.
        this.display = new Display();
        this.shell = new Shell(this.display);
        this.shell.setSize(Main.width, Main.height);
        this.shell.setText(Main.title);
        this.layout = new FillLayout();
        this.shell.setLayout(this.layout);

        // Create browser.
        this.browser = new Browser(this.shell,SWT.NONE);
        this.browser.setUrl(Main.URL);

        // Add custom JavaScript function.
        new HelloWorld(
            this.browser, // Browser widget.
            "Hello" // JS function name.
        );

        // Display window.
        this.shell.open();
        while (!this.shell.isDisposed()) {
            if (!this.display.readAndDispatch())
                this.display.sleep();
        }
        this.display.dispose();
    }

    // Application entry point.
    public static void main(String[] args) {
        // Start the application.
        new Main();
    }
}