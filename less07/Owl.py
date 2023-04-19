from Animal import Animal
class Owl(Animal):
    def __init__(self, name, age):
        super().__init__(name, age)
        self.hunger = 0

    def addHunger(self, hunger):
        self.hunger += hunger

    def feed(self, hunger):
        self.hunger -= hunger

    def isHungry(self):
        if self.hunger>0:
            print("I`m hungry")
        else:
            print("I`m NOT hungry")