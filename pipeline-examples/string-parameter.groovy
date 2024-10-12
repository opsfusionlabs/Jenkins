pipeline {
    agent any
    parameters {
        string(name: 'USER_NAME', defaultValue: 'Guest', description: 'Enter your name')
    }
    stages {
        stage('Welcome Step') {
            steps { 
                echo "Hello, ${params.USER_NAME}! Welcome to OpsfusionLabs."
            }
        }
    }
}
