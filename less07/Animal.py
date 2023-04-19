from abc import abstractmethod


class Animal:
    def __init__(self, name, age):
        self.age = age
        self.name = name

    def getName(self):
        return self.name

    def getAge(self):
        return self.age

    def Voice(self):
        pass

    @abstractmethod
    def feed(self, hunger):
        pass
