pipeline {
    agent any
    stages {
        stage('Example') {
            input {
                message "Should we continue To Update Docker Image Name?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'DOCKER_IMAGE_NEW_TAG', defaultValue: '12', description: 'Update Webserver Docker Image Tag')
                }
            }
            steps {
                echo "docker image tag webserver:${DOCKER_IMAGE_NEW_TAG} opsfusionlabs/webserver:${DOCKER_IMAGE_NEW_TAG}"
            }
        }
    }
}