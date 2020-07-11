DEBUG_5005=-Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"

RUN=mvn spring-boot:run

run:
	$(RUN) $(INVISIBLE) $(DEBUG_5005)

run-tests:
	mvn clean test -Dspring-boot.run.profiles=test
