# 🌀 Palindrome Spring Boot API

Este es un proyecto simple desarrollado con **Spring Boot** que permite detectar si una palabra es un **palíndromo**.

---

## 📚 ¿Qué es un palíndromo?

Un **palíndromo** es una palabra que se puede leer igual desde el inicio que desde el final.  
Ejemplos:
- ✅ `oso`
- ✅ `reconocer`
- ❌ `hola`

---

## 🚀 ¿Cómo funciona la API?

Esta API ofrece **dos formas de comprobar** si una palabra es palíndroma:

### 1. ✅ Versión texto plano
Devuelve un mensaje explicativo en formato string.

**URL de ejemplo:**
GET /palindromo/texto/oso

**Respuesta:**

La palabra "oso" es un palíndromo.

---

### 2. ✅ Versión JSON (usando DTO)
Devuelve la respuesta estructurada en formato JSON, útil para aplicaciones frontend o integraciones.

**URL de ejemplo:**

GET /palindromo/json/oso

**Respuesta:**
```json
{
  "word": "oso",
  "isPalindrome": true
}
```

🧠 Arquitectura del proyecto
El proyecto sigue las buenas prácticas de separación de responsabilidades:

src/
├── controllers/        → Lógica de enrutado HTTP (Petición del usuario)
│   └── PalindromeController.java
├── services/           → Lógica de negocio (detección de palíndromos)
│   └── PalindromeService.java
├── dtos/               → Objeto de transferencia de datos (JSON)
│   └── PalindromeResult.java

⚙️ Lógica utilizada para detectar palíndromos

```json
int init = 0;
int fin = word.length() - 1;

while (init < fin) {
    if (word.charAt(init) != word.charAt(fin)) {
        return false;
    }
    init++;
    fin--;
}
return true;
```

Esta función compara letra por letra desde los extremos hacia el centro para comprobar si son iguales.


💡 Tecnologías utilizadas
Java 17+

Spring Boot

Maven

🛠️ Cómo ejecutar el proyecto
Clona el repositorio:

```json
git clone https://github.com/cescalberola/palindromeSpringBoot.git
cd palindromeSpringBoot
```

Abre el proyecto en tu IDE (IntelliJ, Eclipse, VS Code, etc.)

Ejecuta la aplicación desde tu IDE o con Maven:

./mvnw spring-boot:run

Accede a la API:

http://localhost:8080/palindromo/texto/oso

http://localhost:8080/palindromo/json/oso

📄 Licencia
Este proyecto es de libre uso educativo y de práctica personal.


