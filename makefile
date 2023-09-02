#JAVA_HOME = /opt/sun/jdk15

JAVA_HOME = /opt/jdk/jdk17
GRADLE_HOME = /opt/gradle/gradle-7.2

#GRADLE = $(GRADLE_HOME)/bin/gradle
exp = JAVA_HOME=$(JAVA_HOME)

clean:
	./gradlew clean

tags:
	rm -f TAGS;
	find ../aqua -name "*.java" | xargs etags -a

build:
	./gradlew build

default: run

run:
	./gradlew run

test:
	gradle test --tests AppTest
