def call(String fromname, String toname, ){
  success {
        emailext from: "${fromname}",
                 subject: '$DEFAULT_SUBJECT',
                 body: '$DEFAULT_CONTENT',
                 to: "${toname}"
            
        }
    failure {
        emailext from: "${fromname}",
                 subject: '$DEFAULT_SUBJECT',
                 body: '$DEFAULT_CONTENT',
                 to: "${toname}"
            
    }
}
