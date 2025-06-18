# Student Record Management

This project is a Student Record Management System built using Java with Spring Boot for the backend and React for the frontend. It utilizes MongoDB as the database to store student records.

## Project Structure

- **backend/**: Contains the backend code for the application.
  - **src/**: Source code for the Spring Boot application.
    - **main/**: Main application files.
      - **java/com/example/student/**: Java package containing the application logic.
        - **StudentApplication.java**: Main entry point of the Spring Boot application.
        - **controller/**: Contains the controllers for handling HTTP requests.
          - **StudentController.java**: Manages student-related requests.
        - **model/**: Contains the data model for the application.
          - **Student.java**: Represents the student entity.
        - **repository/**: Contains the data access layer.
          - **StudentRepository.java**: Interface for CRUD operations on student records.
      - **resources/**: Contains application configuration files.
        - **application.properties**: Configuration settings for the Spring Boot application.
  - **pom.xml**: Maven configuration file listing project dependencies.

- **amna/**: Contains the frontend code for the application.
  - **public/**: Public assets for the React application.
    - **index.html**: Main HTML file for the frontend.
  - **src/**: Source code for the React application.
    - **App.js**: Main React component that renders the application.
    - **components/**: Contains reusable components.
      - **StudentForm.js**: Component for adding and editing student records.
  - **package.json**: Configuration file for npm, listing dependencies and scripts.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- Node.js and npm
- MongoDB

### Backend Setup

1. Navigate to the `backend` directory.
2. Update the `application.properties` file with your MongoDB connection details.
3. Run the application using Maven:
   ```
   mvn spring-boot:run
   ```

### Frontend Setup

1. Navigate to the `amna` directory.
2. Install the dependencies:
   ```
   npm install
   ```
3. Start the React application:
   ```
   npm start
   ```

## Features

- Add, update, and delete student records.
- View student details.
- Responsive frontend built with React.

## License

This project is licensed under the MIT License.