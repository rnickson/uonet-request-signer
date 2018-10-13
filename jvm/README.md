# Uonet+ request signer for JVM

[![](https://jitpack.io/v/wulkanowy/uonet-request-signer.svg)](https://jitpack.io/#wulkanowy/uonet-request-signer)

## Instalation

```grovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.wulkanowy:uonet-request-signer:master-SNAPSHOT'
}
```

## Usage

```kotlin
import io.github.wulkanowy.signer.signContent

val signed = signContent(password, certificate, content)
```

## Tests

```bash
$ ./gradlew test
```
