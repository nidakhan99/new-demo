// vars/gitHelper.groovy

def cloneRepo(String repoUrl, String branch = 'master') {
    checkout([$class: 'GitSCM', branches: [[name: branch]], userRemoteConfigs: [[url: repoUrl]]])
}
