# AgrarAktionen

This code shows the content of an REST-API from a firm and act with Dependency Injections in a Application Server called [quarkus](https://quarkus.io) and shows the fetched data from a Database in a JavaFX-Application.

Database
===

To start the database in the docker subfolder: 
```bash
run the CsVDownloader.java
```

To insert Items Data manually: 
```bash
run api.rest application in the rest Folder
```

To reset the project and clean the database run
```bash
make clean
```

appsrv
===
This is the application server
See the [appsrv](./appsrv/README.md) subfolder for how to use CDI in Quarkus

www
===
see the www Subfolder for the javascript client

Cucumber Feature Tests and Code Coverage
===
see appsrc/src/test/resources for a feature test. To see the coverage report run the following:
~~~bash
cd ./appsrv
mvn clean compile test jacoco:report
~~~

Then open appsrv/target/site/jacoco/index.html.
As you see only Person has been tested. Contributions are welcome.

Example
===
http://localhost:8080/api/view

Coming soon: Working JavaScript Website with "Aktions" Data
