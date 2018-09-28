package gastos

import grails.transaction.Transactional

@Transactional
class LibroService {

    def postLibro(String descripcion){
        Libro libro = new Libro()
        libro.descripcion = descripcion
        libro.save()
    }

    def getLibros(){
        return Libro.findAll()
    }

    def getLibro(Long libroId){
        return Libro.findById(libroId)
    }
}
