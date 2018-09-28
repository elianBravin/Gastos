package gastos

class Movimiento {

    static constraints = {
        descripcion(nullable: false)
        cantidad(nullable: false)
    }

    static belongsTo = [
            libro : Libro
    ]

    String descripcion
    Float cantidad
    Date dateCreated
    Date lastUpdated
}
