from threading import Thread
from time import sleep

class Pinger(Thread):
    def __init__(self):
        super(Pinger, self).__init__()
        self.daemon = True
        self.__killed = False

    def run(self):
        i = 1
        while not self.__killed:
            print(f"{i}. ping")
            sleep(1)
            i += 1

    def kill(self):
        self.__killed = True
        print("pinger killed")

