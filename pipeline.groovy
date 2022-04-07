pipeline {
    agent any 
    stages {
        stage('Pull') { 
            steps {
                git 'https://github.com/ShubhamUChoudhary/shubham.git'
            }
        }
        stage('Test') { 
            steps {
                // 
            }
        }
        stage('Deploy') { 
            steps {
                // 
            }
        }
    }
}