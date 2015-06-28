raspberry-pi-java-and-javascript-desktop-application
====================================================

Raspberry PI application using the JJR application architecture:
http://grosan.co.uk/raspberry-pi-java-and-javascript-desktop-applications-jjr-architecture/

Assumes Java is installed.

# Install other dependencies #

sudo apt-get install libswt-gtk-3-jni libswt-gtk-3-java libswt-webkit-gtk-3-jni

Notes:

To test JavaScript integration, start a local HTTP (Apache/Nginx) server and place html/index.html
in its document root, or update the static Main class URL property to point to a different domain.

# Compile and run #

To compile and execute the application on Raspbian use:

make all && java -jar ./bin/app.jar

To compile and execute the application on Mac use:

make all-mac && java -XstartOnFirstThread -jar ./bin/app.jar

Mac notes:
Download Java SWT and update Makefile and mac/Manifest files to point to the library path:

http://download.eclipse.org/eclipse/downloads/drops4/R-4.4-201406061215/
