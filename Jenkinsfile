node {
   stage('Slack started') {
           slackSend channel: "#northcoders-java", message: "Yachts started building"
   }
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
   stage('Docker deploy'){
      sh "docker run -d -p 8081:8080 boat-project"
   }
}