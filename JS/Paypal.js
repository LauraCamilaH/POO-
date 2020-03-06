class Paypal extends Payment {

    constructor (id, correo, contraseña){
    super(id)
    this.correo = correo;
    this.contreseña = contraseña;
    }

}