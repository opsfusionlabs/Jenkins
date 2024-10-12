pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    // Load credentials
                    withCredentials([usernamePassword(credentialsId: 'docker_hub', 
                                                      usernameVariable: 'MY_USERNAME', 
                                                      passwordVariable: 'MY_PASSWORD')]) {
                        echo "Building application using username: $MY_USERNAME"
                    }
                }
            }
        }
    }
}
