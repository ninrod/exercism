#include "isogram.h"
#include <ctype.h>

bool is_isogram(const char phrase[]) {
  int hm[26] = {0};
  while (*phrase != '\0') {
    if (isalpha(*phrase))
      if ((hm[tolower(*phrase) - 'a'] += 1) > 1)
        return false;
    phrase++;
  }
  return true;
}