from Animal import Animal

class Dog(Animal):
    def __init__(self, name, age):
        super().__init__(name, age)
        self.hunger = 0

    def voice(self):
        print("Vuf")