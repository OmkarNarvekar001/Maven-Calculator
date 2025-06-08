📌 Project Overview
This is a personal learning project developed to gain hands-on experience with CI/CD pipelines, DevOps practices, and Java development workflows. The core application is a simple command-line calculator written in Java, structured as a Maven project. It includes unit tests with JUnit, a Jenkins pipeline for CI/CD, and uses SonarQube for static code analysis.

This project serves as a practical implementation of how Java-based applications can be built, tested, and analyzed automatically using modern DevOps tools.

🚀 Features
Java-based CLI calculator with basic arithmetic operations

Project structured using Maven

Unit testing with JUnit

CI/CD pipeline using Jenkins (automated build + test)

Code quality analysis with SonarQube

Designed as a sandbox to experiment with DevOps workflows

🛠️ Tech Stack
Tool/Technology	Purpose
Java	Core language for application logic
Maven	Build automation, dependency management
JUnit	Unit testing framework
Jenkins	Continuous Integration/Delivery
SonarQube	Static code analysis and quality checks
Git/GitHub	Source control and project hosting

🧑‍💻 Project Structure
bash
Copy
Edit
Maven-Calculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/calculator/
│   │           └── Calculator.java
│   └── test/
│       └── java/
│           └── com/calculator/
│               └── CalculatorTest.java
├── pom.xml
├── Jenkinsfile (optional)
└── README.md
⚙️ Setup Instructions
Follow these steps to clone, build, and run the project locally:

1. 📥 Clone the Repository
bash
Copy
Edit
git clone https://github.com/OmkarNarvekar001/Maven-Calculator.git
cd Maven-Calculator
2. 🧰 Prerequisites
Ensure the following are installed on your machine:

Java JDK (17 or higher recommended)

Apache Maven

Git

Jenkins (for CI/CD pipeline)

SonarQube (optional, for code analysis)

3. 🔨 Build the Project
bash
Copy
Edit
mvn clean install
4. 🧪 Run Unit Tests
bash
Copy
Edit
mvn test
5. ▶️ Run the Application
bash
Copy
Edit
java -cp target/maven-calculator-1.0-SNAPSHOT.jar com.calculator.Calculator
Replace com.calculator.Calculator with your actual main class if different.

🔄 CI/CD Pipeline (Optional)
If you'd like to automate the build & test process:

Install Jenkins and configure a new freestyle or pipeline project.

Add your GitHub repository URL to Jenkins.

Use the following simple Jenkinsfile (optional):

groovy
Copy
Edit
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
                // Requires proper SonarQube plugin & config
                sh 'mvn sonar:sonar'
            }
        }
    }
}
Integrate SonarQube with Jenkins to run code quality analysis automatically.

🎯 Learning Outcomes
Understood how Java + Maven projects are structured and managed

Built a functioning CI/CD pipeline using Jenkins

Automated unit tests and static analysis as part of the DevOps workflow

Gained hands-on exposure to integrating SonarQube with a Maven project

🤝 Contributions
This project was built for self-learning purposes, but if you find it helpful or want to contribute enhancements, feel free to fork the repo and open a pull request!

