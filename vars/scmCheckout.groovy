// Function for SCM Checkout 

def scmCheckout() { 

    stage('SCM Checkout') { 

        echo 'Performing SCM Checkout' 

        checkout([ 

            $class: 'GitSCM', 

            branches: [[name: 'main']], 

            userRemoteConfigs: [[credentialsId: 'gh-token', url: 'https://github.com/nelzone1/portfolio.git']] 

        ]) 

    } 

} 