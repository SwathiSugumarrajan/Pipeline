	pipeline{
	agent any
	
	 tools {
        jdk 'Java'
    }
	stages {
			stage ('Compile Stage') {
				
				steps{
					sh 'mvn clean compile' 
					}
				}
			stage ('Testing Stage') {
			
				steps{
					sh 'mvn test'
					}
				}
			stage ('Packaging stage') {
			
				steps{
					sh 'mvn package'
					}
				}
			}
		}
				
