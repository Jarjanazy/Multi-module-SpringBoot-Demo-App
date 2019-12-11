# Multi-module-SpringBoot-Demo-App
A simple Spring Boot application to demonstrate how multi-Module apps work.

The app uses the h2 database, which is an in-memory database.
The database records are populated using the jpa-repository in a class that implements the Spring CommandLineRunner interface.

The app has controllers.
    - home controller, which returns a static String
    - Human controller, which returns a list of all the Human objects in the database.

