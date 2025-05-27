from time import sleep
from pinger import Pinger
from ponger import Ponger

ping = Pinger()
pong = Ponger()

ping.start()
pong.start()

sleep(6)

ping.kill()
pong.kill()

