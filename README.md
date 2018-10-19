# Minimal Android Boilerplate

The android minimal boilerplate project is intended to be a getting started project having the
following elements already configured:

- Small lightweight framework for MVP
- Architecture components and design with AndroidX
- Dagger with a minimal configuration
- Database with Room and injected with dagger
- Stetho tools for debug builds
- Testing configuration and libraries
- Retrofit with okhttp

All of this is configured in 2 different modules:
- miniplate-sdk: contains all the business logic (data, network, interactors and repositories)
and cannot contain any view related code
- miniplate-app: contains all the UI code and imports the miniplate-sdk and its libraries to execute
the business logic

The project is already fully configured with gradle, Android Studio and the latest versions of
the libraries as of the last commit.

To run the application use:
```aidl
# For devDebug
$ ./gradlew installDevDebug

# For devRelease
$ ./gradlew installDevRelease

# For prodDebug
$ ./gradlew installProdDebug

# For prodRelease
$ ./gradlew installProdRelease

```