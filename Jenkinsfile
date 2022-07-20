pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'Java'
    }
    stages {
        stage ('Code clean') {
          steps {
               sh 'mvn clean'
                }
                }
        stage ('Compile') {
          steps {
                sh 'mvn compile'
                }
                }
        stage ('Run tests') {
          steps {
                sh 'mvn test'
            }
        }
    }
}