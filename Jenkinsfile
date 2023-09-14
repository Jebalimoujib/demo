pipeline {
  agent any
  tools {
    maven 'maven-3.9.4'
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
  }
}