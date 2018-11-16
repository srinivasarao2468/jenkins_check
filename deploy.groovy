node{
  stage('checkout'){
    checkout(scm)
    }
  stage('getting_url'){
    sh 'git config remote.origin.url'
  }
}
