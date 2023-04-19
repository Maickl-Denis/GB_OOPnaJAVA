from time import sleep


class Robot1:
    def __init__(self, name):
        self.state = False
        self.level = 1
        if name:
            self.name = name

    def power(self):
        if not self.state:
            self.state = True
            self.powerOn()
        else:
            self.state = False
            self.powerOff()

    def powerOn(self):
        sleep(1)
        self.startBIOS()
        sleep(1)
        self.startOS()
        sleep(1)
        self.sayHi()
        sleep(1)

    def powerOff(self):
        sleep(1)
        self.sayBya()
        sleep(1)
        self.stopOS()
        sleep(1)
        self.stopBIOS()
        sleep(1)

    def startBIOS(self):
        print("Start BIOS...");

    def startOS(self):
        print("Start OS...")

    def sayHi(self):
        print("Hello world...")

    def sayBya(self):
        print("Bye...")

    def stopOS(self):
        print("Stop OS...")

    def stopBIOS(self):
        print("Stop BIOS...")

    def work(self):
        if self.state:
            print("Working...")
        else:print("Данных от робота не поступает")

    def __str__(self):
        return f"я робот {self.name}, моя квалификация {self.level}"