import unittest
import pytest

# For this first exercise, it is really important to be clear about how we are importing names for tests.
# To that end, we are putting a try/catch around imports and throwing specific messages to help students
# decode that they need to create and title their constants and functions in a specific way.
try:
    from play import (palindromo)

# Here, we are separating the constant import errors from the function name import errors
except ImportError as import_fail:
    message = import_fail.args[0].split('(', maxsplit=1)
    item_name = import_fail.args[0].split()[3]
    item_name = item_name[:-1] + "()'"
    # pylint: disable=raise-missing-from
    raise ImportError("\n\nMISSING FUNCTION --> {item_name}") from None

# Here begins the formal test cases for the exercise.
class PlayTest(unittest.TestCase):
    @pytest.mark.task(taskno=1)
    def test_palindromo(self):
        input_data = ["filipe", "mm", "mama", "anilina","sopapos", "ama", "radar"]
        result_data = ["N", "?", "N", "S", "S", "S", "S"]

        for variant, (palavra, expected) in enumerate(zip(input_data, result_data), start=1):
            with self.subTest(f'variation #{variant}', palavra=palavra, expected=expected):
                actual_result = palindromo(palavra)
                failure_msg = (f'Called palindromo({palavra}). ' 
                               f'The function returned {actual_result}, but the tests '
                               f'expected {expected} as the answer.')
                self.assertEqual(actual_result, expected, msg=failure_msg)

