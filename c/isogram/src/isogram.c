#include "isogram.h"

bool is_isogram(const char phrase[]) {
  if(strlen(phrase) > 0) {
    return true;
  }
  return false;
}
