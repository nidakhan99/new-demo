

def cloneRepo(String repoUrl, String branch = 'java7') {
    checkout([$class: 'GitSCM', branches: [[name: branch]], userRemoteConfigs: [[url: repoUrl]]])
}
