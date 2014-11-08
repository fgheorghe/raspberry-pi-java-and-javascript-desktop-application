# Build for Raspbian by default.
all: all-raspbian

# Build process for Raspbian.
all-raspbian: compile-raspbian jar-raspbian clean

# Compiling for Raspbian.
compile-raspbian:
	# Update the raspbian/Manifest file if changing this path.
	cd src && javac -classpath /usr/share/java/swt-gtk-3.8.jar:. Main.java

# Building Jar for Raspbian.
jar-raspbian:
	cd src && cp raspbian/Manifest ./ && jar -cfm ../bin/app.jar Manifest Main.class HelloWorld.class
	# Run using: java -jar ./bin/app.jar

# Build process for MacOS.
all-mac: compile-mac jar-mac clean

# Compiling for Mac.
compile-mac:
	# If compile fails, download required libraries from:
	# http://download.eclipse.org/eclipse/downloads/drops4/R-4.4-201406061215/
	# Update the mac/Manifest file if changing this path.
	cd src && javac -classpath ~/Downloads/swt-4.4-cocoa-macosx-x86_64/swt.jar:. Main.java

# Building Jar for Mac.
jar-mac:
	# If your application fails to start with a class not found exception,
	# update the mac/Manifest library path (~ might not work).
	cd src && cp mac/Manifest ./ && jar -cfm ../bin/app.jar Manifest Main.class HelloWorld.class
	# Run using: java -XstartOnFirstThread -jar ./bin/app.jar

# Clean the src directory - remove temporary build files.
clean:
    # Removing compile time files.
	cd src && rm *.class Manifest
