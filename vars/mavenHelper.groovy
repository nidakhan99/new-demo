// vars/mavenHelper.groovy

def runMavenTests(String options = '') {
    // Execute Maven test command
    sh "mvn test ${options}"
}
def runDependencyCheck() {
    // Run OWASP Dependency-Check
    sh 'mvn org.owasp:dependency-check-maven:check'
}
