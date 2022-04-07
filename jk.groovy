pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git branch: 'main', credentialsId: '1', url: 'https://github.com/ShubhamUChoudhary/shubham.git'
            }
        }
        stage('Test') { 
            steps {
                echo 'Hello shubh'
            }
        }
        stage('Deploy') { 
            steps {
                // 
            }
        }
    }
}