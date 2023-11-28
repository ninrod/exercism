"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""

EXPECTED_BAKE_TIME=40

def bake_time_remaining(time_in_the_oven):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - time_in_the_oven

def preparation_time_in_minutes(number_of_layers):
    """calculate time in terms of number of layers.

    :param number_of_layers: int - num. de camadas da lasagna

    :return: int - o tempo que a lasanha deve ficar a mais (eu acho) no forno em função do num. de camadas

    Essa função calcula o tempo de forno de acordo com o número de camdadas da lasanha
    """
    return number_of_layers * 2

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """calcula o elapsed time.
    :param number_of_layers: int - número de layers a ser adicionado na lasagna
    :param elapsed_bake_time: int - number of minutes lasagna has been baking in the oven

    This function should return the total number of minutes you've been cooking, or the sum of your preparation time and the time the lasagna has already spent baking in the oven.
    """
    return elapsed_bake_time + preparation_time_in_minutes(number_of_layers)
