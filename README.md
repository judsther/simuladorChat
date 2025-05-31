# ChatList - Proyecto en Java (POO) - Judith Guardado

Este proyecto es una simulación de un sistema de mensajería simple implementado con los principios de Programación Orientada a Objetos (POO) en Java. Utiliza estructuras de datos personalizadas para gestionar una lista de mensajes.

## 📁 Estructura del Proyecto

chatList/
├── src/

│ └── com.kodigo.chat/

│ ├── application/


│ ├── datastructure/

│ ├── model/

│ ├── service/

│ └── DiagramaClases.pdf

├── README.md


└── ChatList.iml


## 🧱 Clases principales

- **IMessage**: Interfaz que define el comportamiento común de los mensajes.
- **Message**: Clase base que representa un mensaje con contenido, remitente y fecha.
- **TextMessage**: Subclase de `Message` que implementa `IMessage`.
- **User**: Representa a un usuario con un ID y nombre.
- **MessageNode** y **MessageLinkedList**: Implementan una lista enlazada personalizada para almacenar mensajes.
- **ChatService**: Contiene la lógica para enviar, almacenar y listar mensajes.
- **Main**: Punto de entrada de la aplicación.

## 🧪 Cómo ejecutar

1. Abrí el proyecto en IntelliJ IDEA.
2. Asegurate de que la clase `Main` tenga el método `main()` correctamente definido.
3. Ejecutá el proyecto desde la clase `Main`.

## 🛠️ Tecnologías utilizadas

- Java 17+
- IntelliJ IDEA
- PlantUML (para generar el diagrama de clases)

## 🖼️ Diagrama de Clases

Se encuentra en el archivo `DiagramaClases.puml`. Puede ser visualizado desde IntelliJ con el plugin PlantUML.
