import random
name = input("Enter your 7-letter word >> ")
name = name.lower()

ctr=0
while True:
    lst = [chr(random.randint(97, 122)),chr(random.randint(97, 122)),chr(random.randint(97, 122)),chr(random.randint(97, 122)),chr(random.randint(97, 122)),chr(random.randint(97, 122)),chr(random.randint(97, 122))]
    nl = "".join(lst)
    
    if nl == name: 
        print('Name found in {ctr} tries')
        exit()
    else: 
        print(nl)
        ctr+=1
