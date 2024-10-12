pipeline {
    agent any
    stages {
        stage('First Stage') {
            steps { 
                echo 'Welcome to Opsfusion labs'
            }
        }
    }
}