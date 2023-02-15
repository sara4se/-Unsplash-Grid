# Unsplash Grid

## :scroll: Description

This application displays a grid of [Unsplash](https://unsplash.com) images retrieved from a REST API. It's built following Android
best practices.

#### Used architecture:

Model-view-viewmodel (MVVM)

## App layers:

* **Presentation:** using [Jetpack Compose](https://developer.android.com/jetpack/compose).
* **DI:** using [Dagger Hilt](https://dagger.dev/hilt).
* **Domain:** using [Retrofit](https://square.github.io/retrofit) to handle the API calls and Retrofit-Gson for serialization and
  deserialization.
* **Data:** mapping data from the API and implementing ImageRepository.

### Used tech/tools:

* UI: Jetpack Compose.
* [Compose Coil](https://coil-kt.github.io/coil/compose) for managing the asynchronous image request and handling UI changes in the following UI states:
* loading with placeholder retrieved from drawable.
* error message in case of server connection failure.
* success showing images.
* Dependency injection: Dagger Hilt.
* Android architecture components (Lifecycle, ViewModel).
* Kotlin Flows and Coroutines.
* Network: Retrofit and Gson.

 
