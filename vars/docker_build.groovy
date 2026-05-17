def call(String imageName , String imageTag , String dockerHubUsername){
  sh "docker build -t ${dockerHubUsername}/${imageName}:${imageTag} ."
}
