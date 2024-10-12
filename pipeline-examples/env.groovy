pipeline {
    agent any
    environment {
        // Global environment variables
        APP_NAME = 'MyApplication'
        BUILD_VERSION = '1.0.0'
    }
    stages {
        stage('Build') {
            environment {
                // Stage-specific environment variable
                BUILD_ENV = 'development'
            }
            steps {
                echo "Building ${env.APP_NAME} version ${env.BUILD_VERSION} in ${env.BUILD_ENV} environment."
                // You can also set an environment variable dynamically
                script {
                    env.DYNAMIC_VAR = "Dynamic value set during build"
                    echo "Dynamic variable: ${env.DYNAMIC_VAR}"
                }
            }
        }
        stage('Test') {
            steps {
                echo "Running tests for ${env.APP_NAME} version ${env.BUILD_VERSION}."
            }
        }
    }
}
