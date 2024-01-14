def runCredCheck() {
    // Run OWASP Dependency-Check
    sh 'git leaks -v'
}

