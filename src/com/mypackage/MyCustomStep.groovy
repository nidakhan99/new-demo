def runCredCheck() {
    // Run OWASP Dependency-Check
    sh 'gitleaks detect -v'
}
