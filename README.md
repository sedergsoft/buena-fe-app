# Buena Fe

Aplicación móvil y plataforma digital dedicada al grupo musical cubano Buena Fe.

El proyecto busca centralizar información biográfica y artística, discografía, canciones, noticias, conciertos y contenido multimedia autorizado, con una aplicación Android, una API REST y un panel web de administración.

> **Estado:** planificación y bootstrap inicial.  
> **Versión objetivo inicial:** MVP Android.

## Arquitectura prevista

- **Aplicación móvil:** Kotlin + Jetpack Compose, arquitectura MVVM.
- **Backend/API:** PHP + Yii2, API REST.
- **Base de datos:** MySQL.
- **Administración:** panel web basado en Yii2.
- **Multimedia:** almacenamiento de archivos y enlaces a plataformas externas autorizadas.
- **Control de versiones:** Git y GitHub.

## Estructura del repositorio

```text
buena-fe-app/
├── android/       # Aplicación Android (Kotlin / Jetpack Compose)
├── backend/       # API REST y lógica de negocio (Yii2)
├── admin/         # Panel web de administración (Yii2)
├── database/      # Modelo de datos, migraciones y datos de referencia
├── docs/          # Requisitos, arquitectura, planificación y API
├── assets/        # Recursos gráficos del proyecto
└── tests/         # Pruebas y evidencias de validación
```

## Principios de desarrollo

1. Mantener separadas la aplicación móvil, la API y la administración.
2. Documentar decisiones técnicas y cambios relevantes.
3. Priorizar seguridad, accesibilidad, rendimiento y mantenibilidad.
4. No publicar letras, grabaciones, fotografías, vídeos, logotipos ni otros materiales protegidos sin contar con los permisos correspondientes.
5. Utilizar enlaces a plataformas musicales oficiales cuando no exista autorización para alojar contenido directamente.
6. No incluir secretos, claves, contraseñas ni archivos de entorno reales en Git.

## Estado del proyecto

La primera fase comprende la preparación del repositorio, definición de arquitectura y diseño inicial. El desarrollo funcional comenzará después de validar la estructura y los requisitos.

Consulta la documentación de `docs/` para conocer el plan y las decisiones técnicas.
