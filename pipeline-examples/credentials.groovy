pipeline {
    agent any
  environment { 
   MY_CRED = credentials('docker_hub') 
    }
    stages {
        stage('Load Credentials') {
            steps {
                echo "Username is $MY_CRED_USR"
            }
        }
    }
}