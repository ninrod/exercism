"""prime
gerar um array de primes de 1 até 1000
"""

def is_prime(p):
    for i in range(2,int(p/2)+1):
        if p % i == 0:
            return False
    return True

def primes(n):
    return list(filter(is_prime,range(1,n)))

print(primes(1000))
