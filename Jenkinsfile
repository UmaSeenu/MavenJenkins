pipeline {
    agent any
    tools {
        maven 'maven_3.8.4'
        jdk 'jdk-18.0.1.jdk'
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