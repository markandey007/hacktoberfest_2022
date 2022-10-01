def is_prime(num):
    for i in range(2,num):
        if num % i == 0:
            return False
    return True

def print_prime(number):
    for i in range(1, number):
        if (is_prime(i) == True):
            print(i)

user_input = int(input("Input "))
print_prime(user_input)
