pipeline {
    agent any
    parameters {
        choice(name: 'Environment_type', choices: ['dev', 'pre-prod', 'qa'], description: 'Select a Environment')
    }
    stages {
        stage('Environment Step') {
            steps { 
                script {
                    def greetingenvironmentName
                    switch (params.Environment_type) {
                        case 'dev':
                            greetingenvironmentName = 'Application is going to deply in Dev Env'
                            break
                        case 'qa':
                            greetingenvironmentName = 'Application is going to deply in Qa Env'
                            break
                        case 'pre-prod':
                            greetingenvironmentName = 'Application is going to deply in Pre-prod Env'
                            break
                    }
                    echo greetingenvironmentName
                }
            }
        }
    }
}
