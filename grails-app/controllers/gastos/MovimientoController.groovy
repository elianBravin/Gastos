package gastos

class MovimientoController {

    MovimientoService movimientoService

    def postMovimiento(){
        Libro libro = Libro.findById(params.long("idLibro"))
        Map body = request.getJSON()
        if(!(body?.descripcion) || !(body?.cantidad)){
            throw new Exception("body invalido")
        }

        movimientoService.postMovimiento(libro, body.descripcion, body.cantidad as Float)
        body.status = "OK"
        render(contentType: "application/json") {
            body
        }
    }

    def getMovimientos(){
        Long idLibro = params.long("idLibro")
        Libro libro = Libro.findById(idLibro)
        List<Movimiento> response = movimientoService.getMovimientos(libro)
        render(contentType: "application/json") {
            response
        }
    }

    def getMovimiento(){
        Long movimientoId = params.long("idMovimiento")
        Movimiento response = movimientoService.getMovimiento(movimientoId)
        render(contentType: "application/json") {
            response
        }
    }
}
