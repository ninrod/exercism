#include "isogram.h"

#include <stdio.h>
#include <stdlib.h>

/* void qsort(void* ptr, size_t count, size_t size, int (*comp)(const void*, const void*)); */

bool is_isogram(const char phrase[]) {
  if(strlen(phrase) > 0) {
    return true;
  }
  return false;
}

int main() {
  char *s = "filipe";
  printf("a string é: %s\n", s);
}