# Plan de desarrollo por tareas

Versión: 1.0

## Etapas

1. Preparación y diseño.
2. Base de datos y backend.
3. Panel de administración.
4. Aplicación móvil Android.
5. Integración y pruebas.
6. Preparación y validación de contenidos y derechos.
7. Publicación.
8. Funcionalidades comerciales posteriores.

## Primera etapa — Preparación y diseño

| ID | Tarea | Prioridad | Dependencias |
|---|---|---|---|
| BF-001 | Crear el repositorio Git del proyecto | Crítica | Ninguna |
| BF-002 | Definir la estructura de carpetas y módulos | Crítica | BF-001 |
| BF-003 | Configurar el entorno de desarrollo Android | Crítica | BF-001 |
| BF-004 | Configurar el entorno PHP y Yii2 | Crítica | BF-001 |
| BF-005 | Definir la arquitectura del sistema | Crítica | BF-002 |
| BF-006 | Diseñar la identidad visual | Alta | BF-005 |
| BF-007 | Diseñar las pantallas principales | Alta | BF-006 |
| BF-008 | Definir la navegación de la aplicación | Alta | BF-007 |

## Criterios de aceptación de BF-002

- Las carpetas principales están creadas.
- La responsabilidad de cada módulo está documentada.
- El README explica el propósito, las tecnologías y la estructura.
- El .gitignore excluye artefactos, secretos y archivos locales.
- La estructura no acopla el código Android al backend.

## Próximas tareas

Una vez revisada y aceptada esta estructura, continuar con BF-003 y BF-004, y luego documentar la arquitectura detallada en BF-005.
