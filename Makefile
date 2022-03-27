default: .help

lint:
	@ mvn clean compile checkstyle:check spotbugs:check

test:
	@ mvn clean verify

check: lint test

.help:
	@echo "\n\
	Help:\n\
	=========================\n\
	make test - run all tests \n\
	make lint - code analysis \n\
	"
