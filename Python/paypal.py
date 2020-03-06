from payment import Payment
class Paypal(Payment):
    correo = str
    contarseña = str
    def __init__(self, id, correo, contarseña):
        super.__init__(id)
        self.correo = correo
        self.contarseña = contarseña
        