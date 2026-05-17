def call(String image , String imageTag, String port){
  sh "docker run -d -p ${port}:${port} ${image}:${imageTag}"
}
