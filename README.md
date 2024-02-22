# JULIP

JULIP is a prototyping software tool which takes static images on file and
runs them through adjustable image processing algorithms to easily construct code for
our teams FTC robotics classes.

## Running the application

Running the application from Gradle is the preferred method. 

### From Android Studio or Intellij

1. Open the project in Android Studio or Intellij
2. Open the Gradle tab on the right side of the window
3. Navigate to `julip -> Tasks -> application -> run`
4. Double click on `run`

### From the command line on Linux or Mac

1. Navigate to the root of the project
2. Run `./gradlew run`
3. The application should start

### From the command line on Windows

1. Navigate to the root of the project
2. Run `gradlew run`
3. The application should start

> Note: The first time you run the application, Gradle will download all the dependencies and build the project. This may take a few minutes.
> Subsequent runs will be faster.