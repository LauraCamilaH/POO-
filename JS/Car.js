//aca no se necesita los tipos de datos en los parametros del constructor, solo lo que quiero.
class Car {
    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    //metodo para impresion la palabra prototype 
    //printDataCar es el nombre del metodo que escogi 
    //luego inbocamos la funcion 
    printDataCar() {
        console.log(this.driver);
        //llamar el account
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log(this.license)
    }
}

