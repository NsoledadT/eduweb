package ar.edu.unlam.eduweb

import grails.plugin.springsecurity.annotation.Secured

class SecureController {

    @Secured(['ROLE_PROFESOR'])
         def error() {
          render 'PROFESORES SOLAMENTE'
	   }
		 
	@Secured(['ROLE_ALUMNO'])
		 def index() {
			 render 'AlUMNO SOLAMENTE'
		  }
 }

