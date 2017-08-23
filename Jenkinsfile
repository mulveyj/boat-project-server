node {
   stage('Preparation') {
      git 'https://github.com/mulveyj/boat-project-server.git'
   }
   stage('Clean') {
      sh "mvn -Dmaven.test.failure.ignore clean"
   }
   stage('Package') {
      sh "mvn -Dmaven.test.failure.ignore package"
   }
   stage('Docker Build') {
      sh "docker build -t boat-project ."
   }
}