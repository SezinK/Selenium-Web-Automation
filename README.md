# Seleniun-Web-Otomation

This is a simple Maven project written in Java. It uses Selenium, JUnit, and Log4J libraries.
It simply opens a specific website so that some operations, like login process and seacrhing a word in the search box, can be done.

Before everything else, you need to install Selenium, using the link https://www.selenium.dev/downloads/ , JUnit, using the link https://search.maven.org/search?q=g:org.junit.jupiter%20AND%20v:5.7.2 , and Log4J, using the link https://logging.apache.org/log4j/2.x/download.html . You need to add these into your dependencies by simply clicking File>Project Structure>Modules>Dependencies>Add>JARs or Directories. Next, you need to click on Apply and OK. After that you need to write your dependencies into your pom.xml file. To write it, you can check the link https://www.selenium.dev/maven/ . Then, you need to download your browser driver. Since I am using Google Chrome, I downloaded the chrome driver, using the link https://sites.google.com/a/chromium.org/chromedriver/ . Now, you need to create a class under the src>test>java directory and you can start writing the code.
