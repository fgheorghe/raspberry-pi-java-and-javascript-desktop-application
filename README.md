raspberry-pi-java-and-javascript-desktop-application
====================================================

Raspberry PI application using the JJR application architecture.

Requirements:
sudo apt-get install libswt-gtk-3-jni libswt-gtk-3-jav libswt-webkit-gtk-3-jni

Notes:
To test JavaScript integration, start a local HTTP (Apache/Nginx) server and place html/index.html
in its document root, or update the static Main class URL property to point to a different domain.

Mac:
Download Java SWT and update Makefile and mac/Manifest files to point to the library path:
http://download.eclipse.org/eclipse/downloads/drops4/R-4.4-201406061215/

To compile and execute the application on Mac use:
make all-mac && java -XstartOnFirstThread -jar ./bin/app.jar

To compile and execute the application on Raspbian use:
make all && java -jar ./bin/app.jar