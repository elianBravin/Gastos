class UrlMappings {

    static mappings = {
        //por ahora no hay usuarios

        //"/gastos"(controller: "libro", action: "getLibros")

        "/libro"(controller: "libro", parseRequest: true) {
            action = [POST: 'postLibro']
        }

        "/libro/$id"(controller: "libro", parseRequest: true) {
            action = [GET: 'getLibro']
        }

        "/libros"(controller: "libro", parseRequest: true) {
            action = [GET: 'getLibros']
        }

        "/$idLibro/movimiento"(controller: "movimiento", parseRequest: true) {
            action = [POST: 'postMovimiento']
        }

        "/movimiento/$idMovimiento"(controller: "movimiento", parseRequest: true) {
            action = [GET: 'getMovimiento']
        }

        "/libro/$idLibro/movimientos"(controller: "movimiento", parseRequest: true) {
            action = [GET: 'getMovimientos']
        }
        "/ping"(controller: "libro", parseRequest: true){
            action = [GET: 'ping']
        }
    }
}
