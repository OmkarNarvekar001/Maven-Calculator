📌 Maven Calculator
A personal project built to understand and implement CI/CD practices using a Java-based command-line calculator.

✅ Features
🔢 Built with Java for core functionality
⚙️ Managed project dependencies with Maven
🧪 Added unit tests using JUnit
🔄 Set up Jenkins CI/CD pipeline to automate build and test processes
🧼 Integrated SonarQube for code quality analysis
📚 Designed for learning DevOps workflows

🔧 Tech Stack
Java – Application logic
Maven – Build tool & dependency manager
JUnit – Unit testing
Jenkins – CI/CD pipeline automation
SonarQube – Static code analysis
Git/GitHub – Version control & hosting

📁 Folder Structure
Maven-Calculator/
├── src/
│   ├── main/java/com/calculator/Calculator.java
│   └── test/java/com/calculator/CalculatorTest.java
├── pom.xml
├── README.md
└── Jenkinsfile (optional)

⚙️ How to Set Up Locally
📥 Clone the repository
git clone https://github.com/OmkarNarvekar001/Maven-Calculator.git
cd Maven-Calculator

📋 Install prerequisites
Java JDK 17+
Apache Maven
Git
(Optional) Jenkins & SonarQube

🔨 Build the project
mvn clean install

🧪 Run unit tests
mvn test

▶️ Run the calculator
java -cp target/maven-calculator-1.0-SNAPSHOT.jar com.calculator.Calculator

🔄 CI/CD Pipeline (Optional)
Set up a Jenkins pipeline and connect it to your GitHub repo

Use a basic Jenkinsfile like:
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

🎯 What I Learned
📦 Structuring Java applications with Maven
🧪 Writing unit tests with JUnit
🔁 Automating builds and tests using Jenkins
🧼 Monitoring code quality with SonarQube
🚀 Applying DevOps & CI/CD practices to Java development

🤝 Contributions
This project was built for personal learning. Feel free to fork the repository and suggest improvements via pull requests!
