from math import log10, floor


def determine_if_palindrome(input=None):
    """
    Determines if the given integer is a palindrome.

    If the input is None or is a negative integer, we return false.
    :param input:
    :return:
    """
    if input is None or input < 0:
        return False

    num_of_digits = floor(log10(input)) + 1

    while input != 0:

        lsb = input % 10
        msb = input // (10 ** floor(log10(input)))

        if lsb == msb:
            input = (input - (msb * (10 ** (num_of_digits - 1)))) // 10
            num_of_digits = num_of_digits - 2
        else:
            return False

    return True

if __name__ == "__main__":
    x = input("What is your integer?")

    if determine_if_palindrome(x):
        print("Hurrah it is a palindrome.")
    else:
        print("This is not a palindrome!")

