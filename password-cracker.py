# This won't quite be used in real life, obviously because a preset pin was given

import random
import time

print("This shows how fast a numerical PIN can be cracked using an RNG")
d=int(input('digits -> '))
fnl=[]

for _ in range(0,d):
    fnl.append('9')
fnl="".join(fnl)
fnl=int(fnl)


def timer(main):
    def wrapper():
        t1=time.time()
        main()
        t2=time.time()-t1
        print(f"The PIN was cracked in {ctr} tries in {t2} seconds.")
    return wrapper


@timer
def main():
    global ctr
    ctr=0
    y=int(input('PIN: '))
    ckd=False #was it cracked or not
    while ckd==False:

        i = random.randint(0,fnl)

        if i == y: 
            ckd=True
        else: 
            print(i)
            ctr+=1
    
main()

