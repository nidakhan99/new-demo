def runDependencyCheck() {
    sh 'mvn dependency-check:check'
}

