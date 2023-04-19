from Animal import Animal
class Cat(Animal):
    def __init__(self, name, age):
        super().__init__(name, age)
        self.hunger = 0

    def voice(self):
        print("mew")