def call(String Project, String CredID, String Tagname){
  withCredentials([usernamePassword(
                    credentialsId:"${CredID}",
                    passwordVariable: "dockerhubpass",
                    usernameVariable: "dockerhubuser"
                    )]){
                sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
                sh "docker image tag ${Project} ${env.dockerhubuser}/${Project}"
                sh "docker push ${env.dockerhubuser}/${Project}:${Tagname}"
}
}
