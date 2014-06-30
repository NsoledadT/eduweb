import ar.edu.unlam.eduweb.*

class BootStrap {

    def init = { servletContext ->
		
		
		
		def alumnoRole = new Role(authority: 'ROLE_ALUMNO').save(flush: true)
		def profesorRole = new Role(authority: 'ROLE_PROFESOR').save(flush: true) 
	
		
		def testUser1 = new User(username: 'natalia', password: 'tocci') 
		def testUser2 = new User(username: 'lucas', password: 'videla')
		
		testUser1.save(flush: true)
		testUser2.save(flush: true)
		
		UserRole.create testUser2, profesorRole, true
		UserRole.create testUser1, alumnoRole, true
		
		assert User.count() == 2
		assert Role.count() == 2 
		assert UserRole.count() == 2
    }
    def destroy = {
    }
}
