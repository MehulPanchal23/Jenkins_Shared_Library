def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(
                    credentialsId: "${dockerhubuser}",
                    passwordVariable: "dockerhubpass",
                    usernameVariable: "dockerhubuser"
                    )]){
                sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
                sh "docker image tag "${Project}" ${env.dockerhubuser}/"${Project}""
                sh "docker push "${env.dockerhubuser}"/"${Project}":"${ImageTag}""
}
