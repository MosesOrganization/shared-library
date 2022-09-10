def call(String repoUrl){
pipeline {
	agent any
	tools {
	   maven 'maven'
	}
	stages {
	    stage("Tools initialixation") {
	        steps {
	            sh 'mvn --version'
	            sh 'jave -version'
	        }
	    }
	    stage("Checkout Code") {
	        steps {
	            git branch: 'main'
	                   url: "${repoUrl}"
	        }
	    }
	    stage("to-test-maven") {
	        steps {
	            sh 'mvn -v'
	        }
	    }
	}
}
}
