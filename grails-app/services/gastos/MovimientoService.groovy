package gastos

import grails.transaction.Transactional

@Transactional
class MovimientoService {

    def postMovimiento(Libro libro, String descripcion, Float cantidad) {
        Movimiento movimiento = new Movimiento()
        movimiento.descripcion = descripcion
        movimiento.cantidad = cantidad
        movimiento.libro = libro
        movimiento.save()
    }

    Movimiento getMovimiento(Long movimientoId){
        return Movimiento.findById(movimientoId)
    }

    List<Movimiento> getMovimientos(Libro libro){
        return Movimiento.findAllByLibro(libro)
    }

}
