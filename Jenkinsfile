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
   stage('Stop app'){
      sh "docker stop boat-project || true"
      sh "docker rm boat-project || true"
   }
   stage('Docker deploy'){
      sh "docker run -d --name boat-project --link reverent_payne:reverent_payne -p 8081:8080 boat-project"
   }
}