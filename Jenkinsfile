pipeline {
		agent any
		
		stages {
			
			stage ('Compile State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						bat 'mvn clean install'
					}	
				}
			}	
			
			stage ('Testing State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						bat 'mvn test'
					}	
				}
			}	
			
			stage ('Deployment State') {
				steps {			
					withMaven(maven : 'LOCALMAVEN') {
						bat 'mvn deply'
					}	
				}
			}				
		}
		
}