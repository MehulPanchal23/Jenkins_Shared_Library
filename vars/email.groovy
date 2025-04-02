def call(String fromname, String toname){
        emailext from: "${fromname}",
                 subject: '$DEFAULT_SUBJECT',
                 body: '$DEFAULT_CONTENT',
                 to: "${toname}"
}
