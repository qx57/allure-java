node('dockerhost') {
    parameters {
        choice(name: 'ENV', choices: ['test', 'preprod'], description: 'Environment')
    }

    timestamps {
        timeout(60) {
            stage('Checkout') {
                checkout scm
            }

            stage('Java Tests') {
                docker.image('docker.art.lmru.tech/maven:3.6.3-jdk-8').inside {
                    configFileProvider([configFile(fileId: 'lego-backend-tests-settings-xml', variable: 'MAVEN_SETTINGS')]) {
                        try {
                            withAllureUpload(serverId: 'allure-server', projectId: '1', results: [[path: 'allure-results']]) {
                                sh "mvn clean test -Dmaven.test.failure.ignore=true -Denv=${params.ENV}"
                            }
                        } catch(err) {
                            currentBuild.result = 'FAILURE'
                            echo err.getMessage()
                        }
                    }
                }
            }

            stage('Wipe') {
                cleanWs()
            }
        }
    }
}