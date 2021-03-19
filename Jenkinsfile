pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                sh 'sudo cp target/web-0.0.1-SNAPSHOT.jar /usr/local/share/JakartaEE-Server.jar'
                sh 'sudo systemctl restart jakarta'
            }
        }

    }
}