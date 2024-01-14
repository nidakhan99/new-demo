// vars/mavenHelper.groovy

def runMavenTests(String options = '') {
    // Execute Maven test command
    sh "mvn test ${options}"
}
