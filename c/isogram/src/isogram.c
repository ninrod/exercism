#include "isogram.h"
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

bool is_isogram(const char phrase[]) {
  int hm[26] = {0};
  while (*phrase != '\0') {
    if (isalpha(*phrase)) {
      int s = tolower(*phrase) - 'a';
      if ((hm[s] += 1) > 1)
        return false;
    }
    ++phrase;
  }
  return true;
}