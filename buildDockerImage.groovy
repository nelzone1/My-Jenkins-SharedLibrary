// Function for Building Docker Image 

def buildDockerImage() { 

    stage('Build Docker Image') { 

        echo 'Building Docker Image' 

        sh "docker build -t nelzone/portfolio:V${env.BUILD_NUMBER} ." 

        sh "docker tag nelzone/portfolio:V${env.BUILD_NUMBER} nelzone/portfolio:latest" 

    } 

} 

 