def call(String Project, String CredID, String Tagname){
  withCredentials([usernamePassword(
                    credentialsId:"${CredID}",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser"
                    )]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker push ${env.dockerHubUser}/${Project}:${Tagname}"
}
}
