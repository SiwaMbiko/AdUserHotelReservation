## AddUserHotelBooking

/*This section is intended to clarify the structureof the webtest, content of  this Selenium test

### Technologies used:
================================
java version "1.8.0_181"
IntelliJIDEA community edition
Selenium
TestNG:  For Ordering tests
Gradle: for project for build,execution & dependency management

### Supported Web Browsers
=======================
Google Chrome
Mozilla Firefox

** This webtest was scripted using a MAC book

##### Setup
=============
To run this project Clone the repository
It uses MAC Chromedriver instance located in ("user.dir/drivers/chromedriver)

### File Structure
====================
Files are located into different directories:
I have created the Web test using the Page Object Model
Packages: There are separate packages for Pages,Tests and the common classes. 
Tests are located in (/src/java/com.hotelbooking/......)
### Common Package
=================
BaseTest, GenerateData Class, TestData Interface

#### BaseClass
======================
This class holds all the functions that are commonly used by all pages. 

#### GenerateData Class
======================
Used to create functions to create common data to be used within the classes.


#### PageObjects Package:
====================
Contains classes with page elements

#### TestClass Package:
====================
Contains classes with test scripts

All the dependencies needed have been added under the build.gradle added dependencies
