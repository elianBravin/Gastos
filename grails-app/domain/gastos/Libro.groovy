package gastos

class Libro {

    static constraints = {
    }

    static hasMany = [
            movimientos : Movimiento,
    ]

    String descripcion
    Date dateCreated
    Date lastUpdated
}
