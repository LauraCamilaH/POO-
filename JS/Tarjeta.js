class Tarjeta extends Payment {

    constructor (id, TipoTarjeta, banco ){
        super(id)
        this.TipoTarjeta = TipoTarjeta
        this.banco = banco

    }
}