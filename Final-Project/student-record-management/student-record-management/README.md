# Student Record Management System

This project is a Student Record Management System built using Java with Spring Boot for the backend and React for the frontend. It allows users to manage student records, including creating, reading, updating, and deleting student information.

## Project Structure

The project is organized into two main parts: the backend and the frontend.

### Backend

The backend is developed using Spring Boot and MongoDB. It consists of the following components:

- **StudentApplication.java**: The main entry point of the Spring Boot application.
- **StudentController.java**: Handles HTTP requests related to student records.
- **Student.java**: Represents the student entity with properties such as id, name, age, and email.
- **StudentRepository.java**: Interface for CRUD operations on student records.
- **application.properties**: Configuration settings for the Spring Boot application, including MongoDB connection details.
- **pom.xml**: Maven configuration file listing project dependencies.

### Frontend

The frontend is developed using React. It consists of the following components:

- **index.html**: The main HTML file serving as the entry point for the web application.
- **App.js**: The main React component that renders the application and manages routing and state.
- **StudentForm.js**: A component providing a form for adding and editing student records.

## Getting Started

To run the project, follow these steps:

### Backend

1. Navigate to the `backend` directory.
2. Ensure you have Java and Maven installed.
3. Configure your MongoDB connection in `application.properties`.
4. Run the application using the command:
   ```
   mvn spring-boot:run
   ```

### Frontend

1. Navigate to the `amna` directory.
2. Ensure you have Node.js and npm installed.
3. Install the dependencies using the command:
   ```
   npm install
   ```
4. Start the frontend application using the command:
   ```
   npm start
   ```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.