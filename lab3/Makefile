LAB_ID = Lab3

JAVAC = javac
JAVAC_FLAGS = -g

SRC_FILES = Test$(LAB_ID).java

JAVA  = java

CLASSPATH = ".;../lib/junit.jar"

compile:
	$(JAVAC) $(JAVAC_FLAGS) -cp $(CLASSPATH) *.java
	
tests:
	$(JAVA) -cp $(CLASSPATH) org.junit.runner.JUnitCore Test$(LAB_ID) 

clean:
	rm -f *.class

