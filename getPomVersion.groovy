def call(pomFilePath){
  def pom = readMavenPom file: "${pomFilePath}"
  version = pom.version
}
