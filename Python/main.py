from car import Car
from account import Account
#primero va el nombre del archivo y luego el nombre de la clase para  importar
if __name__ == "__main__":

car = Car ("AMD123", Account ("Andres Herrera", "docu12345"))

print(vars(car))
Print (vars(car.driver))

    """car = Car ()
    #no se requiere la palabra reservada new car
    car.license = "AMS456"
    car.driver = "Andres Herrera"
    print(vars (car))
    #no se require crear un metodo simplemente con la palabra vars y el objeto como parametro.
    Pepino = Car ()
    Pepino.license = "DFGH124"
    Pepino.driver = "martha v"
    print (vars(Pepino)) """

