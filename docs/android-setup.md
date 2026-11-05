# Entorno Android — Buena Fe

## Requisitos

- Android Studio compatible con Android Gradle Plugin 8.13.1.
- JDK 17.
- Android SDK Platform 36 y Build Tools instaladas desde SDK Manager.
- Emulador Android o dispositivo físico con Android 8.0 (API 26) o superior.
- Conexión a Internet para descargar dependencias Gradle.

## Abrir el proyecto

1. Abrir Android Studio.
2. Seleccionar **Open** y elegir la carpeta `android/` del repositorio.
3. Instalar los componentes del SDK que solicite Android Studio.
4. Ejecutar **Sync Project with Gradle Files**.
5. Crear o seleccionar un dispositivo virtual y ejecutar la configuración **app**.

## Compilación desde terminal

Desde la carpeta `android/`:

```bash
gradle wrapper --gradle-version 8.13
./gradlew :app:assembleDebug
```

En Windows PowerShell, ejecutar `gradlew.bat :app:assembleDebug`.

## Configuración inicial

- Namespace / applicationId: `com.sedergsoft.buenafe`.
- minSdk: 26.
- compileSdk / targetSdk: 36.
- Kotlin + Jetpack Compose + Material 3.
- JDK / bytecode target: 17.
- Catálogo centralizado de versiones: `gradle/libs.versions.toml`.

## Alcance de BF-003

Esta configuración establece una aplicación Android mínima que arranca con Jetpack Compose y aplica los colores base de Buena Fe. No implementa todavía navegación, consumo de API, autenticación ni reproducción multimedia.

## Validación pendiente

La compilación debe ejecutarse en un entorno con Android SDK instalado. El conector de GitHub permite registrar los archivos, pero no ejecuta Gradle ni sustituye la prueba local en Android Studio.
