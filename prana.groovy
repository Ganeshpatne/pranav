pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Hell') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
