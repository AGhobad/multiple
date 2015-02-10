 Given an integer, this program finds all multiples of 3 or 5 and returns sum of those multiples. For example:
* for integer 10, we have multiples of 3,6,9 for 3 and multiple 5 for 5. The total would be 23.


This project is a maven project and I have used junit for testing


To compile:
mvn clean compile
or manually compile by javac


to run:
java -cp target\classes com.quiz.multiple.Multiples 10

or 
runit.bat 10


javadoc:
 mvn javadoc:javadoc
(see target\site\apidocs)
or
javadoc -d target\classes\javadoc src\main\java\com\quiz\multiple\Multiples.java

to test:
mvn test
