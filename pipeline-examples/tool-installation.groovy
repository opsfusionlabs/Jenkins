pipeline {
    agent any
    tools {
        // Specify the tools required for the pipeline
        maven 'maven-3.9.6' // Example of a Maven tool
    }
    stages {
        stage('checking maven Version') {
            steps {
                sh 'mvn --version' // Running a Maven version command
            }
        }
    }
}
