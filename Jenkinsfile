#!/usr/bin/env groovy
pipeline {
    agent any
    
    options {
        ansiColor('xterm')
    }

    stages { 
        stage('test') {
            steps {
                withGradle{
                    sh './gradlew clean test'
                }              
            }
            post{
                always{
                    junit 'build/test-results/test/TEST-*.xml'
                }
            }
        }
    }
}
