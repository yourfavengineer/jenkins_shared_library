def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube-project -Dsonar.projectKey=youtube-project '''
    }
}