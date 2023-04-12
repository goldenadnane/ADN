
L'application utilise un ensemble de bibliothèques Android Jetpack et Retrofit pour distribuer les données de l'API REST. L'application
utilise Kotlin.



Le projet a toutes les dépendances requises dans les fichiers gradle.


## Architecture

Le projet utilise le modèle d'architecture MVVM(Model View ViewModel).



[ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel/) - Gère les données liées à l'IU d'une manière consciente du cycle de vie et agit comme un canal entre les cas d'utilisation et l'interface utilisateur.
[ViewBinding] (https://developer.android.com/topic/libraries/data-binding) - bibliothèque de support qui permet de lier les composants de l'interface utilisateur dans les mises en page.
permet de lier les composants de l'interface utilisateur dans les présentations aux sources de données, de lier les détails des caractères et les résultats de la recherche à l'interface utilisateur.
de recherche à l'interface utilisateur
[Composant de navigation] (https://developer.android.com/guide/navigation/navigation-getting-started)
- Le composant de navigation de Android Jetpack aide à mettre en œuvre la navigation entre les fragments.
  [Dagger Hilt] (https://developer.android.com/jetpack/androidx/releases/hilt) - Pour l'injection de dépendances.

Injection.
[Paging 3] (https://developer.android.com/topic/libraries/architecture/paging/v3-overview?hl=in) - Permet la pagination des données.
Permet la pagination des données.
[Retrofit](https://square.github.io/retrofit/) - Pour accéder à l'Api Rest
[Kotlin Flow](https://developer.android.com/kotlin/flow) - Pour accéder aux données de manière séquentielle
[Datastore](https://developer.android.com/topic/libraries/architecture/datastore) - Pour stocker les données
dans des paires clé-valeur, dans ce cas pour stocker un booléen si la boîte de dialogue de non-responsabilité est affichée ou non
