from threading import Thread
from time import sleep

class Ponger(Thread):
    def __init__(self):
        super(Ponger, self).__init__()
        self.daemon = True
        self.__killed = False

    def run(self):
        i = 1
        while not self.__killed:
            print(f"{i}. pong")
            sleep(2)
            i += 1

    def kill(self):
        self.__killed = True
        print("ponger killed")

