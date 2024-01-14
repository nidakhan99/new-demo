def runCodeCoverageCheck() {
    sh 'mvn cobertura:cobertura'
}
