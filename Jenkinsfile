node('dockerhost') {
    parameters {
        choice(name: 'ENV', choices: ['test', 'preprod'], description: 'Environment')
    }

    timestamps {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Java Tests') {
            docker.image('maven:latest').inside("--cpus=2 --memory=2G") {
                sh "mvn clean test -Dmaven.test.failure.ignore=true -Denv=${params.ENV}"
            }
        }

        stage('Wipe') {
            cleanWs()
        }
    }
}