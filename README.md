# gradle-monorepo-example

An example of building projects in a monorepo using [Gradle Composite Builds](https://docs.gradle.org/current/userguide/composite_builds.html).

## Repository Structure
The repository contains four projects each with their own Gradle configurations.

Projects A, B, and C have dependencies on one another:

    [project-a] -- DEPENDS --> [project-b] -- DEPENDS --> [project-c]
    
Project D has no dependencies on the other projects:
    
    [project-d]

## Running the Example
Follow the steps below to run the example:

### Build Project A
Run the following commands to build [project-a](project-a):

1. Change the working directory to [project-a](project-a):

        ./gradlew project-a:build
        
2. Run the following command to generate classes for the project:

        ./gradlew classes --info
        
### Build Project D
Run the following commands to build [project-d](project-d):

1. Change the working directory to [project-d](project-d):

        ./gradlew project-d:build
        
2. Run the following command to generate classes for the project:

        ./gradlew classes --info
        
        
## Working in IntelliJ
IntelliJ supports Gradle Composite Builds and will automatically open any included builds for a project.



