from car import car

class UberPool(Car):
    brand = str
    model = str

    def __int__(self, license, driver, brand, model):
        super.__int__(license, driver)
        self.brand = brand
        self.model = model

