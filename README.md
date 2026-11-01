
# 🔌 Demo API Testing: Java MySQL Connection

My first GitHub project. A Java program that connects to a **MySQL** database using **JDBC** and checks whether the connection works.

## 🎯 What This Project Shows
- Connecting a Java program to MySQL with JDBC
- Handling connection errors with try-catch (`SQLException`)
- Keeping database credentials out of the code using environment variables
- Uploading code to GitHub for the first time

## 🛠️ Tech Stack
Java, JDBC, MySQL, Git & GitHub

## 📂 Project Structure
```
DEMOAPITESTING/
├── Mydb.java      # Connects to the database and prints the result
├── .gitignore
└── README.md
```

## 🔗 How the Connection Works
1. `DriverManager.getConnection(url, user, password)` opens a connection to the `demodb` database on `localhost:3306`.
2. If it works, the program prints **"Connected to the database successfully"**.
3. If it fails, a `SQLException` is caught and the reason is printed.
4. `try-with-resources` closes the connection automatically.

```java
try (Connection connection = DriverManager.getConnection(url, user, password)) {
    System.out.println("Connected to the database successfully");
} catch (SQLException e) {
    System.out.println("Error while connecting to the database: " + e.getMessage());
}
```

## 🧪 Testing

| Test | Result |
|------|--------|
| Correct URL, user and password | Prints "Connected to the database successfully" |
| Wrong password | Prints an error with the reason |
| MySQL server not running | Prints an error with the reason |


## ▶️ How to Run
1. Install **Java (JDK 21 ) ** and **MySQL**.
2. Create the database in MySQL:
   ```sql
   CREATE DATABASE demodb;
   ```
3. Download the **MySQL Connector/J** JAR (`mysql-connector-j`) and add it to the classpath (in Eclipse: Build Path, then Add External JARs).
4. Set these environment variables:
   ```
   DB_URL=jdbc:mysql://localhost:3306/demodb
   DB_USER=your_username
   DB_PASSWORD=your_password
   ```
5. Run `Mydb.java`.

## 💡 What I Learned
- How JDBC connects Java to a database
- Using try-catch to handle connection errors
- Why passwords should never be written in code
- How to upload a project to GitHub (git add, commit, push)

## 🚀 Next Steps
- Create a table and add insert, read, update and delete operations
- Use `PreparedStatement` for safe queries
- Build a REST API with Spring Boot and test it in Postman

## 👩‍💻 Author
**Komal Jasapara**
MERN Stack Developer | Former Computer Science Teacher
