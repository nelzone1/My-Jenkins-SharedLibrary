// Function for Docker Login 

def dockerLogin() { 

    stage('Docker Login') { 

        withCredentials([usernamePassword(credentialsId: 'dockerloginid', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) { 

            sh "echo \$DOCKER_PASSWORD | docker login -u \$DOCKER_USERNAME --password-stdin" 

        } 

    } 

} 