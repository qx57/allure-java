node {
    parameters {
        choice(name: 'ENV', choices: ['test', 'preprod'], description: 'Environment')
    }

    timestamps {
        stage('Checkout') {
            checkout scm
        }

        stage('Java Tests') {
            withMaven(jdk: 'default', maven: 'default') {
                sh "mvn clean test -Dmaven.test.failure.ignore=true -Denv=${params.ENV}"
            }
        }

        stage('Wipe') {
            cleanWs()
        }
    }
}