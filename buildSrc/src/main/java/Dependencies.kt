class Dependencies {
    companion object {
        private val KOIN_VERSION = "2.0.0-rc-2"
        private val GSON_VERSION = "2.8.5"
        private val CARD_VIEW_VERSION = "1.0.0"
        private val CONSTRAINT_VERSION = "1.1.3"
        private val ESPRESSO_VERSION = "3.2.0"
        private val JUNIT_EXT_VERSON = "1.1.1"
        private val ANDROID_CORE_VERSION = "1.2.0"
        private val SUPPORT_LIB_VERSION = "1.0.0"
        private val KOTLIN_VERSION = "1.3.61"
        private val RECYCLER_VIEW_VERSION = "1.1.0"
        private val NAV_VERSION = "2.2.0"


        val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$KOTLIN_VERSION"
        val supportAppCompat = "androidx.appcompat:appcompat:$SUPPORT_LIB_VERSION"

        val androidCore = "androidx.core:core-ktx:$ANDROID_CORE_VERSION"

        val junit = "junit:junit:4.12"
        val junitExt = "androidx.test.ext:junit:$JUNIT_EXT_VERSON"

        val espresso = "androidx.test.espresso:espresso-core:$ESPRESSO_VERSION"

        val constraintLayout = "androidx.constraintlayout:constraintlayout:$CONSTRAINT_VERSION"
        val recyclerView = "androidx.recyclerview:recyclerview:$RECYCLER_VIEW_VERSION"
        val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
        val materialSupport = "com.google.android.material:material:1.1.0"

        val cardView = "androidx.cardview:cardview:$CARD_VIEW_VERSION"
        val circleImageView = "de.hdodenhof:circleimageview:3.1.0"

        val navComp = "androidx.navigation:navigation-fragment-ktx:" + NAV_VERSION
        val navCompUI = "androidx.navigation:navigation-ui-ktx:" + NAV_VERSION

        val gson = "com.google.code.gson:gson:" + GSON_VERSION

        val koin = "org.koin:koin-android:" + KOIN_VERSION
        val koinScope = "org.koin:koin-androidx-scope:" + KOIN_VERSION
        val koinViewModel = "org.koin:koin-androidx-viewmodel:" + KOIN_VERSION

    }


}