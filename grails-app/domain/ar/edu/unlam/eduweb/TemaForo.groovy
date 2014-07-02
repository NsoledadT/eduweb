package ar.edu.unlam.eduweb

class TemaForo {
	static belongsTo = Curso
	String titulo
	String mensaje
	Date fecha
	User autorTema
	CategoriaTema categoriaForo
	static hasMany = [comentarios: Comentario]//si categoria ya tiene comentarios para que los necesita esta clase??
	
    static constraints = {
    }
}
