package ar.edu.unlam.eduweb

class Comentario {
	User autorComentario
	Date fechaComentario
	String mensajeComentario
	static belongsTo = TemaForo,CategoriaTema; // a que tema del foro, pertenece

    static constraints = {
    }
}
