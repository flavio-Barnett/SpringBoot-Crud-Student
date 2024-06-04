# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo jar al contenedor
COPY target/TA-PROGRAMACION-2-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 3009

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
