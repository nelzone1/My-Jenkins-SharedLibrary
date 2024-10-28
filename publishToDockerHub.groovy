// Function for Publishing to DockerHub 

def publishToDockerHub() { 

    stage('Publish to DockerHub') { 

        echo 'Pushing Docker Image to DockerHub' 

        withCredentials([usernamePassword(credentialsId: 'dockerloginid', usernameVariable: 'DOCKERHUB_USERNAME', passwordVariable: 'DOCKERHUB_PASSWORD')]) { 

            sh "echo \$DOCKERHUB_PASSWORD | docker login -u \$DOCKERHUB_USERNAME --password-stdin" 

            sh "docker push nelzone/portfolio:V${env.BUILD_NUMBER}" 

            sh "docker push nelzone/portfolio:latest" 

        } 

    } 

} 