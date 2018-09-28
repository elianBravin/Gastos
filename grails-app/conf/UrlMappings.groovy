class UrlMappings {

    static mappings = {
        //por ahora no hay usuarios

        //"/gastos"(controller: "libro", action: "getLibros")

        "/gastos/libro"(controller: "libro", parseRequest: true) {
            action = [POST: 'postLibro']
        }

        "/gastos/libro/$id"(controller: "libro", parseRequest: true) {
            action = [GET: 'getLibro']
        }

        "/gastos/libros"(controller: "libro", parseRequest: true) {
            action = [GET: 'getLibros']
        }

        "/gastos/$idLibro/movimiento"(controller: "movimiento", parseRequest: true) {
            action = [POST: 'postMovimiento']
        }

        "/gastos/movimiento/$idMovimiento"(controller: "movimiento", parseRequest: true) {
            action = [GET: 'getMovimiento']
        }

        "/gastos/libro/$idLibro/movimientos"(controller: "movimiento", parseRequest: true) {
            action = [GET: 'getMovimientos']
        }
        "/ping"(controller: "libro", parseRequest: true){
            action = [GET: 'ping']
        }
    }
}
