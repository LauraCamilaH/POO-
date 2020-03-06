from payment import Payment

class Tarjeta(Payment):
    tipoTarjeta = str
    banco = str

    def __init__(self, id, tipoTarjeta, banco):
        super.__init__(id)
        self.tipoTarjeta = tipoTarjeta
        self.banco = banco