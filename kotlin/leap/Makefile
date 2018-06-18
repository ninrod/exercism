.PHONY: build run test

build:
	gradle build --build-file artifactory.gradle
run:
	gradle run --build-file artifactory.gradle
test:
	gradle test --build-file artifactory.gradle

deploy:
	exercism submit src/main/kotlin/Year.kt
