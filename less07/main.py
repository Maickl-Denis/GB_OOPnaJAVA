from Cat import Cat
from untitled.src.GB_OOPnaJAVA.less07.Dog import Dog
from Owl import Owl


# cat = Cat(name="барсик", age=29, hunger=3)
cat = Cat("барсик", 29)
cat.voice()

dog = Dog("Каштанка", 10)
dog.voice()
print(dog.getAge())

owl =Owl("Акуленыш", 5)
owl.addHunger(5)
owl.addHunger(5)
owl.isHungry()
owl.feed(4)