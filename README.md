📌 Maven Calculator
A personal project to learn and implement CI/CD pipelines, DevOps practices, and Java/Maven project workflows.

✅ Features
Built using Java with a command-line interface

Managed with Maven for build and dependency control

Tested with JUnit for unit testing

Automated build and test using Jenkins CI/CD pipelines

Integrated SonarQube for static code analysis

Designed for hands-on learning of DevOps and CI/CD concepts

🛠️ Tech Stack
Java – Core application logic
Maven – Build tool and dependency management
JUnit – Testing framework
Jenkins – Continuous Integration / Continuous Delivery
SonarQube – Code quality analysis
Git/GitHub – Version control and project hosting

📁 Project Structure

Maven-Calculator/
├── src/
│   ├── main/java/com/calculator/Calculator.java
│   └── test/java/com/calculator/CalculatorTest.java
├── pom.xml
├── README.md
└── Jenkinsfile (optional)

⚙️ Setup Instructions
1. Clone the Repository

git clone https://github.com/OmkarNarvekar001/Maven-Calculator.git
cd Maven-Calculator

2. Install Requirements
Java JDK 17+

Apache Maven

Git

(Optional) Jenkins

(Optional) SonarQube

3. Build the Project
bash
Copy
Edit
mvn clean install
4. Run Unit Tests
mvn test
5. Run the Application

java -cp target/maven-calculator-1.0-SNAPSHOT.jar com.calculator.Calculator
Make sure the package and class name match your project.

🔁 CI/CD Pipeline (Optional)
If you're using Jenkins for CI/CD:

Create a new Pipeline project in Jenkins

Add your GitHub repository URL

Use the following basic Jenkinsfile:

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
    }
}
Make sure Jenkins is configured with Maven and SonarQube plugins.

🎯 Learning Goals
Understand Java + Maven project structure

Implement unit testing using JUnit

Automate build/test with Jenkins pipelines

Analyze code quality using SonarQube

Explore real-world DevOps & CI/CD workflows

🤝 Contributing
This is a self-learning project.
Feel free to fork the repo, improve it, and open a pull request.
